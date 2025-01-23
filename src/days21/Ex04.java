package days21;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 12:05:47
 * @subject
 * @content

  		[ 열거형(enums) ]
 */
public class Ex04 {

	public static void main(String[] args) {
		// 성별(gender) 남/여 상수화 처리...하여 구분
		// 남: 1,    여: 0     구분
		// 남: true, 여: false 구분
		// 남: 'm',  여:'f'    구분
		
		// 카드 게임 
		// 구분하기 어렵거나 0,1,2,3으로 구분하고 주석처리로 구분해야하기 때문에 열거형 사용 
		// 열거형(Enum) 사용 - 서로 관련된 상수를 선언한 것. 컴파일러 클래스 변환
		
		/*
		switch ( cardType ) {
		case Card.CLOVER:   // 클로버 -> 이렇게 사용
			break;
		case 1:   // 하트
			break;
		case 2:   // 다이아몬드
			break;
		case 3:   // 스페이스
			break;
		}
		*/
		
		
		
		
		
	} // main

} // class

/*
// 이렇게 했었는데 열거형은 04_02, Card.java 에서 설명
class Card {
	public static final int CLOVER = 0;
	public static final int HEART = 1;
	public static final int DIAMOND = 2;
	public static final int SPADE = 3;
}
*/

// 열거형(enum)



















