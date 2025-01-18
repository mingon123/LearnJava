package days08;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Ex03_04 {

	public static void main(String[] args) {
		
		// 올해 년도를 가져오는 방법
//		(1)
		Date d = new Date();
		int currentYear = d.getYear() + 1900;
		System.out.println(currentYear);
		
		System.out.println( d.getMonth() + 1 );
		System.out.println( d.getDate() );

		
//		생일 -> Date d	// 전공자는 이걸로 날짜가 지났느냐를 비교
//		d.after(Date when);
//		d.before(when);
//		d.compareTo(d);
		
		
//		(2)
		Calendar c = Calendar.getInstance();
		currentYear = c.get(Calendar.YEAR);
		System.out.println(currentYear);
		
//		(3)
		LocalDate ld = LocalDate.now();
		currentYear = ld.getYear();
		System.out.println(currentYear);
		
//		총 5가지가 있음. 여기서는 3가지만 배움
		
		
	} // main

} // class
