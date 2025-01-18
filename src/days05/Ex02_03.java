package days05;

import java.util.Scanner;

/*

	switch문 사용 문제 풀이
	
	중단점 잡아두고 debug할 때는 f11만 누름 + f6으로 다음줄 디버그 계속 하면서 값 확인
	ctrl + f11은 처음부터 실행

 */


public class Ex02_03 {

	public static void main(String[] args) {

		
//		[문제] 국어점수를 입력받아서 수/우/미/양/가 등급 출력
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("국어 점수 입력: ");
		kor = scanner.nextInt();
		
//		if (0 <= kor && kor <= 100) {
//			switch (kor/10) {
//			case 10:
//			case 9:
//				System.out.println("수");
//				break;	
//			case 8:
//				System.out.println("우");
//				break;
//			case 7:
//				System.out.println("미");
//				break;
//			case 6:
//				System.out.println("양");
//				break;
//			default:
//				System.out.println("가");
//				break;
//			}
//			
//		} else {
//			System.out.println("국어 점수 입력 잘못!!!");
//		}

		
		if (0 <= kor && kor <= 100) {
			char grade = '가';
			switch (kor/10) {
			case 10:
			case 9:
				grade = '수';
				break;
			case 8:
				grade = '우';
				break;
			case 7:
				grade = '미';
				break;
			case 6:
				grade = '양';
				break;
			default:
				grade = '가';
				break;
			}
			System.out.printf("kor=%d(%c)", kor, grade);
		} else {  
			System.out.println("국어 점수 입력 잘못!!!");
		}
		
	
		
	
	} //main

} //class
