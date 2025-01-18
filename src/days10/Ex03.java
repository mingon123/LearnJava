package days10;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 2:27:14
 * @subject
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		// 각 자료형의 기본값으로 초기화 되어져 있다 (기억)
		// int 기본값 : 0
		// boolean [] n = new boolean[3];   // 기본값 : false
		// String [] n = new String[3];		// 기본값 : null
		
		/*
		int [] m = new int[3];
		m[0]=1; // 초기화
		m[1]=2;
		m[2]=3;
		*/
		
		// 배열 초기화
		// int [] m = new int []{1,2,3}; 
		int [] m = {1,2,3}; 
		// 위의 int[]m 3개 전부 다 똑같은 코드
		
		disArr(m);

	} // main

	private static void disArr(int[] m) {
		System.out.println(m.length); // 배열의 크기
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		}
		
	}

} // class
