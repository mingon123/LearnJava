package days08;

public class Ex06_03 {

	public static void main(String[] args) {
		
//		[문제] 문자열을 뒤집어서 문자열을 반환하는 메서드를 선언하세요.
		String s = "abcde";
		s = reverse(s);
		System.out.println(s); // "edcba"	
		
	} // main

	private static String reverse(String s) {
		// 1. String -> char [] 형태로 반환 : toCharArray()
		char [] sArr = s.toCharArray();
		char [] srArr = new char [s.length()];
		
		for (int i = 0, index = sArr.length -1; i < sArr.length; i++, index--) {
			sArr[s.length()-1-i] = sArr[i];
		}
		// 2. char [] -> String 
		return new String(srArr); // valueof써도 됨.
		
		
	}

} // class
