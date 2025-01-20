package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 10:21:48
 * @subject
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		// Ex01_02.java  개강일 요일 Date
		// Ex02_02.java  수료일 요일 Calendar
		
		// 달력
		// 1) 2025.5.1 무슨요일
		// 2. 2025.5   마지막 날짜 며칠까지 있는지 Date/Calendar
		
		
		// [1] Date 
		Date d = new Date(2025-1900, 5-1, 1);
		System.out.println( d.toLocaleString() );
		d.setMonth( d.getMonth() + 1 );	// 한달 더함
		System.out.println( d.toLocaleString() );
		d.setDate( d.getDate() - 1 );	// 6월 1일에서 1일 빼서 5월 마지막날 가져옴
		System.out.println( d.toLocaleString() );
		System.out.println( d.getDate() );
		
		
		// [2] Calendar
//		Calendar c = new GregorianCalendar(2025, 5-1, 1);
//		c.add(Calendar.MONTH, 1); // 한달 더함
//		c.add(Calendar.DATE, -1); // 하루 뺌
//		System.out.println(c.get(Calendar.DATE));
		
		// [3] Calendar
		Calendar c = new GregorianCalendar(2025, 5-1, 21);
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		
		
		
	} // main
	
} // class
