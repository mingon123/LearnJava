package days12;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 10. - 오후 4:32:16
 * @subject
 * @content 
 
 		[ 가변인자 (variable arguments) ]
 		JDK1.5부터 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.

 */
public class Ex11_02 {

	public static void main(String[] args) {
		
		System.out.println( Ex11_02.sum(1, 2) );
		System.out.println( Ex11_02.sum(1, 2, 3) );
		System.out.println( Ex11_02.sum(1, 2, 3, 4) );
		
		int [] m = { 123, 23, 3,2, 1, 2, 3, 1234};
		System.out.println( Ex11_02.sum(m) );
		
	} // main

	// sum() 가변인자
	public static int sum(int...args) {
		/*
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
		*/
		
		// JDK버전별 제일 핵심적인 변화
		// JDK1.5 제네릭
		// JDK1.8 람다와 스트림
		return Arrays.stream(args).sum();
	}

	
} // class
