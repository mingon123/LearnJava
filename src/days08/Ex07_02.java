package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 6. - 오후 5:16:48
 * @subject
 * @content 

	배열은 크기가 자동으로 증가되지 않는다. ( 단점 ) : 한번 설정하면 자동으로 변경 되지 않음
	
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {


		int [] m = new int[3];  // m[0] ~m[2]
//									아랫첨자값 LowerBound
//									윗첨자값	UpperBound
		Arrays.fill(m, -1);
		int index = 0;
		char con = 'y';
		Random rnd = new Random();
		
		do {
//			java.lang.ArrayIndexOutOfBoundsException:
//			Index 3 out of bounds for length 3
			m[index++] = rnd.nextInt(100);
			System.out.printf("> 배열(%d) 계속 초기화할거냐? ", index);
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' && index < m.length); // 배열크기보다 작을 때만 돌도록
		
		// 마지막에 y눌렀는데도 나가진 경우에는
		if (con == 'y') { 
			System.out.println("빈 방이 없어서 나감");
		}		

		
		dispArr(m);
		
	} // main

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		}
		
	}

} // class
