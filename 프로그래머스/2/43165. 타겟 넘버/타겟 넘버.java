class Solution {
    public int solution(int[] numbers, int target) {
        return sumCnt(numbers, target, 0, 0);
    }
    
    // 재귀적으로 숫자를 더하거나 빼면서 타겟 넘버를 만드는 경우의 수를 계산하는 메서드
    int sumCnt(final int[] numbers, final int target, int index, int sum) {
        // base case : 모든 숫자를 다 사용했을 때
        if(index == numbers.length) {
            if(sum == target) return 1; // 경우의 수
            else return 0;
        }
        
        return sumCnt(numbers, target, index + 1, sum + numbers[index]) 
            + sumCnt(numbers, target, index + 1, sum - numbers[index]);
    }
}