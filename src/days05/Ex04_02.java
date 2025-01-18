package days05;

// 꼭 암기할 것 - charAt = string에서 한 문자를 얻어오는 함수
// - 04, 04_02

import java.util.Iterator;

public class Ex04_02 {

	public static void main(String[] args) {

		
		// Scanner 한문자 읽어오는 메서드(함수) 존재X
		
//		"가나다" -> '가' 첫번째 한 문자를 얻어오는 방법
//		"가" = '가' + '\0'
		
		String name = "admin";
		
		// 문자열.length() : 문자열 길이를 가져오는 함수
		System.out.println( name.length() );
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println( name.charAt(i) );
		}
		
		// String.charAt(index) -> index에 해당하는 한 문자를 얻어와서 char형으로 반환
		System.out.println( name.charAt(0) );
		System.out.println( name.charAt(1) );
		System.out.println( name.charAt(2) );
		
	} // main

} // class
