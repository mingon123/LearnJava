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
		System.out.println( c.get(Calendar.MONTH) + 1 );
		// 일
		System.out.println( c.get(Calendar.DATE) );
		System.out.println( c.get(Calendar.DAY_OF_MONTH) );	// 해당 월의 몇일?	
		System.out.println( c.get(Calendar.DAY_OF_YEAR) );	// 해당 년의 몇일? - 1월이어서 같음	
		// 시간
		System.out.println( c.get(Calendar.HOUR) );
		// 분
		System.out.println( c.get(Calendar.MINUTE));
		// 초
		System.out.println( c.get(Calendar.SECOND));
		// 밀리초
		System.out.println( c.get(Calendar.MILLISECOND));
		// 요일
		// Date (0)일, 1(월) ~ 6(토)
		// Calendar 1(일) 2(월) ~ 7(토)
		System.out.println( c.get(Calendar.DAY_OF_WEEK) );  // 2
		
		
		
		
	} // main

} // class
