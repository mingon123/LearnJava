package days18;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 4:04:46
 * @subject
 * @content 

날짜 변경(수정)
 */
public class Ex11 {

	public static void main(String[] args) {
		
		// 1) 객체 생성 : now(), of()
		// 2) 특정 필드 값을 얻어올 떄 : get(), getXXX()
		// 3) 필드 값을 변경 : plusXXX(), minusXXX()
		//				   plus()	  minus()
		//				   with(), withXXX()
		
		// 개강일 24.12.23
		// [ 불변 ]
		
		/*
		// [1]
		LocalDate d = LocalDate.now();
		System.out.println(d);
		d = d.withYear(2024);	// '불변'이기 때문에 바꾸려면 새로운 날짜 객체에 받아야 함 *중
		d = d.withMonth(12);
		d = d.withDayOfMonth(23);
	
		d = d.with(ChronoField.DAY_OF_MONTH, 23);	// 이걸로도 됨
		*/

		/*
		// [2]
		LocalDate d = LocalDate.of(2024, 12, 23); // 날짜 바로 지정하고 싶을 때 사용
		System.out.println( d );
		
		System.out.println( d.isLeapYear() ); // 윤년 체크
		d.isAfter(d);	// 지났니?
		d.isBefore(d); // 이전이니?
		d.isEqual(d); // 같니?
		*/
		
		// A 생일 2000.1.15	지남
		// B 생일 2000.1.20	오늘
		// C 생일 2000.12.15	안지남
		
		LocalDate d = LocalDate.now();
		
		LocalDate A = LocalDate.of(2025, 1, 15);
		LocalDate B = LocalDate.of(2025, 1, 20);
		LocalDate C = LocalDate.of(2025, 12, 15);

		// boolean 형 반환
		System.out.println( d.isAfter(A) );
		System.out.println( d.isBefore(A) );
		System.out.println( d.isEqual(A) );
		
		System.out.println( d.isAfter(B) );
		System.out.println( d.isBefore(B) );
		System.out.println( d.isEqual(B) );
		
		System.out.println( d.isAfter(C) );
		System.out.println( d.isBefore(C) );
		System.out.println( d.isEqual(C) );

		// int 형 반환
		System.out.println( d.compareTo(A) );
		System.out.println( d.compareTo(B) );
		System.out.println( d.compareTo(C) );
		
		
		
		
	} // main
	
} // class
