package days13;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		/* [문제]
		10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
		String n = "keNik";   
		String m= "kKnie";    
		*/
		
		String n = "keNik";   
		String m= "kKnie";    
		
//		n = toUpperCase(n);
		
		// String.toUpperCase() 메서드를 사용하면 됨 ( 함수 선언할 필요 없음)
		n = n.toUpperCase(); // "KENIK"	 ->	오름차순 정렬
		m = m.toUpperCase(); // "KKNIE"	 ->	오름차순 정렬
//		System.out.println(n);

		/* 여러번 반복되기 대문에 함수 선언해서 사용
		// n, m 문자열이 같냐 비교
		// String -> char[] 변환 -> 정렬 후 -> String : (arrays.sort에 string형은 없음)
		char [] nArr = n.toCharArray();
		Arrays.sort( nArr );
//		System.out.println(Arrays.toString(nArr));
		// char[] -> String
		n = String.valueOf( nArr );
		*/
		
		n = stringSort(n);
		m = stringSort(m);
		
		System.out.println(n);
		System.out.println(m);
		
		// 두 문자열의 비교 : String.equals()
		if ( n.equals(m) ) {
			System.out.println( "같다" );
		} else { 
			System.out.println( "다르다" );
		}
		
	} // main

	private static String stringSort(String str) {
		char [] nArr = str.toCharArray();
		Arrays.sort( nArr );
		return str = String.valueOf( nArr );
	}

	// "keNik"
	public static String toUpperCase(String str) {
		String result = "";
		char ch = '\u0000';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if( Character.isLowerCase(ch) ) result += (char)(ch-32);
			else result += ch;			
//			if ('a' <= ch && ch <= 'z' ) {
//				result += (char)(ch - 32);
//			} else {
//				result += ch;
//			}
		}
		return result;
	}
	
} // class
