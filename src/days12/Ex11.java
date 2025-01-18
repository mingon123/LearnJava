package days12;

/**
 * @author kenik
 * @date 2025. 1. 10. - 오후 4:32:16
 * @subject
 * @content 
 
 		[ 가변인자 (variable arguments) ]
 		JDK1.5부터 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.

 */
public class Ex11 {

	public static void main(String[] args) {
		
		System.out.println( Ex11.sum(1, 2) );
		System.out.println( Ex11.sum(1, 2, 3) );
		System.out.println( Ex11.sum(1, 2, 3, 4) );
		
		int [] m = { 123, 23, 3,2, 1, 2, 3, 1234};
		System.out.println( Ex11.sum(m) );
		
	} // main

	// sum()
	public static int sum(int a, int b) {
		return a+b;
	}

	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public static int sum(int [] args) {
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
	
} // class
