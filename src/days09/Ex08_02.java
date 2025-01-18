package days09;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오후 5:09:41
 * @subject
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		/*
		// 1차원 배열.
		int [] m = new int[8];
		// 배열 크기
		System.out.println( m.length ); // 8
		dispArr(m);
		*/
		
		// 2차원 배열
		/*
		int [][] m = new int[4][3];
		System.out.println( m.length ); // 배열명.length == 행 크기
		System.out.println( m[0].length ); // 열 크기
		System.out.println( m[1].length ); // 열 크기
		System.out.println( m[2].length ); // 열 크기
		System.out.println( m[3].length ); // 열 크기
		
		dispArr(m);
		*/
		
		// 3차원 배열
		int [][][] m = new int[2][3][4];
		System.out.println( m.length ); // 면갯수
		
		System.out.println( m[0].length ); // 0면의 행갯수
		System.out.println( m[1].length ); // 1면의 행갯수
		
		System.out.println( m[0][0].length ); // 0면 0행의 열갯수
		System.out.println( m[0][1].length ); // 0면 0행의 열갯수
		System.out.println( m[1][0].length ); // 0면 0행의 열갯수

		dispArr(m);
	} // main

	private static void dispArr(int[][][] m) {
		for (int i = 0; i < m.length; i++) { // 면
			for (int j = 0; j < m[i].length; j++) { // 행
				for (int k = 0; k < m[i][j].length; k++) { // 열
					System.out.printf("m[%d][%d][%d]=%d ", i, j, k, m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

	private static void dispArr(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행 for
			for (int j = 0; j < m[i].length; j++) { // 열 for
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			}
			System.out.println();
			
		}
		
	}

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		}
		System.out.println();
	}

} // class
