package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 10:07:17
 * @subject
 * @content 
 
 		외부클래스가 아닌 완전 다른 클래스에서
 		내부클래스의 멤버를 접근하는 방법
 */
public class Ex01_04 {	// 다른 클래스

	public static void main(String[] args) {
		
		Outer outer = new Outer(); // 외부클래스 객체 생성
		Outer.InstanceInner icObj = outer.new InstanceInner();	// 내부클래스 instanceInner 객체 생성
		System.out.println( icObj.iv ); // A
		
		// Outer.x;
		System.out.println( Outer.StaticInner.cv ); // static이라 메모리 올라가 있어서 객체 생성 안해도 됨
		// ㄴ static 내부클래스(StaticInner)의 인스턴스변수 접근 방법.
		Outer.StaticInner siObj = new Outer.StaticInner();  // new로 생성하지 않고 Outer 객체 만들어서 객체를 가져옴
		System.out.println( siObj.iv );
		
		
		// 로컬클래스는 외부에서 접근 불가
		
	} // main

} // class

class Outer{	// 외부클래스
	
	static int x = 100;	// 이렇게 있다면 Outer.x로 접근
	
	class InstanceInner{
		int iv = 100; // A
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void method1() {
		class LocalInner{ 
			int iv = 400;
		}
	}
}













