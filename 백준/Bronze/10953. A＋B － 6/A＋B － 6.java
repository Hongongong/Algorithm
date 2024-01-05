
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){ 
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            bw.write(sum + "\n");
        }    
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
