import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	/*
	 * fibonacci()
	 * n번째 피보나치 수를 반환하는 메서드
	 * 
	 * @param n : 계산하고자 하는 피보나치 수열의 인덱스
	 * @return : n번째 피보나치 수
	 */
	public static int fibonacci(int n) {
		// 종료 조건(base case) : n이 0/1이면 0/1을 반환
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		// 재귀 호출 : n번째 피보나치 수는 (n-1)번째와 (n-2)번째 수의 합
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(fibonacci(Integer.parseInt(br.readLine())) + "");

		bw.flush();

		br.close();
		bw.close();
	}
}
