package days08;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오전 11:16:19
 * @subject
 * @content 
 */

public class Ex03_02 {

	public static void main(String[] args) {

		String rrn = "990412-9700001"; 
		System.out.println(rrn);
		// 주민등록번호로부터 생년월일 얻어와서 출력
		// "????년 ??월 ??일"
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
	
	} // main

	// 990412-9700001
	public static String getBirthday(String rrn) {
		int year = Integer.parseInt( rrn.substring(0,2) );
		int month = Integer.parseInt( rrn.substring(2,4) );
		int day = Integer.parseInt( rrn.substring(4,6) );
		
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
			year += 1800;
			break;
		case '1': case '2': case '5': case '6':
			year += 1900;
			break;
		default:
			year += 2000;
			break;
		}
		
		return String.format("%d년 %02d월 %02d일", year, month, day);
	}

//	내꺼 틀림
//	private static String getBirthday(String rrn) {
//		
//		String year = rrn.substring(0, 2);
//		String days = rrn.substring(2, 4);
//		String day = rrn.substring(4, 6);
//		String rrn1 = rrn.substring(7, 8);
//		
//		int rrn2 = Integer.parseInt(rrn1);
//		int days2 = Integer.parseInt(days);
//		int day2 = Integer.parseInt(day);
//		if (rrn2==1 && rrn2==2) {
//			return year = "19"+year;
//		} 
//		else if (rrn2==3 && rrn2==4){
//			return year = "20"+year;
//		} else {
//			return year = "18"+year;
//		}
//	}
	
	
} // class
