package days16;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오전 11:48:27
 * @subject
 * @content

 		String의 메서드
 */
public class Ex04_02 {

	public static void main(String[] args) {

		String str = "public static void main(String[] args) {";
		// 1. 문자열 길이 length()
		int len = str.length();
		System.out.println( len ); // 40
		
		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드 charAt(index)
		System.out.println( str.charAt(0) );
		// 가장 마지막 한 문자
		System.out.println( str.charAt(len-1) );
		/*
		str = reverse(str);		// 거꾸로 뒤집어서 첫번째거 가져오도록
		System.out.println( str.charAt(0) );
		*/
		
		// 3. 대문자로 변환하는 메서드
//		str = str.toUpperCase();
//		System.out.println( str );
		// 4. 소문자로 변환하는 메서드
//		str = str.toLowerCase();
//		System.out.println( str );
		
		// 5. true/false  str.matches(String regex)
		
		// 6. String -> char[] 변환해서 사용할 일이 많이 있다.
		char [] strArr = str.toCharArray();
		System.out.println( Arrays.toString(strArr) );
		
		// 7. str.trim()	앞뒤 공백을 제거하는 메서드		[ ltrim()	rtrim() : 자바에는 없지만 왼쪽 오른쪽 제거하는 메서드 ]
		
		// 8. [문제] str 문자열 속에 main 문자를 찾아서 MAIN으로 변경	- contains(), indexOf(), lastIndexOf(), substring(), toUpperCase(), toLowerCase()
		String searchWord = "MaiN";
//		int index = str.indexOf(searchWord);
		int index = str.toUpperCase().indexOf(searchWord.toUpperCase());		// 둘다 대문자로 바꾸고 비교해서 대소문자 상관없이 구분
		System.out.println( str.substring(0, index) + searchWord.toUpperCase() + (str.substring(index + searchWord.length() ) ) ); // 0<=   <index
			
		// substring 가져오는 방식
		// "123456-1234567"
		//  12
		//    34
		//      56
		//         1
		
		/*
		// str.contains : 단순히 있다 없다만 확인
		System.out.println( str.contains("main") );		// true				
		System.out.println( str.contains("kenic") );	// false
		
		// 있는 위치 : indexOf(), lastIndexOf()	// 찾은 위치값을 int로 반환
		System.out.println( str.indexOf("main") );	// 19				
		System.out.println( str.indexOf("kenic") );	// -1		없다면 -1 반환
		
		System.out.println( str.lastIndexOf("main") );	// 19	값이 2개이상이면 값이 달라질 수 있음 			
		System.out.println( str.lastIndexOf("kenic") );	// -1	없다면 -1 반환
		*/
		
		
		// 9. concat()	두 문자열을 연결해서 연결된 문자열을 반환하는 메서드
		String result = "aaa".concat("bbb").concat("ccc");
//		String result = "aaa" + "bbb" + "ccc";		// 이게 더 쉬워서 concat를 잘 쓰지는 않음
		System.out.println( result );
		
		// 10. 두 문자열 비교 equals()				, equalsIgnoreCase()
		String a = "abc";
		String b = "aBc";
		System.out.println( a.equals(b) ); // 둘다소문자:true, 대소문자다르면:false
		// 대소문자 구분하지 않고 같다, 다르다.
		// System.out.println( a.toUpperCase().equals(b.toUpperCase() ) );
		System.out.println( a.equalsIgnoreCase(b) );	// 대소문자 구분x 함수
		
	
		
	} // main

	// (3)번 풀이 : 문자열 거꾸로 바꾸는 메서드
	private static String reverse(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		System.out.print( result );
		return result;
	}

} // class
