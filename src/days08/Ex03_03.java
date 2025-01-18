package days08;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 11:40:10
 * @subject
 * @content 
 */

public class Ex03_03 {

	public static void main(String[] args) {

		String rrn = "830412-1700001"; 
		System.out.println(rrn);

		// 나이 계산 - 정년퇴임
		// 1) 세는 나이(한국 나이)
		// 2) 만 나이
		
		/*
				24.12.30출생	25.1.1	25.12.29	25.12.30
		세는 나이		1살		 2살		 2살			 2살
		만 나이 		0살		 0살		 0살			 1살
		
		*/
		
		// 세는 나이
		int age = getCountingAge(rrn);
		System.out.println("세는 나이 : " + age);
		
		age = getAmericanAge(rrn);
		System.out.println("만 나이 : " + age);
		
		age = getAmericanAge1(rrn);
		System.out.println("만 나이 : " + age);		
		
	} // main


	private static int getAmericanAge1(String rrn) {
		int americanAge1 = getCountingAge(rrn)-1;
		
		Date d = new Date();
		int currentMonth = d.getMonth()+1;
		int currentDay = d.getDate();
		
		int currentMonthDay = currentMonth+currentDay;  // 1월6일이라 106
		int birthMonthDay = Integer.parseInt( rrn.substring(2, 6) );
	
		if ( currentMonthDay < birthMonthDay ) americanAge1--;
		return americanAge1;
	}

	

	private static int getAmericanAge(String rrn) {
		// 만나이 = 올해년도 - 생일년도		생일지나지않은경우 -1
		int americanAge = getCountingAge(rrn)-1;  // 년도 계산 코드
		
		int currentMonth = 1;
		int currentDay = 6;
		int birthMonth = 4;
		int birthDay = 12;
//		if(생일 안지났다면 조건식) americanAge--;
		if( birthMonth > currentMonth ) americanAge--;
		else if ( birthMonth == currentMonth && birthDay > currentDay ) americanAge--;
		return americanAge;
	}
	
	

	private static int getCountingAge(String rrn) {
		// 올해년도 : 2025
		// 생일년도 : 2024
		// 세는 나이 = 올해년도 - 생일년도 + 1
		
		int birthYear = Integer.parseInt(Ex03_02.getBirthday(rrn).substring(0, 4));
		
		Date d = new Date();
		int currentYear = d.getYear() + 1900;
		
		return currentYear - birthYear + 1;
	}


	
	
//	private static int getCountingAge(String rrn) {
//		// 올해년도 : 2025
//		// 생일년도 : 2024
//		// 세는 나이 = 올해년도 - 생일년도 + 1
//		
//		int birthYear = Integer.parseInt(rrn.substring(0, 2));
//		char gender = ( rrn.charAt(7) );
//		switch (gender-'0') {
//		case 0: case 9:
//			birthYear += 1800;			
//			break;
//		case 1: case 2: case 5: case 6:
//			birthYear += 1900;
//			break;
//		default:
//			birthYear += 2000;
//			break;
//		}
//		return 2025 - birthYear + 1;
//	}
	
} // class
