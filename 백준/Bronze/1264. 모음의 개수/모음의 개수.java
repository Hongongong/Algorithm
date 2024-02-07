import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String eng = br.readLine();
		

		while(eng.charAt(0) != '#') {
			int length = eng.length();
			int cnt = 0;
			eng = eng.toLowerCase();

			for(int i = 0; i < length; i++) {
				if(eng.charAt(i) == 'a' | eng.charAt(i) == 'e' | eng.charAt(i) == 'i' | eng.charAt(i) == 'o' | eng.charAt(i) == 'u') {
					cnt++;
				}
			}
			bw.write(cnt + "\n");

			eng = br.readLine();
		}

        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)

	    br.close();
		bw.close();
		
		
	}
}

