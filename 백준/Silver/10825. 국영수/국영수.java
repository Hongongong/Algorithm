import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
	String name;
	int korean, english, math;

	public Student(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	@Override
	public int compareTo(Student o) {
		if (this.korean != o.korean)
			return o.korean - this.korean;

		if (this.english != o.english)
			return this.english - o.english;

		if (this.math != o.math)
			return o.math - this.math;

		return this.name.compareTo(o.name);

	}

}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		// N개의 데이터 입력 받기
		Student[] students = new Student[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		// 퀵 정렬로 정렬 수행
		quickSort(students, 0, N - 1);

		// 정렬된 학생 정보 출력
		for (Student student : students) {
			bw.write(student.name + "\n");
		}

		bw.flush();

		br.close();
		bw.close();
	}

	public static void quickSort(Student[] students, int start, int end) {
		if (start >= end)
			return;

		int pivot = partition(students, start, end);

		quickSort(students, start, pivot - 1);
		quickSort(students, pivot + 1, end);

	}

	private static int partition(Student[] students, int start, int end) {
		// 마지막 요소를 pivot으로 선택
		Student pivot = students[end];

		int i = start - 1; // pivot 이전의 마지막 요소의 인덱스 초기화

		for (int j = start; j < end; j++) {
			if (students[j].compareTo(pivot) <= 0) {
				i++;
				// pivot 왼쪽으로 이동, swap 교환
				Student tmp = students[i];
				students[i] = students[j];
				students[j] = tmp;
			}
		}
		// pivot swap
		Student tmp = students[i + 1];
		students[i + 1] = students[end];
		students[end] = tmp;

		return i + 1;

	}

}