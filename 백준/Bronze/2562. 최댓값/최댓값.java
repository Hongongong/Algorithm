
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[9];
        
        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());    
        }
        
        int max = 0;
        int idx = 0;
        
        for(int i = 0; i < 9; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i + 1;
            }
        }
        
        bw.write(max + "\n" + idx);
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
