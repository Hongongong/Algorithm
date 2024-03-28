class Solution {
    public int solution(String name) {
        int answer = 0; // 총 조작 횟수
        
        int length = name.length();
        int minMove = length - 1; // 최소 좌우 이동 횟수(처음부터 끝까지 이동할 경우)
        for(int i = 0; i < length; i++) {
            // 각 알파벳에 대한 상하 조작 횟수
            char target = name.charAt(i);
            int upDownCount = Math.min(target - 'A', 'Z' - target + 1);
            answer += upDownCount;
            
            // 다음 문자가 A인 경우 커서 이동 최소화 계산
            int nextIdx = i + 1;
            while(nextIdx < length && name.charAt(nextIdx) == 'A') {
                nextIdx++;
            }
            // 'A'가 연속될때 최소 좌우 이동 횟수 수정(돌아가는게 빠른지 확인)
            // 'A'가 연속되는 지점을 만났을 때
            //    다시 앞으로 되돌아가서 뒤로 A가 끝나는 지점으로 돌아가는 경우를 check
            minMove = Math.min(minMove, i * 2 + (name.length() - nextIdx));
            
            // 아예 처음부터 문자열 끝으로 가서 'A' 뒤쪽 문자열 처리하고 다시 앞으로 돌아와서 
            //      나머지 문자열 처리하는 경우 check
            minMove = Math.min(minMove, (name.length() - nextIdx) * 2 + i);
        }
        
        answer += minMove; // 최소 좌우 이동 횟수 더함
        
        return answer;
    }
}