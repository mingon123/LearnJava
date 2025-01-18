package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 12:16:39
 * @subject
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("1");
		try {
			// DB 연결( open )
			System.out.println("2");
			System.out.println( 100 / 0 );	// 강제 예외 발생..
			// 연결된 DB CRUD		// 예외가 발생했을 때...
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("4");
		} finally {
			// try 블럭에 예외가 발생하지 않아도 finally 블럭은 실행한다.
			// try 블럭에 예외가 발생해도 		finally 블럭은 실행한다.
			// 예외에 발생 유무에 상관없이 반드시 처리해야하는 코딩을 하는 블럭
			System.out.println("[5]");
			
			// 연결된 DB 닫기( close )
		}
		System.out.println("6");
		System.out.println(" end ");
		
		
		/* 구문 O    catch구문이 없어도, finally구문이 없어도 상관 없음
		try {
			
		} finally {
			
		}
		*/
		
		/* 구문 X    catch나 finally구문 중 무조건 하나 이상은 있어야 함.
		try {
		
		}
		*/
		
		
		
		
		
	} // main

} // class
