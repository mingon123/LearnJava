package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 2:19:59
 * @subject
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		int x = 100;
		
		x = plus(x); // Call By Value

		System.out.println( x ); // 100
	} // main

	private static int plus(int x) {
		 
		return x+=200;
		
	}

} // class