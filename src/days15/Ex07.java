package days15;

import java.io.IOException;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:26:15
 * @subject
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {

		method1();
		
	} // main

	private static void method1(){ // throws IOException을 어디까지 throws 할건지는 사용자가 알아서 정하면 됨

		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	// 메서드 선언(throws 하도록)
	private static void method2() throws IOException {
		
		throw new IOException("메서드2에서 예외 발생");
		
	}

} // class
