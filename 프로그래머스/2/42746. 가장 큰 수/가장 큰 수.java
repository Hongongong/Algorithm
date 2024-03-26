class Solution {
    public String solution(int[] numbers) {
        // 숫자를 문자열로 변환
        String[] strs = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        
        // 문자열 배열을 퀵 정렬
        quickSort(strs, 0, strs.length - 1);
        
        // 정렬된 문자열 배열을 이어붙여 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str);
        }
        
        // 모든 숫자가 0인 경우를 체크하여 "0" 반환
        String answer = sb.toString();
        return answer.startsWith("0")? "0" : answer;
        
    }
    
    // 퀵 정렬 메소드
    private static void quickSort(String[] arr, int start, int end) {
        if(start >= end) return;
        
        int pivot = partition(arr, start, end);
        
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
        
    }
    
    private static int partition(String[] arr, int start, int end) {
        String pivot = arr[end];
        int i = start - 1;
        
        for(int j = start; j < end; j++) {
            // 두 문자열을 이어 붙였을때 더 큰 숫자를 만드는 조건
            if((arr[j] + pivot).compareTo(pivot + arr[j]) > 0) {
                i++;
                
                // arr[i]와 arr[j]를 교환
                String tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        
        String tmp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = tmp;
        
        return i + 1;
    }
}