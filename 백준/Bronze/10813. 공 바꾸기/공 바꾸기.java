
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // 공 바꾸는 횟수

		int[] bkt = new int[N];

		for(int a = 0; a < N; a++) {
			bkt[a] = a + 1;
		}

		for(int a = 0; a < M; a++) {
			st = new StringTokenizer(br.readLine()); // 인스턴스 추가 생성
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int tmp = bkt[i - 1];
			bkt[i - 1] = bkt[j - 1];
			bkt[j - 1] = tmp;
		}

		for(int b = 0; b < N; b++) {
			bw.write(bkt[b] + " ");
		}

        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

