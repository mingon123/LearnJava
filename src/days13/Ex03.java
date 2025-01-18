package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오전 10:48:37
 * @subject
 * @content 
 * 
 * 		Car, Engine 클래스 생성
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		[ 클래스들간의 2가지 관계 ]
		1) has-a 관계( 소속 관계 )
			자동차 클래스			- Car
			 ㄴ 엔진(1개) 클래스 	- Engine
		2) is-a 관계( 상속 관계 )
		*/

		// 외부에서 자동차 객체 생성할 때 엔진 객체 주입(inject)
		// 의존성(dependency) 관계가 있다.
		// 의존성 주입( DI )
		//  1) 생성자 통해서 주입
		// 	2) setter 통해서 주입
		
		// 엔진
		Engine a_engine = new Engine();
		Engine b_engine = new Engine();
		Engine c_engine = new Engine();
		
		
		// The constructor Car(Engine) is undefined : 디폴트 생성자만 생성되어 있고 매개변수 있는 생성자는 없음
		// 1) 생성자 통해서 주입
//		Car myCar = new Car(c_engine);		// 이때 Car의 필드들이 메모리에 올라감
		
		Car myCar = new Car();			// default constructor에 엔진 없으면 추가하도록 하여 오류 해결 - 의존성 주입X, NullPointerException 해결방법 중 하나
		Car myCar2 = new Car();
		Car myCar3 = new Car();
		
		// 2번) setter 통해서 의존성 주입
		myCar.setEngine(a_engine);
		
		myCar.getEngine().speed = 100;
		myCar.speedUp(10);
		
		int speed = myCar.getEngine().speed;
		System.out.println("현재 속도 : " + speed); // speed가 int형이라 소숫점이 찍히지 않음

		System.out.println("END");
		
		
		
	} // main

} // class
