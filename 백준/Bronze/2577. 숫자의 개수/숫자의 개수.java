
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		String result = String.valueOf(A * B * C);
		int length = result.length();

		int[] arr = new int[10];
		Arrays.fill(arr, 0);

		
		for(int i = 0; i < length; i++) {
			int idx = Character.getNumericValue(result.charAt(i));
			arr[idx]++;
		}

		for(int i = 0; i < 10; i++) {
			bw.write(arr[i] + "\n");
		}
		
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

