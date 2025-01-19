package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:33:05
 * @subject
 * @content 
 */
public class Ex04_08 {

	public static void main(String[] args) {

		/*
		// 1. String -> char[] 변환
		String name = "admin";
		char [] nameArr = name.toCharArray();
		
		// 2. char[] -> String 변환
//		name = String.valueOf(nameArr);
		name = new String(nameArr);
		*/
		
		// 3. String -> byte[] 변환
		String name = "admin";
		byte [] nameArr = name.getBytes();
		
		// 4. byte[] -> String 변환
		name = new String(nameArr);
		
		
		
		// 아래는 그냥 name. 찍어보고 뭐가 있는지 확인해봄
		
		// IntStream 이기 때문에 결과를 int형으로 반환
//		name.chars().forEach(i->System.out.println(i));
		
		// 그냥 object 오버라이딩한거 확인만 함. 계산 수식만 다르다. 중요하진 않다.
//		System.out.println( name.hashCode() );
		
		if( name.isEmpty() ) {}
		if( name.length() == 0 ) {}	// 위와 2개 같다
		
		name.subSequence(0, 0);
		name.repeat(10);	// 반복
		name.lines();
		System.out.println(name.lines());
		
		
	} // main

} // class
