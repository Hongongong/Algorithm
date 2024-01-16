
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // 역순으로 바꿀 횟수

		int[] bkt = new int[N];

		for(int a = 0; a < N; a++) {
			bkt[a] = a + 1;
		}

		for(int a = 0; a < M; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1; // 역순으로 바꿀 시작점
			int j = Integer.parseInt(st.nextToken()) - 1; // 역순으로 바꿀 끝점

			int tmp = 0;
			
			while(i < j) {
				tmp = bkt[i];
				bkt[i] = bkt[j];
				bkt[j] = tmp;
				i++;
				j--;
			}
		}

		for(int a = 0; a < N; a++) {
			bw.write(bkt[a] + " ");
		}

        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

