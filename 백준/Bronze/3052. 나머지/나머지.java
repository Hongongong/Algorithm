
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		Set<Integer> set = new HashSet<>(); // 집합 인스턴스 set 생성

		for(int i = 0; i < 10; i++) {
			int A = Integer.parseInt(br.readLine());
			set.add(A % 42);
		}

		bw.write(set.size() + " ");
		
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}
}

