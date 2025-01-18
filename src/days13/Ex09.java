package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오후 3:28:49
 * @subject
 * @content 
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		[final 키워드 설명]
		1. 변수 앞에 - 상수
			지역변수
			인스턴스 변수
			클래스 변수
			
		2. 메서드 앞에
			Ex06.java
			  ㄴ Parent 클래스
			  ㄴ Child 클래스
			  
			오버라이딩을 할 수 없는 마지막(최종) 메서드를 선언할 때 final 키워드를 메서드 앞에 붙인다.
		
		3. 클래스 앞에
			final class SalesMan extends Regular{
			}
			ㄴ 더 이상 자식 클래스를 가질 수 없는 최종(마지막) 클래스이다.
		 */
		
		// 접근지정자 X, 지역변수
		// public final double PI = 3.141592; X
		final int MAX_VALUE = 10;
		
		Sample s= new Sample(100);
		s.plus(111);
		
	} // main
	
} // class

class Sample{
	// 지역변수 X
	// 멤버 변수 o
	// 필드 o
	//  ㄴ 인스턴스 변수 O
	// double pi = 3.141592;
	// final double PI = 3.141592; // 상수
	public final double PI = 3.141592; // 상수  1) 명시적 초기화

	// 클래스 변수 -> 상수		// 클래스 변수인 동시에 상수
	public final static double MIN_VALUE = 1; // static final, final static 둘다 가능
	
	// The blank final field MAX_VALUE may not have been initialized : 초기화안됨
	public final int MAX_VALUE; // 상수 - final은 필드에서도 자동으로 초기화안된다.
	{
		// MAX_VALUE = 100;   2) 초기화 블럭
	}
	
	// 3) 생성자 초기화
	public Sample(int maxValue) {
		this.MAX_VALUE = maxValue;   
	}
	
	public void plus(final int value) {  // 111
		// 			매개변수
		//			지역변수		== 상수
		
		// value++;			한번 초기화하면 이렇게 값 변경은 못하고 사용만 할 수 있음 == 상수
		// value = 102;
	}

}












