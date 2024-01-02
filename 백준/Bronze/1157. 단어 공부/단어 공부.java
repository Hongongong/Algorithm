
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String words = br.readLine().toUpperCase();
        
        int length = words.length();
        int[] alpCnt = new int[26]; // a~z 총 26개
        
        for(int i=0; i < length; i++) {
            alpCnt[words.charAt(i) - 'A']++;
        }
        
        int maxIndex = 0; // 'A'가 최대 개수 알파벳이라고 가정
        boolean flag = false; // 같은 개수의 알파벳이 있는지 확인하기 위함
        
        for(int i = 1; i < 26; i++) {
            if(alpCnt[i] == alpCnt[maxIndex]) {
                flag = true;
            } else if(alpCnt[i] > alpCnt[maxIndex]) {
                maxIndex = i;
                flag = false;
            }
        }
        
        if(flag) bw.write("?");
        else bw.write((char)('A' + maxIndex));
        
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}