package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 5:17:54
 * @subject
 * @content 
 */
public class Ex14_02 {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2014, 1, 1);
		LocalDate d2 = LocalDate.of(2015, 12, 31);
		
		Period p = Period.between(d1, d2); // between : d1 포함 O, d2 포함 X
		
		System.out.println( p ); // P 1Y 11M 30D -> P 1년 11개월 30일 날짜 간격
		
		// 총 개월수를 알고 싶다면? 	총 개월수 : 23개월 ( 남은 일 무시 )
		System.out.println( p.toTotalMonths() );
		
		
		System.out.println("-".repeat(50));
		
		// 오늘 아침에 수업 시작한지 지금 몇초가 지났니?
		LocalTime s = LocalTime.of(9, 0);
		LocalTime t = LocalTime.now();
		Duration d = Duration.between(s, t);
		System.out.println( d ); // PT 8H 24M 16.0451454S -< PT 8시간 24분 16초
		System.out.println( d.toHours());
		System.out.println( d.toMinutes()); // 8*60+24 = 504
		System.out.println( d.toSeconds());	// 504*60
		
				
		
		
	} // main

} // class
