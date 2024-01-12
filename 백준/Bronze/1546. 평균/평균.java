
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int N = Integer.parseInt(br.readLine());
		double[] score = new double[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		double M = 0;
		for(int i = 0; i < N; i++) {
			if(score[i] > M) M = score[i];
		}

		double sum = 0;
		for(int i = 0; i < N; i++) {
			sum += (score[i] / M * 100);
		}

		System.out.println(sum / (double)N);

        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

