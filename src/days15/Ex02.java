package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 10:17:19
 * @subject 1. 인스턴스클래스, 2. static클래스, 3. 로컬클래스
 * @content 
 		
 		4. 익명클래스( anoymous class ) == 무명 클래스 == 클래스의 이름이 없다.
 			특징
 			1) 클래스의 선언과 동시에 객체를 생성하는 이름없는 클래스
 			2) 일회용( 오직 1개 객체만 생성 )
 			3) 주로 GUI 어플리케이션의 이벤트 처리에 사용.
 				( AWT, Swing ) <- 자바에서는 이건데 수업안함
 			4) 익명 클래스의 선언 형식
 			  (1) 형식
 				// new Person(); <- 객체 생성 코딩
 				
 				new 부모클래스명() {
 					// 멤버 -	마음대로 선언할 수 없다.
 					부모클래스의 메서드만을 오버라이딩해서 사용할 수밖에 없다.
 				};
 				
 			  (2) 형식
 				new 구현할인터페이스명() {
 					인터페이스의 추상메서드만을 오버라이딩해서 사용할 수밖에 없다.
 				};
 			
 			
 */
public class Ex02 {

	public static void main(String[] args) {
		// 기존에는 이렇게 했었음
		
		// 2. 객체 생성 부분
		Person p1 = new Person();
		p1.toString();


	} // main

} // class

// 1. 클래스 선언 부분
class Person{ }


