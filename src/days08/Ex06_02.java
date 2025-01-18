package days08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {

		// 10진수 정수를 입력받아서
		// 2바이트 2진수 형태로 출력...
		
		// 정수 입력 ? 10
		// 배열 선언 -> 크기 : 16 
		// [0][][][][][][][][] [][][][][0][1][0][1][0] <- 빈칸은 전부 0

//		System.out.println(Arrays.toString(binaryArr)); // 자동으로 0으로 채워져있어서 넣을 값만 넣으면 나머지는 안채워도 됨.
		
		int n = 10;
		int 몫, 나머지;
		String s= "";
		while( n != 0 ) {
			몫 = n / 2;
			나머지 = n % 2;
//			System.out.println(나머지);
//			s += 나머지;
			s = 나머지 + s; // 앞에 기존 값을 저장, but 문자열을 더하는 코딩은 절대하면 안됨.
			n = 몫;
		} // while
		
		System.out.println(s); // 0101 -> 1010
		System.out.printf("%016d \n", Integer.parseInt(s));
		
//		[3]
//		s = String.format("%16s", s);
//		System.out.println( s.replace(' ', '0') );

//		[4]
		System.out.println("0".repeat( 16-s.length() ) + s ); // "1010"
		
		/*
		[2] StringBuilder -> reverse() 함수
		StringBuilder sb = new StringBuilder(s);
		System.out.println( sb.reverse() );
		*/
		
		
		/* 
		[1] 로직 "1010"
		
		// [][][][x]
		char [] sReverse = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			sReverse[s.length()-1-i] = s.charAt(i);
		}
		
		// char [] -> String 변환
		String sr = String.valueOf(sReverse);
		System.out.println(sr);
		*/
		
		
		
	}

}
