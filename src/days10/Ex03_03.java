package days10;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 2:42:38
 * @subject
 * @content 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// 가변 배열 : 행마다 배열 크기가 다르다.
		// String [][] names = new String[3][30];
		String [][] names = new String[3][]; // 행은 크기를 주고 열은 값을 주지 않음
		
		names[0] = new String[30];
		names[1] = new String[10];
		names[2] = new String[15];
		
		System.out.println( names[0].length );
		System.out.println( names[1].length );
		System.out.println( names[2].length );

		for (int i = 0; i < names.length; i++) System.out.println(names[i].length); // 위 코드와 같은 결과
		
	} // main

} // class
