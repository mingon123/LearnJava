 package days07;

public class Sample {
	
	
//	[함수 선언부]
//	1. 기능 : 선을 그리기  drawLine
//	2. 매개변수 : X
//	3. 리턴값 : X, void
	public static void drawLine() {
		System.out.println("-------------"); // 50줄
	}
	
	// overloading 오버로딩 == 중복함수
	// 동일한 이름으로 함수를 중복 선언한 것.
	// 조건) 매개변수 갯수, 타입이 달라야 된다. 리턴자료형은 상관X
	//Duplicate method drawLine() in type Ex01_02 - 중복 선언
	public static void drawLine(int n) { //<- 매개변수(타입이나 개수가 다른)를 주면 다른 함수로 취급 : 오버로딩
//		for (int i = 1; i <= n; i++) {
//			System.out.print("-");
//		}
		System.out.println("-".repeat(n) );
		System.out.println(); // 50줄
	}


	public static void drawLine(String style, int n) { //<- 매개변수(타입이나 개수가 다른)를 주면 다른 함수로 취급 : 오버로딩
		System.out.println(style.repeat(n) );
		System.out.println(); // 50줄
	}	
	
}
