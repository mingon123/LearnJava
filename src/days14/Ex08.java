package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 3:49:39
 * @subject
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		// [인터페이스 활용 예제 설명]
		// days13.Car.java
		// days13.Engine.java 복사 붙이기 -> days14 패키지에
		
		Car myCar = new Car(new H_Engine());
		myCar.setEngine(new K_Engine());
		myCar.speedUp(10); // *0.07
		
		
		// 5년 뒤에 X_Engine 	speedUp -> *0.15
		myCar.setEngine(new X_Engine());
	}

}
