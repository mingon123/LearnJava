package days18;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 10:06:23
 * @subject
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// Calendar 사용해서 수료일 무슨요일인지 출력
		// 수료일 : 25.7.21
		
//		Calendar c = Calendar.getInstance();
		// [1]
//		c.set( Calendar.YEAR, 2025);
//		c.set( Calendar.MONTH, 7-1);
//		c.set( Calendar.DATE, 21);

		// [2]
//		c.set( 2025, 7-1, 21);

		// [3] 추상클래스
		Calendar c = new GregorianCalendar(2025, 7-1, 21);
		
		// 1(일) 2(월) ~ 7(토)
		char dayOfWeek = "_일월화수목금토".charAt(c.get((Calendar.DAY_OF_WEEK)));
		System.out.println(dayOfWeek);
		
		
		
		
	} // main

} // class
