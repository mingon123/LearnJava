package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오후 4:49:26
 * @subject
 * @content 입력받고 첫번째 방에 저장하고 다시 물어봐서 입력하면 두번째 방에...반복
 */

public class Ex07 {

	public static void main(String[] args) throws IOException {

		/*
		[배열]      정리
		1. 정의 : 동일한 자료형 + 메모리상에 연속적으로 놓이게 한 것,
		2. 선언형식 : 자료형[] 배열명 = new 자료형[배열크기];
		3. 배열의 크기 : 배열명.length
		4. 배열의 윗첨자값(UpperBound) : 배열의 크기 -1
		5. 배열의 초기화	int [] kors = {90, 80, 70}
		6. 배열의 단점 -> 컬렉션 클래스 사용.
		*/
		int [] m = new int[3];
		
		// 배열의 각 요소를 -1값으로 초기화 : 절대 안나오는 값
//		for (int i = 0; i < m.length; i++) {
//			m[i] = -1;
//		}
		
		// Arrays 클래스 : 배열을 더 쉽게 다룰 수 있는 기능이 있는 클래스
		// Arrays.toString(m)
		Arrays.fill(m, -1);  // 배열 m의 전 값을 -1로 초기화 : 위의 for문과 같음
		
		int index = 0;
		char con = 'y';
		
		// Character.toUpperCase() // toUpperCase() == 대문자로 변환
		// System.out.println( Character.toUpperCase('y') );
		
		Random rnd = new Random();
		
		do {
			m[index++] = rnd.nextInt(100); // 0 <= 정수 < 100
			System.out.printf("> 배열(%d) 계속 초기화할거냐? ", index);
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13(/r), 10(/n) 제거
			// 계속 여부 ? y
//		} while ( con == 'y' || con == 'Y' );
		} while ( Character.toUpperCase(con) == 'Y' );
		
		dispArr(m);
		
	} // main

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		}
		
	}

} // class
