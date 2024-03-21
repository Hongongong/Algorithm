import java.util.*;

class Solution {
    public int[] solution(long n) {
        // 배열의 원소 갯수를 미리 알 수 없으니 List 사용
        List<Integer> list = new LinkedList<>();
        
        // n에서 제일 마지막 수부터 잘라내서 list에 순서대로 넣기
        while(n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }
            
        // list를 배열로 변환해서 리턴
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}