package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 2:19:59
 * @subject
 * @content 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int [] m = new int[1];
		int x = 100;
		m[0] = x;
		
		plus(m); // Call By Referece - 배열, 클래스

		System.out.println( m[0] ); // 100
	} // main

	public static void plus(int [] m) {
		 
		m[0]+=200;
		
	}

} // class








