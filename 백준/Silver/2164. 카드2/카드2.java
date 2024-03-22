import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<Integer> queue = new ArrayDeque<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		while (queue.size() >= 2) {
			queue.removeFirst();
			queue.offer(queue.removeFirst());
		}

		bw.write(queue.getFirst() + "");

		bw.flush();

		br.close();
		bw.close();
	}

}
