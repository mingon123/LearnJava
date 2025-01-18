package days14;

public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;
	
	// 필드(자료형이 클래스인 필드)
	// has-a 관계
	// 결합력이 높은 코딩. 좋지 않은 코딩. ( Car이 호출될 때 Engine도 함께 호출되기 때문 )
	// private Engine engine = new Engine(); // 명시적 초기화 - // 원래는 명시적 초기화, 초기화블럭에서 생성된게 있는지, 생성자 초기화 어디에도 new연산자가 없음.
	// java.lang.NullPointerException - 위처럼 new Engine추가하여 해결
	private Engine engine = null;

	// private static Engine engine = null;  // 이걸 붙이면 엔진 하나를 모든 차가 공유한다는 뜻
	
	public Engine getEngine() {
		return engine;
	}

	// 매개변수가 interface 이므로 '매개변수 다형성'에 의해 확장성 좋음 
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	// 디폴트 생성자
	public Car() {
		this.engine = new K_Engine();
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드
	public void speedUp( int fuel ) {
		// java.lang.NullPointerException
		this.engine.moreFuel(fuel);	// 멤버를 가리키는 this
	}
	
	public void speedDown(int fuel ) {
		this.engine.lessFuel(fuel);
	}
	
	public void stop() {
		this.engine.stop();
	}

}
