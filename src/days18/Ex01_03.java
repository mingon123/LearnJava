package days18;

import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오전 9:39:17
 * @subject
 * @content 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println( now.toLocaleString() );
		// getTime() : 1970.1.1 00:00:00 ~ 지금까지의 밀리세컨드
		System.out.println( now.getTime() );
		
		Date open = new Date(2024-1900, 12-1, 23, 9, 0, 0); // 시분초까지 가능
		System.out.println( open.toLocaleString() );
		System.out.println( open.getTime() );
		
		// 2421784389 ( 두 날짜 사이의 간격 ) -> 일/시간/분/초/밀리초 알 수 있다.
		System.out.println( now.getTime() - open.getTime() );
		
		
		
		
		
		
	} // main

} // class
