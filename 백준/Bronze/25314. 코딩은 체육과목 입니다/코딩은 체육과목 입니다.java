
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int N = Integer.parseInt(br.readLine());

		for(int i = N / 4; i > 0; i--) {
			bw.write("long ");
		}

		bw.write("int");
		
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

