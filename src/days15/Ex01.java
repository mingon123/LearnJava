package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 9:23:13
 * @subject
 * @content 

		내부클래스
		
각각의 내부클래스 안에 인스턴스변수, 클래스변수, 상수 선언해서 사용가능한지 확인
 */
public class Ex01 {

	// 1. 인스턴스 클래스
	class InstanceInner {
		int iv = 100; // 인스턴스 변수
		// static int cv = 100;  // 클래스(static) 변수 [에러] - 논스태틱 클래스에 스태틱 변수를 선언하면 에러가 생긴다.
		final static int CONST = 100; // 상수 [가능] - final static은 가능
	}
	
	// 2. static 클래스
	static class StaticInner {
		int iv = 200; // 인스턴스 변수
		static int cv = 200;  // 클래스(static) 변수 [사용가능]
		final static int CONST = 100; // 상수 [가능] - final static은 가능
	}
	
	
	void method1() {
		
		// 3. 로컬(Local) 클래스
		class LocalInner{
			int iv = 300; // 인스턴스 변수
			// static int cv = 100;  // 클래스(static) 변수 [에러] - 논스태틱 클래스에 스태틱 변수를 선언하면 에러가 생긴다.
			final static int CONST = 100; // 상수 [가능] - final static은 가능
		}
	}

	public static void main(String[] args) {
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.CONST);
		System.out.println(StaticInner.cv);
		// System.out.println(LocalInner);	// 로컬클래스는 호출 불가
	}
	
}
