package days19; 

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 21. - 오전 9:06:30
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		// [문제] 
		// 문자열 s -> LocalDate 객체로 변환 -> 출력
	
		/*
		LocalDate ld = LocalDate.of(2022, 12, 25); // LocalDate 객체 생성
		
		String pattern = "yyyy년 MM월 dd일 (E)"; // 패턴 정리
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern); // DateTimeFormatter 객체 생성
	    String s = df.format(ld); // LocalDate 객체 Format 작업
	    
		System.out.println(s.toString()); // 출력
		
		*/
		
		String s = "2022년 12월 25일 (일)";
		
		String pattern = "yyyy년 MM월 dd일 (E)"; // 패턴 정리
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate ld = LocalDate.parse(s, dtf);
		
		System.out.println(ld);
		
		
		// format, parse 기억
		
		
	} // main

} // class
