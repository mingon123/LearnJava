package days18;

import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 11:28:15
 * @subject
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. Calendar -> Date 변환

		// [1]
		// Date d = new Date(long ms);
//		Calendar c = Calendar.getInstance();
//		Date d = new Date (c.getTimeInMillis() );
		
		// [2]
//		Calendar c = Calendar.getInstance();
//		Date d = c.getTime();
		
		
		// 2. Date -> Calendar 변환
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		// c.setTime(Date date);
		c.setTime(d);
		
		
		
	} // main

} // class
