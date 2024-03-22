import java.util.*;

class Solution {
    boolean solution(String s) {
        
        // 문자의 스택을 생성
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
           if(c == '(') // '(' 문자는 스택에 추가
               stack.push(c);
           else // ')' 문자인 경우 
           {
               try { 
                   stack.pop();
               } catch (Exception e) {
                   return false;
               }
           }
        }
        
        if(stack.isEmpty()) return true;
        else return false;
        
    }
}