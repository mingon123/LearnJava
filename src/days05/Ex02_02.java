package days05;

import java.util.Scanner;

/*

	else if문 사용 풀이 - 깔끔한 코드

 */


public class Ex02_02 {

	public static void main(String[] args) {

//		[문제] 국어점수를 입력받아서 수/우/미/양/가 등급 출력..
				
		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("국어 점수 입력: ");
		kor = scanner.nextInt();
		
		// 0~100 정수: 유효성 검사..
//		System.out.println( kor );

		if (0 <= kor && kor <= 100) {
			if (kor >= 90) System.out.println("수");
			else if (kor >= 80) System.out.println("우");
			else if (kor >= 70) System.out.println("미");
			else if (kor >= 60) System.out.println("양");
			else System.out.println("가");
		} else {
			System.out.println("국어 점수 입력 잘못!!!");
		}
		
	
	}

}
