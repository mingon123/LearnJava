package days04;

import java.util.Scanner;

// 정수를 입력받아서 "홀수"/"짝수"라고 출력

public class Ex03 {

	public static void main(String[] args) {

		/*

		1. if문 == 조건문
		2. if문의 선언 형식

		  if(조건식) { 
		  	//명령코딩. 
		  }

		 // 조건식이 참일 경우에만 {} 블럭 실행


		 */

		// Scanner로 정수를 입력받아서 출력
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("> 정수(n) 입력: ");
		n = scanner.nextInt();
		//System.out.println(n);

		
		/* 
		[1] 무조건 2번 실행되기 때문에 비효율적
		if(n % 2 == 0) {
			System.out.println("짝수");
		}
		
		if(n % 2 != 0) {
			System.out.println("홀수");
		}
		*/
		
//		[2] 한번만 실행되기에 효율적
		if (n % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
				
		System.out.println("END");



	}

}
