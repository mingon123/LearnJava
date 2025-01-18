package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	***중요
	비교연산자 : ==		!=
	두 문자열을 비교할 때는 ==, != 비교연산자를 사용하지 않는다.
	왜 ?
	방법 설명
	
 */

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		String n1 = "이창익";
		String n2; // "이창익"
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf(">n2 입력? ");
		n2 = br.readLine();
		System.out.printf("n2: [%s] \n", n2); //n1과 n2가 같음을 확인

		//System.out.println( n1 == n2 ? "같다" : "다르다" ); //문자열 비교할 때는 ==을 쓰면 안된다.
		
		//String.eqauls() 메서드 : 두 문자열 비교하는 메서드
		System.out.println( n1.equals(n2) ? "같다" : "다르다");
		
		
	}

}
