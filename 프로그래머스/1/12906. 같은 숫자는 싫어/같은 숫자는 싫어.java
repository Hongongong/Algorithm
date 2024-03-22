import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        LinkedList<Integer> list = new LinkedList<>();
        
        int preNum = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != preNum) {
                list.add(arr[i]);
                preNum = arr[i];
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        // 리스트를 배열로 변환해서 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}