package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 12:04:12
 * @subject
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// 배열 : ArrayIndexOutOfBoundException
		// int [] m = new int[3];
		// m[3] = 100;  // [3]번방이 없어서 생기는 오류
		
		// 클래스 : NullPointException
		Car myCar = null;
		
		// The local variable myCar may not have been initialized
		// java.lang.NullPointerException
		// 객체 생성 과정 == 인스턴스화하는 코딩을 추가하면 해결!
		// myCar = new Car();  
		
		myCar.name = "K9";

	}

}
