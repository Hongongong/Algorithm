class Solution {
    // 결과 저장할 변수
    private int cnt = 0;
    // 각 열의 퀸의 위치
    private int[] position;
    
    public int solution(int n) {
        position = new int[n]; // 체스판 크기에 맞게 배열 생성
        // 첫번째 퀸부터 배치 시작
        placeQueen(0, n);
        
        return cnt; // 모든 가능한 배치의 수 반환
    }
    
    // 퀸을 배치하는 메서드, row는 현재 행, n은 체스판 크기
    private void placeQueen(int row, int n) {
        // base case : 모든 행에 퀸을 배치했을때(하나의 유효한 방법을 찾은 것)
        if(row == n) {
            cnt++; // 방법 수를 1 증가
            return ;
        }
        
        // 재귀 호출
        // 현재 행의 각 열에 퀸을 배치해봄
        for(int col = 0; col < n; col++) {
            // 배치 가능한 위치라면
            if(isValid(row, col)) {
                position[row] = col; // 현재 행에 퀸을 배치
                placeQueen(row + 1, n); // 다음 행에 퀸 배치 시도
            }
        }
    }
    
    // 현재 위치에 퀸을 배치할 수 있는지 검사하는 메서드
    private boolean isValid(int row, int col) {
        for(int i = 0; i < row; i++) {
            // 같은 열에 다른 퀸이 있거나, 대각선에 퀸이 있는지 검사
            if(position[i] == col || Math.abs(row - i) == Math.abs(col - position[i]))
                return false; // 배치 불가
        }
        return true; // 배치 가능
    }
}