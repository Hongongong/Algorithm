
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			int length = S.length();

			for(int j = 0; j < length; j++) {
				for(int k = 0; k < R; k++) {
					bw.write(S.charAt(j));
				}
			}

			bw.write("\n");
		}

		
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

