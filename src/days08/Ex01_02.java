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
	
	4) Call By Point <- java에는 없음

 */


import days07.Sample;

public class Ex01_02 {

	public static void main(String[] args) {

		int x = 10, y = 20; // main 지벽변수
		int [] m = new int[2];
		m[0]=x;
		m[1]=y;
		System.out.printf("1. main x=%d, y=%d\n", m[0], m[1]);
	
		swap(m); // 메서드 호출부  Call By Reference
		
		System.out.printf("2. main x=%d, y=%d\n", m[0], m[1]);
	} // main
	
	// 메서드 선언부
	public static void swap(int [] m) { // swap 지역변수 // swap m은 main m과 다른 m이지만 같은 주소를 참조한다.
		{
			System.out.printf("1. swap x=%d, y=%d\n", m[0], m[1]);
			int temp = m[0];
			m[0] = m[1];
			m[1] = temp;
			System.out.printf("2. swap x=%d, y=%d\n", m[0], m[1]);
		}
	}

	
	
}
