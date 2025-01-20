package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 4:30:22
 * @subject
 * @content 
 */
public class Ex12 {

	public static void main(String[] args) {
		
		// 날짜 + 시간
		LocalDateTime dt = LocalDateTime.now();
		System.out.println( dt );  // 2025-01-20T16:30:58.682620200

		/*
		// d, t만 가지고 날짜 + 시간하는 방법
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		// [1]
		dt = LocalDateTime.of(d, t); 
		System.out.println( dt );

		// [2]
		dt = d.atTime(t);
		System.out.println( dt );
		
		// [3]
		dt = t.atDate(d);
		System.out.println( dt );
		
		
		// 2025-01-20T16:34:39.100268600
		// 시간부터 분/초/밀리초/나노초 절삭
		dt = dt.truncatedTo(ChronoUnit.DAYS);	
		System.out.println( dt );
		
		*/
		
		// LocalDate + LocalTime = LocalDateTime -> 위 내용
		
		// LocalDateTime -> LocalDate / LocalTime 로 나눔
		LocalDate d = dt.toLocalDate();
		System.out.println(d);
		
		LocalTime t = dt.toLocalTime();
		System.out.println(t);		
		
		
		
		
		
		
		
	} // main
	
} // class
