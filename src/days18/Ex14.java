package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 5:03:55
 * @subject
 * @content 
 */
public class Ex14 {

	public static void main(String[] args) {
		// 날짜-날짜 = 간격 Period 클래스
		// 시간-시간 = 간격 Duration 클래스
		
		LocalDate o = LocalDate.of(2024, 12, 23); // 개강일 
		LocalDate t = LocalDate.now(); // 오늘

		// 		간격	o(포함)<=   <t(포함X)
		Period p = Period.between(o, t);
		
		// 개강일로부터 오늘일 간격 : p
		long year = p.get(ChronoUnit.YEARS);
//		long year = p.getYears();	// 위와 같음
		System.out.println( year );
		
		long month = p.get(ChronoUnit.MONTHS);
		System.out.println( month );

		long days = p.get(ChronoUnit.DAYS);
		System.out.println( days );
		
		System.out.println("-".repeat(50));
		
		
		// 수업시작 시간
		LocalTime ot = LocalTime.of(9, 0, 0);
//		System.out.println( ot );
		LocalTime tt = LocalTime.now();
		
		// 시간-시간=간격 : Duration 클래스
		Duration d = Duration.between(ot, tt);
		
		// UnsupportedTemporalTypeException : Duration에서는 ChronoUnit.HOURS, MINUTES 등 사용 안됨
		// 시, 분 등은 안됨
		// long hour = d.get(ChronoUnit.HOURS);
		// System.out.println(hour);
		
		System.out.println( d.getSeconds() );
		System.out.println( d.get(ChronoUnit.SECONDS) );
		
		System.out.println( d.getNano() );
		
		
		
		// Period 날짜-날짜의 간격
		// between()  / until() 차이점
		// static메서드 / 인스턴스메서드
		
		// between()은 static메서드, until()은 인스턴스메서드이고 그 외의 차이점은 없다
		
		
		
		
	} // main

} // class
