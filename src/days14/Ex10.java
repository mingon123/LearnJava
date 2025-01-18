package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 4:45:22
 * @subject
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// 추상클래스 업캐스팅 가능
		// 인터페이스 업캐스팅 가능
		IA obj = new Ex00();
		obj.aaa(); // IA에 업캐스팅하면 이것만 가능

		IB obj2 = new Ex00();
		obj2.bbb();	// IB에서는 bbb만
		
		IC obj3 = new Ex00();
		obj3.aaa();	// IC에서는 전부가능
		obj3.bbb();
		obj3.ccc();
		
	} // main

} // class

interface IA{
	void aaa();
}

interface IB{
	void bbb();
}

// 인터페이스 다중 상속 구현할 수 있다.
// 인터페이스간에는 extends로 상속
interface IC extends IA, IB{
	// void aaa();
	// void bbb();
	void ccc();
}

class Ex00 implements IC {	// 추상메서드로 선언하든가 메서드를 선언하든가 둘중 하나를 해야함.

	@Override
	public void aaa() {		// 내용없어도 {} 만 있다면 생성한 것으로 판단
	}

	@Override
	public void bbb() {	
	}

	@Override
	public void ccc() {
	}
	
}









