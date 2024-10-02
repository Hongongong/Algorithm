import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int i = 1;
		int j = 1;

		while (true) {
			if(String.valueOf(i).contains("666")) {
				if(j == n) {
					sb.append(i);
					break;
				} else {
					j = j + 1;
				}
			}
			
			i = i + 1;
		}

		System.out.println(sb);

		br.close();
	}
}