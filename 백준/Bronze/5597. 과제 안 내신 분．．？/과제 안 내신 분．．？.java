
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int[] arr = new int[28];
		int[] check = new int[30];

		for(int i = 0; i < 28; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			check[arr[i] - 1] = 1;
		}

		for(int i = 0; i < 30; i++) {
			if(check[i] != 1) {
				bw.write((i + 1) + "\n");
			}
		}
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}

