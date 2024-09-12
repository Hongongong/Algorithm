import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int i = 1;
		int j = 1;
		
		while (i < n) {
			cnt++;
			i = i + 6 * j;
			j++;
		}
		
		sb.append(cnt);
		
		// sb내 내용 화면에 출력
		System.out.println(sb);

		// 마무리(관행적으로 필수)
		br.close();
	}
}
