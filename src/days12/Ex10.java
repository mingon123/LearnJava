package days12;

/**
 * @author kenik
 * @date 2025. 1. 10. - 오후 4:24:06
 * @subject
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// disp(); 
		// 클래스명.필드명();
		// 클래스명.메서드명();
		// Ex10.disp();  // 같은 클래스 내부에서는 클래스명 생략 가능
		dispA();
		
		Ex10 obj = new Ex10(); // static을 붙이지 않으면 객체를 생성하고 호출해야 하기 때문에 더 복잡함
		obj.dispB();
		
	} // main

	public void dispB() {
		System.out.println("> dispB()...");
	}
	
	public static void dispA() {
		System.out.println("> dispA()...");
	}

} // class
