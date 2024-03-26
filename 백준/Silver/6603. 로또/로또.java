import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());

			if (k == 0)
				break;

			int[] s = new int[k];
			for (int i = 0; i < k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
			}

			// 생성된 조합을 저장할 배열
			int[] comb = new int[6];

			// 조합 생성 시작(재귀 호출 시작)
			makeCombination(s, comb, 0, 0, k);

			// 각 테스트 케이스 사이에 빈 줄 출력
			System.out.println();
		}

		br.close();
	}

	// 재귀를 사용해서 조합을 생성하는 메서드
	public static void makeCombination(int[] s, int[] comb, int start, int comb_num, int k) throws IOException {

		// base case : comb 조합의 길이가 6이 되면 출력하고 return
		if (comb_num == 6) {
			for (int i = 0; i < 6; i++) {
				System.out.print(comb[i] + " ");
			}
			System.out.println();
			return;
		}

		// 조합 생성 로직
		for (int i = start; i < k; i++) {
			comb[comb_num] = s[i];
			// 다음 요소 선택을 위해 재귀 호출
			makeCombination(s, comb, i + 1, comb_num + 1, k);
		}

	}

}