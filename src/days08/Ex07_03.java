package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오후 5:25:55
 * @subject
 * @content 
	배열의 크기가 부족할 경우에 배열의 크기를 3증가시켜서 처리...구현
	[문제]
	3개에서 6개짜리를 만들고 값을 index값에 맞게 옮기고, 3개짜리 배열은 제거, 6개짜리를 m으로 변경
 */
public class Ex07_03 {

	public static void main(String[] args) throws IOException {


		int [] m = new int[3];

		Arrays.fill(m, -1);
		int index = 0;
		char con = 'y';
		Random rnd = new Random();
		
		do {
			m[index++] = rnd.nextInt(100);
			System.out.printf("> 배열(%d) 계속 초기화할거냐? ", index);
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y');

		
		dispArr(m);
		
	} // main

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		}
		
	}

} // class
