package days10;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 2:32:00
 * @subject
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 2차원 배열			행  열
		/*
		int[][] m = new int[2][4];
		m[0][0]=1; m[0][1]=2; m[0][2]=3; m[0][3]=4; 
		m[1][0]=5; m[1][1]=6; m[1][2]=7; m[1][3]=8; 
		*/
		
		// 2차원 배열 초기화 (선언과 동시에 초기화)
		/* 둘다 같은 코드, new int[2][4]+초기화 같이하는건 오류난다.
		int [][] m = new int[][]{
						{1,2,3,4},
						{5,6,7,8}
					};
		*/
		int [][] m = {
						{1,2,3,4},
						{5,6,7,8}
					 };
		
		dispArr(m);
		
		
		// return ; 메서드 종료, 프로그램 종료!!(main함수이기 때문에)
	} // main

	private static void dispArr(int[][] m) {
		System.out.println( m.length ); // 행 갯수
		System.out.println( m[0].length); // 열 갯수
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			}
			System.out.println();
		}
		// return ; // 메서드 종료... - void 형도 return하면 그냥 종료
		
	}

	
//	2차원 배열 그대로 반환한다.
//	private static int[][] dispArr(int[][] m) {
//		return m;
//	}

} // class
