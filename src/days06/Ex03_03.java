package days06;

import java.util.Iterator;

public class Ex03_03 {

	public static void main(String[] args) {

		
//		구구단 세로로 2~5단 첫째문단, 6~9단 아래문단
		/*
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.printf("%d*%d=%02d ", j, i, i*j);
			} // for j
			System.out.println();
		} // for i
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 6; j <= 9; j++) {
				System.out.printf("%d*%d=%02d ", j, i, i*j);
			} // for j
			System.out.println();
		} // for i
		
		*/
		
		
		
		// k=1 j=2
		// k=2 j=6
		for (int k = 1; k <= 2; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 4*k-2; j <= 4*k-2+3; j++) { // 단
					System.out.printf("%d*%d=%02d ", j, i, i*j);
				} // for j
				System.out.println();
			} // for i
			System.out.println();
		}
		
		
		
		
//		구구단 세로 출력
//		2단 3단 4단
//		5단 6단 7단
//		8단 9단
//		k=1 j=2
//		k=2 j=5
//		k=3 j=8
		
//		for (int k = 1; k <= 3; k++) {
//			for (int i = 1; i <= 9; i++) {
////				for (int j = 3*k-1; j <= 3*k-1+2 && j<=9; j++) { // - 10단 안나오는 방법1
//				for (int j = 3*k-1; j <= 3*k-1+2; j++) { // 단
////					if (j==10) continue; // - 10단 안나오는 방법2
////					if (j==10) break; // -10단 안나오는 방법3
//					System.out.printf("%d*%d=%02d ", j, i, i*j);
//				} // for j
//				System.out.println();
//			} // for i
//			System.out.println();
//		}
		
		
		
		
//		9단만 빼고 10단까지 실행
		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 3*k-1; j <= 3*k-1+2; j++) { // 단
					if (j==9) continue;
					System.out.printf("%d*%d=%02d ", j, i, i*j);
				} // for j
				System.out.println();
			} // for i
			System.out.println();
		}
		
	}

}
