import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] strings = new String[3];
		
		strings[0] = br.readLine();
		strings[1] = br.readLine();
		strings[2] = br.readLine();
		
		int n = 0;
		int k = 0;
		
		for(int i = 2; i >= 0; i--) {
			if(strings[i].charAt(0) != 'F' && strings[i].charAt(0) != 'B') {
				n = Integer.parseInt(strings[i]);
				k = 3 - i;
				break;
			}
		}
		
		int i = n + k;
		
		if(i % 3 == 0 && i % 5 == 0) {
			sb.append("FizzBuzz");
		} else if(i % 3 == 0 && i % 5 != 0) {
			sb.append("Fizz");
		} else if(i % 3 != 0 && i % 5 == 0) {
			sb.append("Buzz");
		} else {
			sb.append(i);
		}
		
		System.out.println(sb);
	}
}
