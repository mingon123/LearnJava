package days03;

/*

 래퍼클래스 설명
 MAX_VALUE
 parseXXX()
 문자열 국어점수 "90" -> byte 형변환 코딩 + 출력

*/

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		
		[Byte.parseByte() 설명]
		기본형	클래스 == 물건 == 개체 == 객체 == Object
				래퍼(wrapper) 클래스
				기본형을 사용하기 쉽도록 기능(메서드)을 구현한 클래스
		byte	byte
		long	Long
		boolean Boolean
		
		*/

		/*
		
		long 가장 큰 값?
		=> 8바이트 = 2^64 = 18,446,744,073,709,551,616, 
		=> 범위: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807, 약 -900경 ~ 900경
		
		System.out.println( Long.MAX_VALUE);
		
		"90" -> byte형으로 형 변환
		byte kor = Byte.parseByte("90");
		int kor = Integer.parseInt( "90" );
		long kor = Long.parseLong( "90" );
		double kor = Double.parseDouble( "90" ); 
		
		- 위와 같이 다른 형태로도 바꿀 수 있다.
		 */
		
		System.out.println( Long.MAX_VALUE);
		
		byte kor;
		System.out.println( Byte.MAX_VALUE);
		
		
		
		
	}

}
