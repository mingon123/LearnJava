package days15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 11:39:46
 * @subject
 * @content 
		try~ catch문 사용 예외처리
		
Ex03_03복사해서 
- 멀티 catch 블럭 추가 - bitOR 연산자 사용
- 예외 정보를 출력 + 확인 추가

 */
public class Ex03_04 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		Random rnd = new Random();
		int [] m = new int [5];
		
		// ArithmeticException: / by zero <- 0으로 나누었을 때 생기는 오류. 개발자가 0으로 못나누게 바꿔야 함
		
		// 다중 catch 블럭	(중첩 X, 여러개 선언 가능)
		for (int i = 0; i < 10; i++) {
			try {
				// 예외가 발생할 것 같은 코딩 여기에 작성
				result = number / rnd.nextInt(5);	// 0<= 정수 <5 발생
				System.out.println( result );
				
				// ArrayIndexOutofBoundsException	방이 5번까지만 있어서 오류
				/*	[1] 중첩 try~catch 문 사용 가능.
				try {
					// index 5~9 계속 발생
					m[i] = result;
				} catch (ArrayIndexOutOfBoundsException e) {
					// 예외처리... ex) m 배열크기 +5 증가..
					m = Arrays.copyOf(m, m.length+5);
					m[5] = result;	
				}
				*/
				m[i] = result;
				//
				//				
				// jdk1.7 추가	멀티 catch 블럭...
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				// 예외 처리
				// System.out.println(0);
				/*
				// 예외 정보를 출력 + 확인 	방법 3가지 차이 (암기)
				e.printStackTrace();	// 전체 에러 정보 출력(예외 타입, 메시지, 발생 위치, 호출 스택)
				System.out.println( e.getMessage() ); 	// 간단한 에러 메시지 출력(예외 메시지(간단한 설명))
				System.out.println( e.toString() );		// 예외의 타입과 메시지 출력(예외 타입 + 메시지)
				*/
			} catch (Exception e) {
				// 다중 catch 문을 사용할 때의 주의할 점
				//  ㄴ 부모Exception catch문을 밑에 코딩한다. ( 부모가 먼저 오면 거기서 모든 오류가 걸려서 아래는 실행되지 않음 )
			}
		} // for
		
		System.out.println("end");
		
		/*
		try {
			// 1
			// 2
			// 3	예상치 못한 예외 발생..		예외가 발생하면 아래는 실행하지 않고 바로 catch문으로 넘어감
			// 4
			// 5	예상치 못한 예외 발생..
			:
			// 100 
		} catch (Exception e) {		// 모든 예외가 발생하면 처리...		Exception이 예외처리 최상위 클래스이기 때문
			// 예외 처리.. 코딩~~
		}
		*/
		
		// ~~정상적으로 실행됨
		// ~~정상적으로 실행됨

		
	} // main
	
} // class
