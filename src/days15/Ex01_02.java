package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 9:33:47
 * @subject
 * @content 

모든 클래스는 따로 파일이 생김 - .bin 파일에서 확인 가능

클래스간 접근 가능 정도 파악
 */
public class Ex01_02 {

	// 내부클래스
	class InstanceInner{}
	static class StaticInner{}
	
	// 외부의 인스턴스 멤버 간에 서로 직접 접근 가능
	// Ex01_02 클래스의 인스턴스 변수 + 자료형 ( 내부 인스턴스 클래스명 ) - 접근 가능
	// InstanceInner iv;	//  = new InstanceInner();
	InstanceInner iv = new InstanceInner();
	
	// Ex01_02 클래스의 static 변수 + 자료형 ( 내부 static 클래스명 ) - 접근 가능
	// static StaticInner cv;  // = new StaticInner();
	static StaticInner cv = new StaticInner();

	
	// 인스턴스 메서드
	void method1() {
		class LocalInner{}	// 초기화 블럭, 메서드 안 선언 가능, 사용 가능
		
		LocalInner lv = new LocalInner();
		// 인스턴스 메서드 안에서 내부클래스(인, S) 모두 접근 가능
		InstanceInner obj1 = new InstanceInner(); // O
		StaticInner obj2 = new StaticInner(); // O
	}
	
	// 클래스 메서드
	static void method2() {
		// LocalInner lv = new LocalInner(); // X - 절대 접근 불가
		
		// InstanceInner obj1 = new InstanceInner(); // X
		// [해결]인스턴스 클래스를 굳이 객체생성해서 사용하려면 
		// 		외부 객체를 먼저 생성 후 인스턴스 클래스 객체를 사용할 수 있다.
		Ex01_02 outer = new Ex01_02();
		InstanceInner obj3 = outer.new InstanceInner();	// O 인스턴스 클래스를 static 메서드 안에서 객체 생성하기
		
		StaticInner obj2 = new StaticInner(); // O
	}
	
	
	public static void main(String[] args) {
		

	} // main

} // class
