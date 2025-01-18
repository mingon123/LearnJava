package days14;

public class K_Engine implements Engine {

	// 필드
	int speed;
	
	// 메서드
	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.04;
	}
	
	@Override
	public void lessFuel(int fuel) {
		this.speed -= fuel * 0.04;
	}
	
	@Override
	public void stop() {
		this.speed = 0;
	}
	
}
