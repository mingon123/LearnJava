package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 3:26:30
 * @subject
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 클래스 복제(clone)
		// 1) 깊은 복제
		// 2) 얉은 복제		
		Point p1 = new Point();
		p1.x = 100;
		
		// p1 객체를 복제해서 p2 생성
		// X Point p2 = p1; 복사
		Point p2 = new Point();
		p2.x = p1.x;

	} // main

} // class
