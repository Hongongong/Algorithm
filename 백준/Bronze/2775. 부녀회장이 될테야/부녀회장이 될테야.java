import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[15];
			for(int q = 1; q <= 14; q++) {
				arr[q] = q;
			}
				
			for(int j = 1; j <= k; j++) {
				for(int l = 2; l <= n; l++) {
					arr[l] = arr[l - 1] + arr[l];
				}
			}
			
			sb.append(arr[n] + "\n");
			
		}
		
		// sb내 내용 화면에 출력
		System.out.println(sb);

		// 마무리(관행적으로 필수)
		br.close();
	}
}
