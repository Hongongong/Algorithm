
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n; i++) {
			for(int j = i; j > 0; j--) {
				bw.write("*");
			}
			for(int k = 0; k < 2; k++) {
				for(int j = n - i; j > 0; j--) {
					bw.write(" ");
				}
			}
			for(int j = i; j > 0; j--) {
				bw.write("*");
			}
			bw.write("\n");	
		}

		for(int i = n - 1; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				bw.write("*");
			}
			for(int k = 0; k < 2; k++) {
				for(int j = n - i; j > 0; j--) {
					bw.write(" ");
				}
			}
			for(int j = i; j > 0; j--) {
				bw.write("*");
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

