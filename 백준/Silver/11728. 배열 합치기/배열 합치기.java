import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] merge = new int[N + M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			merge[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = N; i < N + M; i++) {
			merge[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(merge);

		StringBuilder sb = new StringBuilder();

		for (int num : merge) {
			sb.append(num + " ");
		}

		System.out.println(sb);

		// bw.write(sb.toString());

		// bw.flush();

		br.close();
		// bw.close();
	}

}
