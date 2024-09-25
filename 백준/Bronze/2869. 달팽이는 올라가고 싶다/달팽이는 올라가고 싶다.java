import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int days = 1;
		
		if(v == a) {
			
		} else if((v - a) < (a - b)) {
			days++;
		} else if((v - a) % (a - b) == 0){
			days += (v - a) / (a - b);
		} else {
			days += (v - a) / (a - b) + 1;
		}
		
		sb.append(days);
		
		// sb내 내용을 화면에 출력
		System.out.println(sb);

		// 마무리(관행적으로 필수)
		br.close();
	}
}
