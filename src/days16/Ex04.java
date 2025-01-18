package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오전 11:28:15
 * @subject
 * @content 

		[문자열을 다루는 클래스]
		1) String 클래스			******특징 : 불변**(이유까지 암기)
		2) StringBuffer 클래스
		3) StringBuilder 클래스
		4) StringTokenizer 클래스
		
		
		앞으로 배울 내용
		java.util 패키지 안의 클래스 정리
		날짜/시간 다루는 클래스
		컬렉션 프레임워크 ( JCF )
		:
 */
public class Ex04 {

	public static void main(String[] args) {
		// [ String 클래스 ]
		// 다른 언어에서는 문자열 : 문자의 나열	char[] 형태로 나타내기도 함
		// 자바 : String 클래스 사용.	-> 참조형(첫문자 대문자 - 클래스)
		// (암기) "변경 불가능한(immutable) 클래스"
		
		// String name = new String();	// 지금까지 배운적없음
		String name = "홍길동";		// 힙영역에 '홍길동'이라는 문자열이 잡히고 그 주소값이 '홍길동'임 그게 name 객체를 가리킴
//		String name = new String("홍길동");	// 이게 원칙이지만 너무 자주 사용되어서 편리하게 사용하기 위해
		
		String name2 = "홍길동";		// '홍길동' 주소값(인스턴스)를 가져와서 name2에 대입하기 때문에 ==연산자를 사용하면 true가 나옴
		System.out.println( name == name2 ); 
		
		name = "이창익";	// 새로운 인스턴스(이창익)가 힙영역에 올라가서 name을 가리킴 - 홍길동은 사라지지 않고 그대로 남아있음 : 변경 불가능한 클래스
		
		System.out.println( name.toString() );
		System.out.println( name );		// .toString()은 생략된것
		
		
		
		
	} // main

} // class
