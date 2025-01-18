package days05;

// 전공자는 ascii코드로 가져와야함 지금 코드처럼말고

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		// 한 문자를 입력받아서
//		[조건]
//		대문자, 소문자, 숫자, 한글, 특수문자( # ! @ %)를 구분하기	

		
		//ASCII값 가져오는 코드
//		for (int i = '가' ; i <= '힣'; i++) {
//			System.out.printf("%d[%c]", i, (char)i);
//		}
		
		
		char one;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("한 문자를 입력하세요: ");
		
//		string형일 때: scanner.next();, scanner.nextLine();
//		int형일 경우: scanner.nextInt();
//		double형일 경우: scanner.nextDouble();
//		boolean형일 경우: scanner.nextBoolean();
//		
//		scanner에는 char형 한문자만 가져오는 함수는 없고, charAt을 사용해 문자열 속에서 내가 원하는 순번째의 값을 가져온다.
		
		one = scanner.next().charAt(0);
		
		if (one>= 'A' && one <= 'Z') System.out.println("대문자");
		else if (one >= 'a' && one <= 'z') System.out.println("소문자");
		else if (one >= '0' && one <= '9') System.out.println("숫자");
		else if (one == '#' || one == '!' || one == '@' || one == '%') System.out.println("특수문자");
		else if (one >= '가' && one <= '힣') System.out.println("한글");
		else if (one >= 'ㄱ' && one <= 'ㅎ'||one >= 'ㅏ' && one <= 'ㅣ') System.out.println("한글");
		else { System.out.println("잘못된 값입니다"); }
		
		
		
		
	} //main

} //class
