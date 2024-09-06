import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int score = Integer.parseInt(br.readLine());
//		int b = Integer.parseInt(st.nextToken());

		if(score >= 90 && score <=100) {
			sb.append("A");
		} else if(score >=  80 && score <= 89) {
			sb.append("B");
		} else if(score >=  70 && score <= 79) {
			sb.append("C");
		} else if(score >=  60 && score <= 69) {
			sb.append("D");
		} else {
			sb.append("F");
		}

		// sb내 내용 화면에 출력
		System.out.println(sb);

		// 마무리(관행적으로 필수)
		br.close();
	}
}
