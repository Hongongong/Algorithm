import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5}, // patterns[0].length = 5
            {2, 1, 2, 3, 2, 4, 2, 5},  // patterns[1].length = 8
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} // patterns[2].length = 10
        };
        
        // 각 수포자의 점수를 저장할 배열
        int[] scores = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < 3; j++) {
                if(answers[i] == patterns[j][i%patterns[j].length])
                    scores[j]++; // 정답과 패턴이 일치하면 점수 증가
            }
        }
        
        // 가장 높은 점수 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 가장 높은 점수를 받은 사람 찾기
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(scores[i] == maxScore) {
                list.add(i + 1); // 수포자 번호 = 인덱스 + 1;
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}