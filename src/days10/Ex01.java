package days10;

import java.util.Date;
import java.util.Scanner;

import days07.Sample;
import util.MyCalendar;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오전 9:00:14
 * @subject
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		// [일정관리 / 근태관리]
		// 자바 달력, js 달력, jsp 달력
		// [년도와 월]을 입력받아서 달력을 출력.
		
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();
			
//		printCalendar(year, month);
		for (int i = 1; i <= 12; i++) {
			printCalendar(year, i);
		}
		
	} // main

	// 달력 그리는 메서드
	private static void printCalendar(int year, int month) {
		// 1. year.month.1		무슨 요일인지 파악해야 함
		//		총 날짜수 % 7	0(일) 1(월) 2(화) ... 6(토)
		int dayOfWeek = getDayOfWeek(year, month, 1);
//		System.out.println("일월화수목금토".charAt(dayOfWeek) + "요일");  // 요일 확인
		
		// 2. 마지막 날짜 몇일 ? 28/29/30/31
		int lastDay = getLastDay(year, month); 
//		System.out.printf("마지막 날짜 : %d일 \n", lastDay);  // 마지막날짜 확인
		
		
		// 달력 모양표시
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Sample.drawLine("-", 60);
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) System.out.printf("\t%c", week.charAt(i));
		System.out.println();
		Sample.drawLine("-", 60);
		// 1의 위치를 잡기 위해서 \t for문
		for (int i = 0; i < dayOfWeek; i++) System.out.printf("\t");
		
		for (int i = 1; i <= lastDay; i++) {
			if (isToday(year, month, i)) {
				System.out.printf("\t[%2d]", i);
			} else {
				System.out.printf("\t%2d", i);
			}
			if ( (dayOfWeek + i) % 7 == 0) System.out.println();
		}
		System.out.println();
		Sample.drawLine("-", 60);
	} // printCalendar
	
	
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
		int [] months = { 31, 28, 31 ,30 ,31 , 30 ,31, 31, 30 ,31, 30 ,31 }; 
		int lastDay = months[month-1];	
		if ( MyCalendar.isLeapYear(year) && month == 2 ) lastDay = 29;
		return lastDay;
	} // getLastDay

	
	private static int getDayOfWeek(int year, int month, int day) {
		// 1.1.1 ~ year.month.1 총날짜수
		int totalDays = getTotalDays(year, month, day);
//		System.out.printf("1.1.1 ~ %d.%d.%d 총날짜수 =%d일\n", year, month, day, totalDays);  // 총날짜수 확인
		// 요일 = 총날짜수 % 7
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
	} // getDayOfWeek
	
	
	// 1.1.1 ~ year.month.day 까지의 총날짜수를 반환하는 메서드
	private static int getTotalDays(int year, int month, int day) {
		// 날짜 가정해서 달력그리기
		// year = 2025
		// month = 4
		// days = 1
						//1,2,3월 끝날짜 + 1 = 4월 1일
//		int totalDays = ( 365 * 2024 ) + ( 31 + 28 + 31 ) + 1;
		
		int totalDays = 0;
		
		// 전년도 까지의 총 날짜수 계산..
		/*
		for (int i = 1; i < year; i++) { 
			if (MyCalendar.isLeapYear(i) ) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}
		*/
		
		// year 2025
		// for문, if문 2024번 돌아야해서 비효율적
		
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		
				//		  1월										 12월
				//		  [0]	 									 [11]
		int [] months = { 31, 28, 31 ,30 ,31 , 30 ,31, 31, 30 ,31, 30 ,31 }; 
		
		// index번호는 -1이라 -1함
		for (int i = 0; i < month-1; i++) totalDays += months[i];
		if ( MyCalendar.isLeapYear(year) && month >= 3) totalDays++;
		totalDays += day; // 일 계산

		return totalDays;
		
		
		/*
		// 1월+2월+3월 + 1
		switch (month) {
		case 1:
			totalDays += 1;
			break;
		case 2:
			totalDays += 31 + 1; // 2월까지는 윤년인지 아닌지 중요하지 않음
		case 3: 
			totalDays += 31 + 28/29 +1;
		// :
		case 12: 
			totalDays += 31 + 28/29 +31+30+31+30+31+30+31+30+31+30+ 1;
		default:
			break;
		}
		*/
	
	} // getTotalDays

} // class
