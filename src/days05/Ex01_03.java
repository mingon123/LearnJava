package days05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		
//		[문제]
//		세 정수(a, b, c)를 입력받아서 작은 값(min), 큰 값(max) 찾아서 출력
		
		int a, b, c;
		int min, max;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("> 세 정수 입력: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
//		
//		min = Math.min(a, Math.min(b, c));
//		max = Math.max(a, Math.max(b, c));
		
		min = Math.min(a, b);
		min = Math.min(min, c);
		
		//min = Math.min(Math.min(a,b), c);
		
		max = Math.max(a, b);
		max = Math.max(max, c);	  // 이게 가독성이 더 좋음
		
//		System.out.printf("가장 큰 값: %d, 가장 작은 값: %d", max, min);
		
		
//		[방법 1] - 좋지 않음
		if ( a > b ) { // max = a
			if( a > c ) {
				max = a;
			} else {
				max = c;
			}
		} else {	// max = b
			if( a > c ) {
				max = a;
			} else {
				max = c;
			}
		}
		System.out.println("max = " + max);
		
	}

}
