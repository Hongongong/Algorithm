
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int v = Integer.parseInt(br.readLine());

		int cnt = 0;

		for(int i = 0; i < N; i++) {
			if(v == Integer.parseInt(arr[i])) {
				cnt++;
			}
		}

		bw.write(cnt +"\n");
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}

