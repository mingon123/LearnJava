package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 2:19:59
 * @subject
 * @content 
 */
public class Ex05_04 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 100;		
		plus( p1 ); // Call By Reference  + 클래스 매개변수
		System.out.println( p1.x ); // 100
	} // main

	private static void plus(Point p) {
		 
		p.x +=200;
		
	}

} // class

class Point{
	
	// field
	int x;
	
	// method
	
}








