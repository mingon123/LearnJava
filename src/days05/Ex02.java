package days05;

import java.util.Scanner;

/*

	if문을 사용하여 문제 풀이 - 깔끔하지 않은 코드

 */


public class Ex02 {

	public static void main(String[] args) {

//		[문제] 국어점수를 입력받아서 수/우/미/양/가 등급 출력..
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("국어 점수 입력: ");
		kor = scanner.nextInt();
		
		// 0~100 정수: 유효성 검사..
//		System.out.println( kor );
		
		// The operator <= is undefined for the argument type(s) boolean, int 
		// if(0<=kor<=100) - 아래처럼 고쳐야 함
		if (0 <= kor && kor <= 100) {
			if (kor >= 90 && kor <= 100) {
				System.out.println("수");
			} 
			if (kor >= 80 && kor <= 89) {
				System.out.println("우");
			}
			if (kor >= 70 && kor <= 79) {
				System.out.println("미");
			}
			if (kor >= 60 && kor <= 69) {
				System.out.println("양");
			} 
			if (kor >= 0 && kor <= 59) {
				System.out.println("가");
			}
		} else {
			System.out.println("국어 점수 입력 잘못!!!");
		}

		
		
	}

}
