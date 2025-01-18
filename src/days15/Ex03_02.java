package days15;

import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 11:32:30
 * @subject
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		Random rnd = new Random();
		
		// ArithmeticException: / by zero	<- 0으로 나누었을 때 생기는 오류. 개발자가 0으로 못나누게 바꿔야 함
//		for (int i = 0; i < 10; i++) {
//			result = number / rnd.nextInt(5);	// 0<= 정수 <5 발생
//			System.out.println( result );
//		} // for
		
		// 위 코드를 예외처리라고 하지 않음. 계속 if문이 계속 실행하기 때문에 좋지 않은 코드. 
		// 예외처리는 오류발생했을 때만 그 문제를 해결하는 코드 
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5);
			if( n == 0 ) {
				i--;
				continue;
			}
			result = number / n ;	// 0<= 정수 <5 발생
			System.out.println( result );
		} // for
		
		
	} // main

} // class
