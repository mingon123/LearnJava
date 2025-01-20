package days18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 12:34:28
 * @subject
 * @content

문자열 -> 날짜 타입
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String s = "2025.01.20(월)";
		
		// 문자열 s -> 날짜 ( Date, [Calendar] ) 변환
		
		// [2] SimpleDateFormat 클래스 - format(), parse()
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d = sdf.parse(s);
			// Date -> Calendar 변환
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			System.out.println( c );
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// [1] 
		
		
		
	} // main
	
} // class
