package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 3:29:53
 * @subject
 * @content 
날짜 정보를 가져와서 출력..
 */
public class Ex10 {

	public static void main(String[] args) {
		// 1. 날짜 클래스 : LocalDate
		LocalDate d = LocalDate.now();
		System.out.println(d);		// 2025-01-20 (시간 X)
		
		// 년
		int year = d.getYear();
		year = d.get(ChronoField.YEAR);
		
		// 월
		// [e]num 열거형
		Month m = d.getMonth();	// 리턴자료형 Month(열거형)
		System.out.println(m); 								// JANUARY
		int month = d.getMonthValue(); // 리턴자료형 int
		month = d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month); 							// 1
		
		// 일
		int day = d.getDayOfMonth();
		day = d.get(ChronoField.DAY_OF_MONTH);
		
		// 요일
		DayOfWeek dow = d.getDayOfWeek(); // 리턴자료형 DayOfWeek(열거형)
		System.out.println( dow );
		// LocalDate 요일
		// 1(월) 2(화) ~ 7(일)
		System.out.println( dow.getValue() ); // int형으로 변환
		// Date 0(일) 1(월) ~ 6(토)
		// Calender 1(일) 2(월) ~ 7(토)
		
		
		
		
		System.out.println(" end ");
	} // main

} // class
