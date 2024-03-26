class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // commands의 각 요소에 대해 연산 수행
        for(int i = 0; i < commands.length; i++) {
            // array, [i, j, k] 저장, i, j, k는 start, end, k로 저장
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] -1;
            
            // array의 i부터 j까지 자른 후 배열에 담아
            int[] tempArr = new int[end - start];
            for(int j = 0; j < tempArr.length; j++) {
                tempArr[j] = array[start + j];
            }
            
            // 임시배열 버블 정렬 수행
            bubbleSort(tempArr);
            
             // 정렬된 배열의 k번째 요소를 answer에 저장
            answer[i] = tempArr[k];
        }
    
        
        return answer;
    }
    
    // 버블 정렬 메소드
    public void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}