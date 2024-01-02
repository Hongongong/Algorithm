import java.io.*;
//BufferedReader,InputStreamReader, IOException 세개 필요함 
import java.util.*;
// StringTokenizer 불러오기

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    // 입력
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 입력 준비
	    
	    int T = Integer.parseInt(br.readLine());
	    
	    /*
	    // 방법 1(sb 사용)
	    StringBuilder sb = new StringBuilder(); // 빠른 출력 준비
	    
	    for(int i = 0; i < T; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        sb.append(a + b + "\n");
	    }
		
		System.out.println(sb);
		
		*/
		
		
		// 방법 2(bw 사용)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
         for(int i = 0; i < T; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        bw.write(a + b + "\n");
	    }
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}