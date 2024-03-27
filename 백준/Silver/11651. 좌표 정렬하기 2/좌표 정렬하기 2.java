import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
	int x; // x 좌표
	int y; // y 좌표

	@Override
	public int compareTo(Point o) {
		if (this.y == o.y)
			return this.x - o.x; // y좌표가 같으면 x좌표로 정렬
		return this.y - o.y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받을 좌표의 개수 N 입력 받기
		int N = Integer.parseInt(br.readLine());

		// Point 객체 배열 초기화
		Point[] points = new Point[N];

		// N개의 점에 대한 정보 입력받기
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			points[i] = new Point(x, y); // Point 객체 생성 및 배열에 추가
		}

		// Arrays.sort 메서드 사용해서 Point 객체 배열 정렬
		// Point 클래서에서 정의한 compareTo 메서드에 따라 정렬됨
		// 데이터가 많은 경우 퀵 정렬 보다 빠름
		Arrays.sort(points);

		// 퀵 정렬 수행
		// quickSort(points, 0, N - 1);

		// 정렬된 점들 출력
		for (Point p : points) {
			System.out.println(p.x + " " + p.y);
		}

		br.close();
	}

	// 퀵 정렬 함수
	public static void quickSort(Point[] arr, int start, int end) {
		if (start >= end)
			return; // base case

		int pivot = partition(arr, start, end);

		quickSort(arr, start, pivot - 1); // pivot 좌측 그룸 quickSort
		quickSort(arr, pivot + 1, end); // pivot 우측 그룹 quickSort
	}

	private static int partition(Point[] arr, int start, int end) {
		Point pivot = arr[end]; // 배열의 가장 오른쪽 요소를 pivot으로 선택
		int i = start - 1; // i는 pivot보다 작은 요소들의 마지막 인덱스

		for (int j = start; j < end; j++) {
			// 현재 요소가 pivot 보다 작거나 같으면 i를 증가시키고 pivot보다 작은 요소들 마지막에 추가
			if (arr[j].compareTo(pivot) <= 0) {
				i++;
			}

			// arr[i]와 arr[j](현재) 교환
			Point tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		// pivot 위치를 pivot 보다 작은 요소들 위치 마지막에 추가
		Point tmp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = tmp;

		return i + 1; // pivot 인덱스 반환

	}

}
