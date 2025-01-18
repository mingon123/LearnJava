package days05;

import java.io.IOException;
import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);	
		
//		System.in.read(); // '\r'
//		System.in.read(); // '\n'
		
//		System.in.skip(2); // 남아 있는 버퍼의 개수 2개 제거
		System.in.skip( System.in.available() ); // 그 줄에 해당하는 값들 전부 읽어서 버림 - 이게 중요
		
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		// 위처럼 2번했을 경우 한번하고 다시 입력을 받아야할 것 같은데 한번 받으면 다시 입력받지 않고 그냥 끝남
		
	}

}
