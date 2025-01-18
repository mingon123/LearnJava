package days05;

import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		
		// 제어문 - 반복문 ASCII 출력
		// 256가지 문자값을 출력할 수 있음 2^7+1 = 2^8
		// 'A' = 65
		// 'a' = 97
		// '0' = 48
		
		// 0~31 제어문자
		// 32~127 일반문자 (대소문자, 숫자 등등...)
		// 128~ 
	
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d('%c')]\n", i, (char)i);	
		}
		

		
		
	}

}
