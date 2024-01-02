import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// " " 띄어쓰기 기준으로 한단어씩 나눔
		String[] words = br.readLine().strip().split(" "); // strip() : 앞 뒤 공백 잘라주는 메소드
		
		if(words[0] == "") {
		    bw.write("0"); // 공백만 입력되는 경우 위에 줄에서 다잘려서 아무것도 안들어옴
		} else {
		    bw.write(String.format("%d", words.length)); // bw는 문자만 출력가능함, 정수는 문자로 변형해서 출력
		}
        
        // 출력버퍼를 화면에 출력
        bw.flush();

		// 마무리(관행적으로 필수)
	    br.close();
		bw.close();
		
		
	}		
}
