package days18;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 4:27:58
 * @subject
 * @content 
 */
public class Ex11_02 {

	public static void main(String[] args) {
		

		// [1] 날짜 변경				plus(), minus()도 사용 가능
		LocalDate d = LocalDate.now();
		d= d.plusDays(2);
		d = d.minusDays(1);
		System.out.println( d );

		
		// [2] 시간 변경
		LocalTime t = LocalTime.now();
		t = t.plusHours(1);
		t = t.minusMinutes(30);
		System.out.println( t );
		
	}
	
}
