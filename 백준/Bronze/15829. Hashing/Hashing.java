import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static final int MOD = 1_234_567_891;
	static final int R = 31;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int l = Integer.parseInt(br.readLine());

		String s = br.readLine();
		
		char[] alpabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u' , 'v', 'w', 'x', 'y', 'z'};
		
		long hash = 0;
		long mul = 1;
		for(int i = 0; i < l; i++) {
			hash += (s.charAt(i) - 'a' + 1) * mul % MOD;
			hash %= MOD;
			mul = mul * R % MOD;
		}
		
		sb.append(hash);
		
		// sb내 내용 화면에 출력
		System.out.println(sb);

		// 마무리(관행적으로 필수)
		br.close();
	}
}
