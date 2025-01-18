package days11;

//클래스 선언 부분
public class Car {

	// 지역변수 X
	// 필드(filed) == 속성 == 특성 == property == 멤버변수
	String name; // 자동차 이름
	int speed; // 속도
	int wheelCOunt; // 바퀴수
	
	// 메서드(method) == 기능 == 일 == 멤버함수
	public void dispCarInfo() {
		System.out.printf("> 차명:%s, 속도:%d \n", name, speed);
	}
	
}

// 프로그램 시작할 필요없어서 main함수 필요없음
