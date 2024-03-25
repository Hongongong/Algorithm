import java.util.*;

class Solution {
    // 옮기는 방법을 저장할 리스트
    private ArrayList<int[]> moveList = new ArrayList<>(); // [from, to]
    
    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        
        int[][] answer = new int[moveList.size()][2];
        
        // 결과 list를 배열에 저장
        for(int i = 0; i < moveList.size(); i++) {
            answer[i] = moveList.get(i);
        }
        
        return answer;
    }
    
    private void hanoi(int n, int from, int to, int middle) {
        // 재귀 종료 조건
        if(n == 1) {
            moveList.add(new int[] {from, to});
            return ;
        }
        
        // n - 1개의 원반을 중간 기둥으로 옮기기
        hanoi(n - 1, from, middle, to);
        // 가장 큰 원반을 목표 기둥으로 옮기기
        moveList.add(new int[] {from, to});
        // 중간 기둥에 있는 n-1개의 원판을 목표 기둥으로 옮기기
        hanoi(n - 1, middle, to, from);
        
    }
}