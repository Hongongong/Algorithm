
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken()); // 바구니 개수 N개

		int M = Integer.parseInt(st.nextToken()); // 공을 넣을 횟수 
		
		int[] bkt = new int[N]; // 바구니 배열
		Arrays.fill(bkt, 0);
		
		for(int a = 0; a < M; a++) {
			st = new StringTokenizer(br.readLine()," "); // st 재사용 시 인스턴스만 추가 생성
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			for(int b = i - 1; b < j; b++) {
				bkt[b] = k;
			}
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

