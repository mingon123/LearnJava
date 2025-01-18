package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오후 3:06:47
 * @subject
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		1. 단일 상속 / 다중 상속
		2. 자바는 다중 상속을 지원하지 않는다.
			왜 ? 서로 다른 클래스로부터 상속 받은 멤버(필드) 간의 이름이 같은 경우 어떻게 구별할 수 있는 방법이 없다. (단점)
			-> 인터페이스를 사용해서 다중 상속을 대신할 수 있다.
		 */
		
	} // main
	
} // class

class TV { // TV
	// 필드, 메서드, 생성자
	int volumn;
}

class VCR { // 비디오
	// 필드, 메서드, 생성자
	int volumn;
}

// 다중 상속 X - java에서는 불가
/*
class TVCR extends TV, VCR{
	int volumn; // TV 클래스에서 상속
	int volumn;	// VCR 클래스에서 상속
}
*/

/*
// 단일 상속( single inheritance )
class TVCR extends TV{ // TV+비디오
	
}
*/


