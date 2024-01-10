
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String words = br.readLine();
        
        int length = words.length(); // 입력받은 단어 길이
        int[] alpArr = new int[26]; // a ~ z 총 26개
        
        Arrays.fill(alpArr, -1);
        
    
        for(int i = 0; i < length; i++) {
            if(alpArr[words.charAt(i) - 'a'] == -1) {
                alpArr[words.charAt(i) - 'a'] = i;
            }
        }
        
        for(int i = 0; i < 26; i++) {
            bw.write(alpArr[i] + " ");
        }

        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
