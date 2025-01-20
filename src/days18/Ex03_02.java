package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import days07.Sample;
import util.MyCalendar;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 10:39:51
 * @subject
 * @content 

days10.Ex01 복사
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [년도와 월]을 입력받아서 달력을 출력.
		// + 추가 공부 : [문제] 오늘날짜인 경우 [20] 출력
		
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();
			
		printCalendar(year, month);

	} // main

	// 달력 그리는 메서드
	private static void printCalendar(int year, int month) {
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDay(year, month); 
		
		
		// 달력 모양표시
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Sample.drawLine("-", 60);
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) System.out.printf("\t%c", week.charAt(i));
		System.out.println();
		Sample.drawLine("-", 60);
		
		// 1의 위치를 잡기 위해서 \t for문
		Calendar c = new GregorianCalendar(year, month-1, 1);
		c.add(Calendar.DATE, -dayOfWeek);	// 디버깅으로 시작날짜 확인
		
		int c_month = 1;
		for (int i = 1; i <= 42; i++) {
			// month 출력할 달(월) == 1
			c_month = c.get(Calendar.MONTH) + 1;
			System.out.printf( month == c_month ? "\t%2d" : "\t(%2d)",  c.get(Calendar.DATE) );
			c.add(Calendar.DATE, 1);
			if( i % 7 == 0 ) System.out.println();
		} // for i
		System.out.println();
		Sample.drawLine("-", 60);
	} // printCalendar
	
	
	// 수정할 내용 Calendar 클래스 사용
	public static boolean isToday(int year, int month, int day) {
		Date today = new Date();
		int todayYear = today.getYear() + 1900;
		int todayMonth = today.getMonth() + 1;
		int todayDay = today.getDate();
		
		if ( todayYear == year && todayMonth == month && todayDay == day)
			return true;
		else
			return false;
	} // isToday

	
	private static int getLastDay(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		return lastDay;
	} // getLastDay

	// 0(일) 1(월) ~ 6(토)
	private static int getDayOfWeek(int year, int month, int day) {
		Calendar c = new GregorianCalendar(year, month-1, day);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 1(일) 2(월) ~ 7(토)
		return dayOfWeek -1; // 원래 코딩대로 맞추기 위해 1뺌
	} // getDayOfWeek
	

} // class
