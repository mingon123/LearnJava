package days18;

import java.text.MessageFormat;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 2:10:53
 * @subject
 * @content

 		4. MessageFormat 클래스
 		 ㄴ 어떤 값(데이터)을 정해진 형식에 맞게 출력... 하는 기능이 있는 클래스
 		 
 	지금까지 : System.out.printf("출력형식", 값...);
 			String 출력형식문자열 = String.format("출력형식", 값...);
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// 출력형식 : 	이름:홍길동, 나이:20살, 성별:여자		
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
//		String str = String.format("이름:%s, 나이:%d, 성별:%s", name, age, gender?"남자":"여자");
//		System.out.println( str );
		
		// [2]
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
//		MessageFormat mf = new MessageFormat(pattern);
//		mf.format(new Object[] { name, age, gender?"남자":"여자" } );
//		String str = String.format("이름:%s, 나이:%d, 성별:%s", name, age, gender?"남자":"여자");
//		System.out.println( str );		
		
		// [3]
		String str = String.format(pattern, name, age, gender?"남자":"여자");
		System.out.println( str );	
		
	} // main

} // class
