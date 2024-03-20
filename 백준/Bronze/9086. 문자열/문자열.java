import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		char[][] result = new char[T][2];

		for (int i = 0; i < T; i++) {
			String str = sc.next();
			result[i][0] = str.charAt(0);
			result[i][1] = str.charAt(str.length() - 1);
		}

		for (int i = 0; i < T; i++) {
			System.out.println("" + result[i][0] + result[i][1]);
		}
	}
}