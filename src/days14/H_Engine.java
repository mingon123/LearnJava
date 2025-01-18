package days14;

public class H_Engine implements Engine {

	// 필드
	int speed;
	
	// 메서드
	@Override
	public void moreFuel(int fuel) {	// 인터페이스는 접근지정자가 자동으로 public abstract이므로 오버라이딩한 이것도 public을 붙여야 오류가 생기지 않음
		this.speed += fuel * 0.07;
	}
	
	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.07;
	}
	
	@Override
	public void stop() {
		this.speed = 0;
	}
	
}
