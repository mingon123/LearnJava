package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오후 2:01:48
 * @subject
 * @content 
 */
public class Ex04_03 {

//	public static void main(String[] args) {
//		
//		// [3] suffix 마지막 url
//		//			.com 으로 끝나는지 확인
//		String url = "www.naver.com";
//		
////		int index = url.lastIndexOf(".com");
////		System.out.println( index == (url.length() - ".com".length()) );
//		
//		System.out.println( url.endsWith(".com") );	// 접미사:suffix
//		
//		System.out.println(" end ");
//	} // main
//	
//	/* 
//	 	// [2] startWith 시작 url
//		// boolean startWith(접두사) : prefix
//
//	public static void main(String[] args) {
//		String url = "http://www.naver.com";
//		// 입력한 url은 반드시 http:// 문자열로 시작을 해야지 올바른 url이다. 라고 한다면
//		// url.contains("https://"); // X체크불가, 들어가기만 하면 체크하기 때문에 시작을 모름 		
//		
//		// [1]
//		// indexOf() lastIndexOf() // O
//		int index = url.indexOf("http://");
//		if( index == 0 ) System.out.println("올바른 URL이다."); 
//		else System.out.println("잘못된 URL이다.");
//		
//		// [2]
//		// stratsWith() // O
//		if ( url.startsWith("http://") ) System.out.println("올바른 URL이다.");
//		else System.out.println("잘못된 URL이다.");
//		
//		System.out.println(" end ");
//	} // main	
//	*/
		

		//	[1]
	public static void main(String[] args) {	
		// 11. replace()					함수를 알려면 : 기능, 매개변수, 리턴값(리턴자료형)을 알아야 함
		String str = "안녕하세요. admin 홍길동입니다. 안녕~";
		// str 문자열 속에서 홍길동을 찾아서 김민곤으로 변경...
		int index = str.indexOf("홍길동");
		System.out.println(str.indexOf("홍길동"));
		boolean b = str.contains("홍길동");

//		String result =  str.replace('홍', '김');		// 매개변수 char
//		String result =  str.replace('안', 'X');		// 매개변수 char
//		String result =  str.replace("안녕", "XX" );		// replace 2번 : charSquence를 달라고 하지만 String 이나 다른걸 줘도 됨. 다형성 때문에
//		String result =  str.replaceAll("[가-힣]|\\.|\\s", "" );	// String regex 정규표현식, 한글제거, 그냥 .은 모든 문자를 뜻함
		String result =  str.replaceFirst("안녕", "XX" );		// 첫번쨋 것만 바꿈
		System.out.println( result );

		
//	} // main
	}
} // class
