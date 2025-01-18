package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 5:04:42
 * @subject
 * @content

		[내부(inner) 클래스] == 중첩 클래스
		- AWT, Swing과 같은 GUI 어플리케이션에서 이벤트 처리할 때 자주 사용
		- 
 */
public class Ex11 {

	public static void main(String[] args) {
		
		/*
		[내부 클래스의 종류와 특징] - 선언위치
		1. 인스턴스(instance) 클래스	: 외부 클래스의 필드에 선언 위치가 잡힘
									주로 외부클래스의 인스턴스 멤버들과 관련된 작업을 할 목적으로 선언된 내부 클래스
									
		2. 정적(static) 클래스		: static 멤버처럼 다루어진다
									주로 외부클래스의 static 멤버들과 관련된 작업을 할 목적으로 선언
									
		3. 지역(local) 클래스		: 외부 메서드 안, 초기화 블럭 안 선언
		
		4. 익명(anonymous) 클래스	: 클래스명X (일회용)
									클래스 선언 + 생성 (동시)
		
		*/
		
	} // main
	
} // class


class Outer {
	// 필드
	int iv = 0;	// 인스턴스 변수
	static int cv = 0; // 클래스변수
	// 외부 클래스의 필드에 선언 위치가 잡힘.
	class InstanceClass{
		// 주로 외부클래스의 인스턴스 멤버들과 관련된 작업을 할 목적으로 선언된 내부 클래스
	}
	
	static class StaticClass{
		// static 멤버처럼 다루어진다.
		// 주로 외부클래스의 static 멤버들과 관련된 작업을 할 목적으로 선언
	}
	
	
	{
		// 초기화 블럭
	}
	
	// 메서드
	void method1() {	// 메서드 안에서만 사용할 수 있는 클래스
		class LocalClass{ // 로컬클래스		( 메서드안 or 초기화 블럭에서 선언된 클래스)
		}
	}
}





/* 클래스 2개를 선언.
class Car{
   
   public Engine engine;
   
}

class Engine{
   
}
*/


/*
// Engine 클래스가 Car클래스에서만 사용된다면 내부에서 선언 -> 멤버처럼 사용된다. == 중첩클래스
class Car{   // 외부 클래스 
   
   // 멤버 선언
   public class Engine{  // 내부 클래스
      // 장점 : 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 
      //       코드의 복잡성을 줄일 수 있다 ( 캡슐화 )
   }
   
}
*/




// 앞으로 공부할 내용 순서
	// 중첩(내부) 클래스
	// 예외처리
	// Object 메서드 설명
	// 문자열 다루는 클래스
	// 날짜, 시간 다루는 클래스
	// 컬렉션 프레임워크
	// 자바 IO (입출력)