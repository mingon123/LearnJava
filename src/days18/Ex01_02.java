package days18;

import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 9:29:11
 * @subject
 * @content 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// [문제] Date 클래스 사용해서 개강일 24/12/23 이 무슨 요일 ? 월요일
		// Date 날짜 객체 생성 -> getDay() 메서드 호출
		
		// [1]
//		Date d = new Date();
//		d.setYear(2024-1900);
//		d.setMonth(12-1);
//		d.setDate(23);
			
		// [2]
		Date d = new Date(2024-1900, 12-1, 23);
		
		System.out.println( d.toLocaleString() );	// 시간은 지금 시간
		System.out.println( "일월화수목금토".charAt(d.getDay() ) + "요일" );
		
	} // main

} // class
