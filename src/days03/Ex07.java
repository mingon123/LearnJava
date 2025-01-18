package days03;

public class Ex07 {

	public static void main(String[] args) {
		
		
		// 1. String -> byte, short, int, long, float, double
		//  String n = "90";
		//  byte b = Byte.parseByte(n);
		//  short b = Short.parseShort(n);
		//  :
		//  double b = Double.parseDouble(n);
		
		// 2.  byte, short, int, long, float, double -> String
		
		
		int i = 10; // -> "10"
		// 1)
		String strI = i + ""; // 숫자형에 ""(빈문자열)을 붙이면 문자열 i가 됨
		
		// 2)
		String.valueOf(i);
		
		// 3)
		System.out.println( Integer.toString(i)); // "10"
		
		System.out.println( Integer.toOctalString(i)); // "12" 8진수 문자열
		System.out.println( Integer.toHexString(i)); // "a" 16진수 문자열
		System.out.println( Integer.toBinaryString(i)); // "1010" 2진수 문자열


		
	}

}
