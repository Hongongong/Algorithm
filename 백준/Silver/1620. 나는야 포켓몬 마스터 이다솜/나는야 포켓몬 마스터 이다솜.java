import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> nameKey = new HashMap<>();
		HashMap<Integer, String> numKey = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			nameKey.put(name, i + 1);
			numKey.put(i + 1, name);
		}

		for (int i = 0; i < M; i++) {
			String question = br.readLine();
			// 문제가 숫자인지 문자인지 확인
			if (isNumeric(question)) {
				bw.write(numKey.get(Integer.parseInt(question)) + "\n");
			} else {
				bw.write(nameKey.get(question) + "\n");
			}
		}

		bw.flush();

		br.close();
		bw.close();
	}

	// 주어진 문자열이 숫자로만 구성되어있는지 확인하는 메서드
	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}