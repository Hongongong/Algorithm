import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken()); // 몇 층 호텔인지
			int W = Integer.parseInt(st.nextToken()); // 한 층에 객실이 몇개인지
			int N = Integer.parseInt(st.nextToken()); // 몇번째 손님인지

			if(N % H == 0) bw.write((H * 100) + (N / H) + "\n");
			else bw.write(((N % H) * 100) + (N / H + 1) + "\n");
		}

        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

