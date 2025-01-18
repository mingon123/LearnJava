package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 9:47:29
 * @subject
 * @content 

		내부클래스에서 외부클래스의 필드에 접근하는 방법
 */
public class Ex01_03 {	// 외부클래스

	// 외부클래스의 필드
	private int outerIv = 0;
	static int outerCv = 0;
	
	
	class InstanceInner{ 	// 1. 인스턴스 변수
		int a= outerIv;  // private 외부 필드
		int b= outerCv;	 // 외부 static 변수
	}		
	
	static class StaticInner{	// 2. static 클래스 
		// static 클래스에서 외부클래스의 인스턴스멤버 접근할 수 없다.
		static int scv = outerCv;	// 외부클래스의 static 멤버는 접근 가능
	}	
		
	
	void method1() {	// 3. Local(지역) 클래스
		
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int c = outerIv;	// 외부클래스 모든 필드 접근 가능
			int d = outerCv;	// 외부클래스 모든 필드 접근 가능
	
			int x = lv;		// 원래는 안됨. (JDK1.8부터 가능하다)
			int y = LV;		// 원래는 안됨. (JDK1.8부터 가능하다)
			
		}		
	}
	
	public static void main(String[] args) {
		

	} // main

} // class
