package days04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		

//		[문제1] if문을 사용하여 정수 입력받아 짝/홀 나누는 코드
//		
//		int n;
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("정수 입력: ");
//		n = scanner.nextInt();
//		
//		if (n % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		

		
//		[문제2] switch문을 사용하여 정수 입력받아 짝/홀 나누는 코드
//		
//		int n;
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("정수 입력: ");
//		n = scanner.nextInt();
//		
//		switch ( n % 2 ) {
//		case 0:
//			System.out.println("짝수");
//			break;
//
//		default:
//			System.out.println("홀수");
//			break;
//		}
		
		
//		[문제3] for문 숫자 1 ~ 10까지 출력
//		
//		for (int i = 1; i <= 10 ; i++) {
//			System.out.println(i);
//		}

		
//		[문제4] int i = 0으로 고정하고 다른 항들을 바꿔 10~1으로 출력
//		for (int i = 0 ; i > -10 ; i--  ){
//			System.out.println( i + 10 );
//		}
//		
//		for (int i = 0 ; i <= 9; i++) {
//			System.out.println( 10-i );
//		}
		
		// 한 줄로도 코딩할 수 있음
		// for (int i = 0 ; i <= 9; i++) { System.out.println( 10-i ); }
				
		
		
//		for문 숫자 1 ~ 10까지의 합 출력
//		// 1+2+3+..+9+10=55
//		int sum = 0;
//		for ( int i = 1; i <= 10; i++) {
//			System.out.printf("%d + ", i);
//			sum += i;
//		} //for
//		System.out.printf("= %d \n", sum);

		
//		[문제5] for문에 if문 추가하여 10+없이 10=55가 나오도록
		
		int sum = 0;
		for ( int i = 1; i <= 10; i++) {
			if (i < 10) {
				System.out.printf("%d + ", i);
			} else {
				System.out.printf("%d = ", i);
			}
			sum += i;
		} //for
		System.out.printf("%d \n", sum);
		
		
		
	}
	
}
