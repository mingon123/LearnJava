package days04;

import java.util.Scanner;

/*

1) 조건문: if문, if~else문
2) 분기문: switch문

 */

public class Ex04 {

	public static void main(String[] args) {
		
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("> 정수(n) 입력: ");
		n = scanner.nextInt();
		
		// [switch문 사용]
		// key : 수식 (변수 + 연산자 )
		// value : 리터럴 20 'A' "test" 변수x
		// - 값이 여러개 여도 상관없고, default에는 value값이 들어가지 않음

		// [문제] 정수를 입력받아서 짝수/홀수 출력해보기
		switch ( n % 2 ) {
		case 0:
			System.out.println("짝수");
			break;
//		case 1: 
//			System.out.println("홀수");
//			System.out.println("홀수");
//			break;
		default:
			System.out.println("홀수");
			break;
			
		} //switch
		

					
	}

}
