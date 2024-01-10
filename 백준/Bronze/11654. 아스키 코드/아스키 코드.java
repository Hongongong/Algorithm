
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int asc = br.readLine().charAt(0); // readLine은 string으로 받음 -> char로 변형 -> int로 변형
        
        bw.write(asc + "\n"); // 아스키코드 그대로 출력하면 해당하는 문자로 출력됨
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
