package days12;

// 필드만 입력하고 생성자, 메서드는 
// alt + shift + s : generate constructor, getter/setter 로 만들기

// 저축 클래스
public class Save {

	// 필드
	// 인스턴스 변수
	private String name; // 예금주
	private int money;  // 예금액
	
	// private double rate = 0.02; // 이자율
	// 클래스 변수 == 정적(static) 변수 == 공유(Shared) 변수
	private static double rate = 0.02;  // - 변하지 않는 값이기 때문에 static을 붙여 메모리 공간을 절약한다.
	
	// 생성자
	public Save(String name, int money, double rate) {
		// super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// 디폴트 생성자
	public Save() {
		// super();
	}

	// 메서드
	// 예금 정보를 출력하는 메서드 선언
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n", this.name, this.money, this.rate);
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}


	/* 객체생성(인스턴스화)하지 않았기 때문에 사용할 수 없다
	public double getRate() {
		return rate;
	}
	
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	*/
	
	// 정적 메서드 == static 메서드 == 클래스 메서드 		// ( 프로그램 시작과 동시에 메모리에 올라가서 바로 사용가능 )
	public static double getRate() {
		return rate;
	}
	
	
	public static void setRate(double rate) {
		int age = 10; // 지역변수 사용가능
		// this 사용불가X -> this는 메모리 상에 올라가야 사용되는데 static은 시작과 동시에 메모리에 올라가기 때문에 this는 사용못한다.
		Save.rate = rate;
	}
	
	
	
}
