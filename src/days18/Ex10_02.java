package days18;

import java.time.LocalTime;
import java.time.Year;
import java.time.temporal.ChronoField;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 3:46:58
 * @subject
 * @content 
시간정보를 가져와서 출력
 */
public class Ex10_02 {
	
	public static void main(String[] args) {
		// 시간... LocalTime		
		LocalTime t = LocalTime.now();
		System.out.println( t ); // 15:48:09.052966100 - 날짜 정보 X
		
		// 시
		int hour = t.getHour();
		hour = t.get(ChronoField.HOUR_OF_DAY);
		System.out.println( hour );
		
		// 분
		int min = t.getMinute();
		min = t.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println( min );
		
		// 초
		int sec = t.getSecond();
		sec = t.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println( sec );
		
		// 밀리초
		int ms = t.get(ChronoField.MILLI_OF_SECOND);
		System.out.println( ms );
		
		// 나노초
		int ns = t.getNano();
		ns = t.get(ChronoField.NANO_OF_SECOND);
		System.out.println( ns );
		
		
	} // main
	
} // class
