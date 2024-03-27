import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pay = Integer.parseInt(br.readLine());

		int[] coins = new int[] { 500, 100, 50, 10, 5, 1 };

		int cnt = 0;
		int money = 1000 - pay;
		for (int i = 0; i < 6; i++) {
			if (money >= coins[i]) {
				cnt += money / coins[i];
				money %= coins[i];
			}
		}

		System.out.println(cnt); // 잔돈에 포함된 잔돈 개수

		br.close();
	}

}
