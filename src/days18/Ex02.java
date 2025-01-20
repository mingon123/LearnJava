package days18;

import java.util.Calendar;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 9:44:40
 * @subject
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// Calendar 클래스
		
		// Cannot instantiate the type Calendar : 인스턴스화 불가
		// Calendar c = new Calendar(); 

		Calendar c = Calendar.getInstance();
		System.out.println( c ); // .toString() 생략	 // 우리가 원하는 형태의 날짜 형태를 가져올 수 없음
		
		// 년
		System.out.println( c.get(1) ); // 2025
		System.out.println( c.get(Calendar.YEAR) );		
		// 월
		System.out.println( c.get(Calendar.MONTH) );
		// 일
		
		// 시간
		
		// 분
		
		// 초
		
		// 밀리초
		
		// 요일
		
		
		
	} // main

} // class
