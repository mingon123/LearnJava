package days11;

import days11.Tv;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 12:44:46
 * @subject
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 필드 X
		// 지역변수, 초기화 X
		// Illegal modifier for parameter age; only final is permitted
		// public int age;
		
		Tv t1 = new Tv();
		
		t1.power();
		
		t1.channel = 11;
		
		t1.channelUp(); // 12
		
		System.out.println( t1.channel );
		
		t1.power();

	} // main

} // class

// Ex04.java -> class Ex04{}
// The public type Tv must be defined in its own file
// 하나의 자바 파일 안에 여러 개의 클래스를 선언할 수 있다.
//                  public class 1개라야 한다. 
//    파일명 == public 클래스명
// Ex04.java -> Ex04{}, Tv{}
class Tv{

	// 중첩 클래스 
	protected class Volumn{
	}

	// 필드==멤버변수 선언 형식
	// [접] [기] 자료형 필드명[=초기값]; 
	public String color;
	public boolean power = false;
	public int channel = 0;

	// 메서드
	public void power() {
		power = !power;
	}
	
	// t2.channelUp();
	public void channelUp() {
		// t2.channel++;
		channel++;
	}
	public void channelDown() {
		channel--;
	}

}








