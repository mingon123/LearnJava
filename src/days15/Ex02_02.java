package days15;

import days13.Employee;
import days14.Car;
import days14.Engine;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오전 10:27:50
 * @subject
 * @content 

일회성으로 테스트 목적으로 여기서만 사용할 것임.
-> 굳이 이름까지 주며 사용할 필요가 없음
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// 지금까지 한 내용 순서대로
		// Car 클래스
		// Engine 클래스
		// - has-a 관계 ( 포함(==소속) 관계)
		
		// Engine 인터페이스
		// K_Engine 클래스 implements Engine	*0.07
		// H_Engine 클래스 implements Engine	  :
		// X_Engine 클래스 implements Engine	  :
		// 이렇게 각각 다른 엔진을 Car 클래스에 적용하도록 함.
		
		// Y_Engine 클래스명...  <- 새로운 엔진
		Car myCar = new Car();
//		myCar.setEngine(new Y_Engine());	// DI == 의존성 주입
		
		myCar.setEngine(new Engine() {		// new 치고 ctrl+space하니 interface가 보여서 엔터치면 자동으로 오버라이딩할 추상메서드가 추가됨
											// 다른데서는 쓸 일 없고, 여기서만 테스트하고 버릴 용도로만 사용하는 일회용일 때 익명클래스 사용
			@Override
			public void moreFuel(int fuel) {
				System.out.println("스피드 올리는 메서드 구현");
			}

			@Override
			public void lessFuel(int fuel) {
				System.out.println("스피드 줄이는 메서드 구현");
			}

			@Override
			public void stop() {
				System.out.println("멈추는 메서드 구현");
			}
		});

		myCar.speedUp(10);
		
		System.out.println(" end ");
		
		
		// 추상메서드는 무조건 써야하지만 아닌 경우는 alt+shift+s -> Override Method 로 추가할 수 있다.
		// 일회용 - 임시직형태의 사원
		Employee emp = new Employee() {
			
			@Override
			public void dispEmpInfo() {
				super.dispEmpInfo();
			}

			@Override
			public int getPay() {
				return 100000;	// 날짜도 필요없고 그냥 한번만 쓸거기 때문에 이렇게만 선언하면 됨
			}
		};	
		
		
		
	} // main

} // class


// 새로운 Y엔진
class Y_Engine implements Engine {

	@Override
	public void moreFuel(int fuel) {
		System.out.println("스피드 올리는 메서드 구현");
	}

	@Override
	public void lessFuel(int fuel) {
		System.out.println("스피드 줄이는 메서드 구현");
	}

	@Override
	public void stop() {
		System.out.println("멈추는 메서드 구현");
	}
	
}