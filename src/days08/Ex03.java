package days08;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 10:30:42
 * @subject
 * @content 
 */

public class Ex03 {

	public static void main(String[] args) {

		/*
		
		주민등록번호
		1. 영어:  Resident Registration Number, (RRN)
		2. 1975년 3개편 ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ	13자리
		3. ㅅ -> 성별, 외국인/내국인, 세기 1800, 1900, 2000
		   getGender()

		 */
		
		Scanner scanner = new Scanner(System.in);
		// 830412-1700001
		// String rrn = getRrn(scanner); // 매번 입력하기 귀찮으니 일단 고정 주민등록번호 입력
		String rrn = "830412-2700001"; 
		System.out.println(rrn);
		
		// 남자 true, 여자 false
		boolean gender = getGender(rrn);
		System.out.println(gender? "남자" : "여자");
	
		
	} // main

	private static boolean getGender(String rrn) {
		char gender = rrn.charAt(7);	// gender = '1'
		// 남자 9 1 3 5 7 -> 홀수
		// '1' 49 % 2
		return (gender - '0') % 2 == 1 ? true : false; // '0' or 48
	}
	
	
//	[Substring()] 메서드 사용
//	private static boolean getGender(String rrn) {
//		int gender = Integer.parseInt(rrn.substring(7, 8) );
//		return gender % 2 == 1 ? true : false;
//	}


	private static String getRrn(Scanner scanner) {
		String regex = "\\d{6}-\\d{7}";
		String rrn;
		
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예 : 000000-0000000) ? ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));
		
		return rrn;
	}

} // class
