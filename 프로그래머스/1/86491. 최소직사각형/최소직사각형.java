class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxW = 0;
        int maxH = 0;
        
        int w = 0;
        int h = 0;
        
        for(int[] size : sizes) {
            w = Math.max(size[0], size[1]); // 두 면 중 긴 면을 가로로
            h = Math.min(size[0], size[1]); 
            
            if(maxW < w) maxW = w;
            if(maxH < h) maxH = h;
        }
        
        answer = maxW * maxH;
        
        return answer;
    }
}