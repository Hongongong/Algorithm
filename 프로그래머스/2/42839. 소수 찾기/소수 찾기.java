import java.util.*;

class Solution {
    public int solution(String numbers) {
        // 숫자 조합을 저장할 Set 생성(중복 제거)
        Set<Integer> numSet = new HashSet<>();
        
        // 빈 prefix로 시작하여 numbers로 만들 수 있는 모든 숫자 조합 생성
        permutation("", numbers, numSet);
        
        int cnt = 0; // 소수 개수 세는 변수
        // numSet에 저장된 모든 숫자에 대해 소수인지 확인
        for(int num : numSet) {
            // 소수 판별
            if(isPrime(num)) {
                cnt++; // 소수이면 카운트 증가
            }
        }
        
        return cnt;
    }
    
    private static void permutation(String prefix, String str, Set<Integer> numSet) {
        int n = str.length(); // 남은 숫자 문자열의 길이를 n에 저장
        
        // prefix가 비어있는지 확인
        //  prefix가 비어있지 않으면, 숫자 조합이 이미 생성된 경우
        //      prefix를 Integer로 변환하여 numberSet에 추가
        if(!prefix.equals("")) {
            numSet.add(Integer.parseInt(prefix));
        }
        
        // 남은 문자열 순회 => 자기 자신을 다시 호출
        for(int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), numSet);
        }
    }
    
    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}