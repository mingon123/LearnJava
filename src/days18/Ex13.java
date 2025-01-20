package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 4:40:10
 * @subject
 * @content 
 */
public class Ex13 {

	public static void main(String[] args) {
		/*
		[ TemporalAdjusters 클래스 ] 
		= Temporal(시간상의) + Adjusters(조정자)
		
		날짜, 시간을 변경할 때 메서드 : plus(), plusXXX()
								minus(), minusXXX()
								with(), withXXX()
		
		자주 사용되는 날짜, 시간의 수정과 관계된 메서드를 미리 구현해놓은 클래스
		  예) '다음주 금요일 휴강~' 이라고할 때 바로 찾아주는 메서드
		
		 */
		
		
		LocalDate d = LocalDate.now();
		System.out.println( d );
		
		// [문제] 이번달의 첫번째 월요일 ?
//		d = d.with( TemporalAdjusters.firstDayOfNextMonth() );
		d = d.with( TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY) );
		System.out.println( d );	// 2025-01-06
		
		
		// [문제] 이번달 마지막 토요일 언제?
		d = d.with( TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
		System.out.println( d );
		
	} // main

} // class
