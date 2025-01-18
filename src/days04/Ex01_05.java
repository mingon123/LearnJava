package days04;

import java.util.Scanner;

// Scanner 클래스 예제

public class Ex01_05 {

	public static void main(String[] args) {
		
		// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
	    // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자

//		내코드 - 잘못됨. 틀림
		
//		String name;
//		byte age;
//		double height;
//		boolean gender;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("> 이름, 나이, 키, 성별을 입력하세요"); 
//		
//		name = scanner.next();
//		age = scanner.nextByte();
//		height = scanner.nextDouble();
//		gender = scanner.nextBoolean();
//		
//		String Strgender = ( gender ? "남자" : "여자");
//		
//		System.out.printf("이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, gender );
		
		
		
		//정답
		String name;
		byte age;
		double height;
		boolean gender;
		
		Scanner scanner = new Scanner(System.in);
		
		// 홍길동 20 178.89 true
		System.out.print("> 이름, 나이, 키, 성별 입력: ");
		
		name = scanner.next();
		age = scanner.nextByte();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		
		// true -> "남자", false -> "여자"
		// 삼항연산자 gender ? "남자" : "여자"
		
		System.out.printf("이름:%s, 나이:%d살, 키:%.2f, 성별:%s \n", name, age, height, gender ? "남자" : "여자" );
		
		
	}
		
}
