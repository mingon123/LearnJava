package days11;

//멤버들 앞에 접근지정자를 테스트하기 위한 클래스
public class Time {

	public int hour;   // 시간
	protected int minute; // 분
	int second; // 초
	private int milisecond; // 밀리초   1000ms=1s
	// nano                     1000000000ns=1s
	
	private void test() { 
		milisecond = 10;
	}
	
}