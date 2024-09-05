import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int y = Integer.parseInt(br.readLine());

		if(y % 4 == 0 && y % 100 != 0) {
			bw.write("1");
		} else if(y % 400 == 0) {
			bw.write("1");
		} else {
			bw.write("0");
		}

		// 출력버퍼를 화면에 출력
		bw.flush();

		// 마무리(관행적으로 필수)
		br.close();
		bw.close();

	}
}
