import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String rom = br.readLine();
			int length = rom.length();
			int j = 0;

			if(rom.equals("0")) break;

			for(int i = length - 1; i >= length / 2; i--) {
				if(rom.charAt(i) != rom.charAt(j)) {
					bw.write("no\n");
					break;
				}
				j++;
				if(i == length / 2) bw.write("yes\n");
			}
		}

		// 출력버퍼를 화면에 출력
		bw.flush();

		// 마무리(관행적으로 필수)
		br.close();
		bw.close();

	}
}
