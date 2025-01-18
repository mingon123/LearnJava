package days08;

/*

	개념파악 이해 중요*****
	
	매개변수 + 메서드를 호출하는 방법
	1) Call By Name : 매개변수 없이, 메서드를 호출하는 경우
			ex) drawLine();
	2) Call By Value : 지금까지 배운 Call By Name을 제외한 모든 경우
			메서드를 호출할 때 x, y가 아닌 그 안의 값을 넘김
	3) Call By Reference
	
	참조형 자료형 - 배열, 클래스, 인터페이스
	
	X 4) Call By Point <- java에는 없음

 */


import days07.Sample;

public class Ex01 {

	public static void main(String[] args) {

		// 다른 패키지 안의 Sample클래스의 drawLine() 호출 사용
//		Sample.drawLine(30);

		int x = 10, y = 20; // main 지벽변수
		System.out.printf("1. main x=%d, y=%d\n", x, y);

		/*
		{
			int temp = x;
			x = y;
			y = temp;
		}
		*/
		
		swap(x, y); // 메서드 호출부
		
		System.out.printf("2. main x=%d, y=%d\n", x, y);
	} // main
	
	// 메서드 선언부
	public static void swap(int x, int y) { // swap 지역변수
		{
			System.out.printf("1. swap x=%d, y=%d\n", x, y);
			int temp = x;
			x = y;
			y = temp;
			System.out.printf("2. swap x=%d, y=%d\n", x, y);
		}
	}

	
	
}
