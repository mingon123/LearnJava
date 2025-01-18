package days06;

import java.util.Iterator;

public class Ex03_02 {

	public static void main(String[] args) {
		
//		구구단 출력
		for (int i = 2; i <= 9; i++) {
//			System.out.printf("[%d 단] \t", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%02d ", i, j, i*j);
			} // for j
			System.out.println();
		} // for i
		
		
//		구구단 세로로 출력
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) { // 단
//				System.out.printf("%d*%d=%02d ", j, i, i*j);
//			} // for j
//			System.out.println();
//		} // for i


		
		
	}

}
