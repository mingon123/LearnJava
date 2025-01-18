package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오전 10:23:35
 * @subject
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 복습 : 문제3 - if문 사용(로직)

		int [] m = new int[3];
		Arrays.fill(m, -1);
		int index = 0;
		char con = 'y';
		Random rnd = new Random();
		
		do {
			if ( index == m.length ) {
//				int [] temp = new int [m.length + 3];
//				// m -> temp 배열에 복사 
//				for (int i = 0; i < m.length; i++) {
//					temp[i] = m[i];
//				}
//				m = temp;
				
				int [] temp = Arrays.copyOf(m,  m.length+3); // 위의 코드를 이 코드 한줄로 가능
				m = temp;
			} // if			

			
			// [][][] + [][][] <- 4번도 입력받을 수 있게됨
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
		} // for i		
	} // dispArr
	
}




