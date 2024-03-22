import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String str = br.readLine();
			if (str.equals("."))
				break;
			else {
				System.out.println(isBalanced(str) ? "yes" : "no");
			}
		}

		bw.flush();

		br.close();
		bw.close();

	}

	public static boolean isBalanced(String str) {
		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (c == ')' && stack.peek() != '(')
						return false;
					else if (c == ']' && stack.peek() != '[')
						return false;
					stack.pop();
				}
			}
		}

		return stack.isEmpty();
	}
}