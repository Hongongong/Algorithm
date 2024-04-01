import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 매번 sort하지 않아도, min 값을 유지하려면 => min 힙 사용
        Queue<Integer> list = new PriorityQueue<>();
        
        for(int s : scoville) list.offer(s);
        
        int answer = 0; // 스코빌 지수를 섞은 횟수
        
        while(list.size() >= 2 && list.peek() < K) {
            int n1 = list.poll();
            int n2 = list.poll();
            int n3 = n1 + n2 * 2;
            list.offer(n3);
            answer++;
        }
        
        if(list.peek() < K ) return - 1;
        
        return answer;
    }
}