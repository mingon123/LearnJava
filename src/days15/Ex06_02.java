package days15;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 2:12:38
 * @subject
 * @content 

		[ 예외처리 2번째 방법 : throws 문 설명 ]
		[ 사용자 정의 예외 선언 + throw문 강제로 예외 발생..]  예제	<- throws와 다름.
 */
public class Ex06_02 {

	public static void main(String[] args) {	// main 함수에서 throws IOException : 예외처리하지 않음
		// 국어 점수를 입력받아서 수~가 출력
		
		// 반드시 예외 처리를 해야한다.
		// 1) try~catch 문 - 여기서 문제를 해결
		// 2) throws 문	- 예외를 떠넘기는 것으로, main 함수에서 예외를 떠넘기는 일은 예외를 처리하지 않는다는 것이다.
		
		int kor = 0;
		try {
			kor = getScore();
			System.out.println("국어=" + kor);
		} catch (IOException | ScoreOutOfBoundException e) { // 멀티 catch문
			System.out.println( e.getMessage() );
		}
		
		System.out.println(" end ");
		
		
	} // main
																					// 2개 이상 예외가 있는 경우 2개 모두 각각 예외처리를 해줘야 한다. - 다중catch, 멀티catch 문으로
	private static int getScore() throws IOException, ScoreOutOfBoundException {	// throws IOException = 메인함수로 예외를 떠넘김 -> 무조건 main에서 예외처리를 해야한다.
		Scanner scanner = new Scanner(System.in);
		int score = 0 ;

		System.out.println("> 점수 입력 ? ");
		String input = scanner.next();
		
		String regex = "100|[1-9]?\\d"; // 0~100
		if ( input.matches(regex) ) {
			score = Integer.parseInt(input);
		} else {
			//		InputOutput
			//			입/출력 예외 발생
			// 강제 예외 발생시키도록 하겠다.
			throw new ScoreOutOfBoundException("> 점수 범위(0~100)!!!");

		}
		
		return score;
	}

} // class


// [ 사용자 정의 예외클래스 선언 ] - 점수 0~100점 범위... 아닐경우 발생시킬 예외 클래스
//class ScoreOutOfBoundException extends RuntimeException{
class ScoreOutOfBoundException extends Exception{

	private static final long serialVersionUID = 6713716862026285718L;
	
	// 예외 코드 번호를 저장할 필드 선언
	private final int ERROR_CODE;	// 한번 선언하면 바꿀 필요없어서 final
	
	// 디폴트 생성자
	public ScoreOutOfBoundException(String message) {
		super(message);
		this.ERROR_CODE = 1004;
	}
	
	// 생성자
	public ScoreOutOfBoundException(int eRROR_CODE, String message) {
		super(message);
		this.ERROR_CODE = 1004;
	}
	
	// setter X, getter O
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	// setter X(final이라 setter는 못 만듦)
	
}
