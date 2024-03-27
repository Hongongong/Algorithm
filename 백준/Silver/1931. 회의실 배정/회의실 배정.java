import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting> {
	int start;
	int end;

	public Meeting(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Meeting o) {
		// 끝나는 시간이 같으면 시작 시간이 빠른 순서로
		if (this.end == o.end)
			return this.start - o.start;

		return this.end - o.end;
	}

}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Meeting[] meets = new Meeting[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			meets[i] = new Meeting(start, end);
		}

		Arrays.sort(meets); // 끝나는 시간 기준 회의 정렬

		int cnt = 0; // 최대 사용할 수 있는 회의 수
		int preEnd = 0; // 이전 회의의 끝나는 시간

		for (Meeting meet : meets) {
			// 현재 회의의 시작 시간이 이전 회의 끝나는 시간보다 늦거나 같다면
			if (meet.start >= preEnd) {
				preEnd = meet.end; // 이전 회의 끝나는 시간을 이번 현재 회의 끝나는 시간으로 업데이트
				cnt++; // 회의 수 카운트 증가
			}
		}

		System.out.println(cnt);

		br.close();
	}

}