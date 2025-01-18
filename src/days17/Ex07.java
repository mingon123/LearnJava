package days17;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 12:40:08
 * @subject
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 래퍼(Wrapper) 클래스
		// 기본형 8가지를 사용하기 쉽도록 기능이 구현된 클래스
		
		// 	기본형   ->  Wrapper 클래스
	    // boolean -> Boolean
	    // char                    -> Character
	    // byte -> Byte
	    // short -> Short
	    // int                        -> Integer
	    // long -> Long
	    // float -> Float
	    // double -> Double
		
		/*
		[상속 계층도]
		
		Object 
		 ㄴ Boolean
		 ㄴ Character
		 ㄴ Number 추상클래스
		 		ㄴ Byte
		 		ㄴ Short
		 		ㄴ Integer
		 		ㄴ Long
		 		ㄴ Float
		 		ㄴ Double
		 		
				ㄴ BigInteger 클래스 - long형보다 큰 정수형
				ㄴ BigDecimal 클래스 - 오차가 없는 정확한 실수값을 저장가능	
		 */
		
		int i = 10;
		// "100" -> int
		int j = Integer.parseInt("100");

		Integer i2 = new Integer(20);	// i2는 객체라고 볼 수 있다.
		
		int j2 = i2.intValue();		// Wrapper클래스 객체를 int 형에 넣을 수 있다.
		
		// Integer.MAX_VALUE;
		// Integer.MIN_VALUE;
		
		// 오토박싱 & 오토언박싱
		// Auto Boxing & Auto UnBoxing
		int x = 100;
		
		// 오토박싱
		// 기본형(int) -> 자동으로 래퍼클래스객체로 변환
		// int -> Integer 형변환 : 오토 박싱(자동으로)
		Integer y = x;
		
		// 오토 언박싱
		// Integer 객체 -> int 형변환
		int z = y;
		
		// 제네릭에서는 기본형을 못쓰고 래퍼클래스 타입을 써야하기 때문에 오토박싱, 오토언박싱을 알아야 한다.
		
		// int -> Integer -> Object
		test(100);

	} // main

	private static void test(Object i) {	// 매개변수를 int를 Object로 받아도 된다.
		// 모든 기본형 -> 래퍼클래스로 오토박싱 -> Object
		// 모든 기본형타입을 매개변수로 사용할 수 있다.
		// System.out.printf();
		
	}

} // class















