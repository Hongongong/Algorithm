
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int T = Integer.parseInt(br.readLine());
        
        int[] sumArr = new int[T];
        
        for(int i = 0; i < T; i++){ 
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sumArr[i] = A + B;
            bw.write(sumArr[i] + "\n");
        }    
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
