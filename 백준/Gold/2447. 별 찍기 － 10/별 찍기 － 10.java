import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static char[][] stars;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 패턴의 크기 N을 입력받음
		int N = Integer.parseInt(br.readLine());
		// 패턴 크기만큼 배열 생성
		stars = new char[N][N];

		// 초기화 : 모든 칸을 공백으로 채움
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				stars[i][j] = ' ';
			}
		}

		// 재귀적으로 별 찍기
		makeStars(0, 0, N);

		// 결과 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(stars[i][j]);
			}
			bw.write("\n");
		}

		bw.flush();

		br.close();
		bw.close();
	}

	/*
	 * 별 찍기 재귀 함수
	 * 
	 * @param x : 시작 x 좌표
	 * @param y : 시작 y 좌표
	 * @param size : 현재 패턴 크기
	 */
	private static void makeStars(int x, int y, int size) {
		// base case : size 가 1이면 별 하나 찍기
		if (size == 1) {
			stars[x][y] = '*';
			return;
		}

		int newSize = size / 3; // 다음 단계 패턴의 크기
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue; // 중앙 공백으로 남겨놓기
				else {
					// 나머지 영역에 대해 재귀적으로 별 찍기
					makeStars(x + newSize * i, y + newSize * j, newSize);
				}
			}
		}
	}

}