
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()); // 첫번째 줄 입력
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine()); // 두번째 줄 입력
        
        int[] nums = new int[N];
        
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i : nums) {
            if(i < X) {
                bw.write(i + " ");   
            }
        }
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
