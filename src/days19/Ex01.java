package days19; 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author goddxmn
 * @date 2025. 1. 20. - 오후 5:28:07
 * @subject 컬렉션 프레임워크
 *          D, C
 *      
 * @content j, t
 * 
 *         DateTimeFormatter 형식화 클래스
 */
public class Ex01 {

	public static void main(String[] args) {
		// now(), of()
		
		
		LocalDateTime dt  = LocalDateTime.now();
		System.out.println(dt);
		
		
		// [ dt -> 출력형식 ]
		// 2023/02/27 월요일 12:11:50.123
		
		String pattern = "yyyy/MM/dd E요일 hh:mm:ss.SSS";
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		
		String s = df.format(dt); // 매개변수 다형성
		
		System.out.println(s);
		System.out.println(" end ");
		
		
	}

}
