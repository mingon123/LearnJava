package days09;

public class Ex01_02 {

	public static void main(String[] args) {
		// 16진법 : 0 1 2 3 4 5 6 7 8 9 10(a) ~ 15(f)
		
		int n = 123;
		
		System.out.println( Integer.toBinaryString(n) ); // 2진수
		System.out.println( Integer.toOctalString(n) ); // 8진수
		System.out.println( Integer.toHexString(n) ); // 16진수

	}

}
