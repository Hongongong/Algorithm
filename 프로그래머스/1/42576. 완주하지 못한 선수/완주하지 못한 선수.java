import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> players = new HashMap<>();
        
        for(String p : participant) {
            players.put(p, players.getOrDefault(p, 0) + 1);
        }
        for(String c : completion) {
            players.put(c, players.getOrDefault(c, 0) - 1);
        }
        
         for(String p : participant) {
            if(players.get(p) != 0) {
                answer = p;
            }
        }
        
        
        return answer;
    }
}