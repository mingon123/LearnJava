package days04;

import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {

		// 들여쓰기 : ctrl + a 후 ctrl + i
		Scanner scanner = new Scanner(System.in);

		//아래 코드는 scanner 예제
		String input = "1 fish 2 fish red fish blue fish";
						
		// '\s' == space(공백)
		// * == 반복횟수 0~여러번 - 띄어쓰기가 몇번이어도 상관안한다.
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); // (input) - 읽어올 대상

		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		
		s.close(); //scanner를 안닫으면 계속 돌아감

	}
}
