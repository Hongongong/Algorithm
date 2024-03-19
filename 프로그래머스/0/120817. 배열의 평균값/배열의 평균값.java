class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int sum = 0;
        for(double n : numbers) {
            sum += n;
        }
        
        answer = (sum + 0.0) / numbers.length;
        
        return answer;
    }
}