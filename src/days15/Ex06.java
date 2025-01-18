package days15;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 12:35:21
 * @subject
 * @content

		[ 예외처리 2번째 방법 : throws 문 설명 ]
		[ 사용자 정의 예외 선언 + throw문 강제로 예외 발생..]  예제	<- throws와 다름.
 */
public class Ex06 {

	public static void main(String[] args) {	// main 함수에서 throws IOException : 예외처리하지 않음
		
		// System.in.read();
		
		// 국어 점수를 입력받아서 수~가 출력
		
		// 반드시 예외 처리를 해야한다.
		// 1) try~catch 문 - 여기서 직접 문제를 해결
		// 2) throws 문	- 예외를 호출하는 곳으로 떠넘기는 것으로, main 함수에서 예외를 떠넘기는 일은 예외를 처리하지 않는다는 것이다.
		
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("국어=" + kor);
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println( e.getMessage() );
		}
		
		System.out.println(" end ");
		
		
	} // main

	private static int getScore() throws IOException {	// throws IOException = 호출하는 곳으로 예외를 떠넘김 -> 무조건 main에서 예외처리를 해야한다.
		Scanner scanner = new Scanner(System.in);
		int score = 0 ;

		System.out.println("> 점수 입력 ? ");
		String input = scanner.next();
		
		String regex = "100|[1-9]?\\d"; // 0~100
		if ( input.matches(regex) ) {
			score = Integer.parseInt(input);
		} else {
			// 강제 예외 발생시키도록 하겠다.
			throw new IOException("> 점수 범위(0~100)!!!");	// checked예외여서 컴파일에서 확인하기 때문에 오류 발생		- 호출하는 곳에서 해결해야함.
//			throw new ArithmeticException("> 점수 범위(0~100)!!!");	// unchecked예외여서 컴파일러가 예외체크를 하지 않음
		}
		
		return score;
	}

} // class
