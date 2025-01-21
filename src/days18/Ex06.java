package days18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 12:12:59
 * @subject
 * @content 

2. SimpleDateFormat 클래스
 */
public class Ex06 {

	public static void main(String[] args) {
		// [ 2. SimpleDateFormat 클래스 ]	- 날짜를 형식화
		// 		Date, Calendar -> 내가원하는 날짜/시간형식으로 변환.
		Calendar c = Calendar.getInstance();
		// System.out.println( c );  // -> 이렇게 나오는 게 아니라 내가 원하는 형식으로 바꿈
//		String pattern = "''yy년 M월 d일 kk:mm:ss.SSS E요일";
		String pattern = "yyyy년 MM월 dd일 E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// Calendar -> Date 형 변환 : 매개변수로 Date 형만 받기 때문
		// sdf.format(date)
		String s = sdf.format( c.getTime() );
		System.out.println( s );
		
		System.out.println(" end ");
	} // main

} // class
