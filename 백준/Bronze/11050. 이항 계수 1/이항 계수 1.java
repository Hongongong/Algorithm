import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		sb.append(factorial(n) / (factorial(n - k) * factorial(k)));
		
		// sb내 내용을 화면에 출력
		System.out.println(sb);

		// 마무리(관행적으로 필수)
		br.close();
	}
	
	public static int factorial(int n) {
		
		int sum = 1;
		for(int i = n; i > 1; i--) {
			sum *= i;
		}
		
		return sum;
	}
}
