
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {
			String ox = br.readLine();
			int length = ox.length();
			int[] score = new int[length];
			int sum = 0;
			
			for(int j = 0; j < length; j++) {
				if(j == 0) {
					 if(ox.charAt(0) == 'O') score[0] = 1;
					 else score[0] = 0;
				}
				else {
					if(ox.charAt(j) == 'O') score[j] = score[j-1] + 1;
					else score[j] = 0;
				}
			}
			
			for(int j = 0; j < length; j++) {
				sum += score[j];
			}
			bw.write(sum + "\n");
		}
		
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

