package days09;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오후 4:37:50
 * @subject
 * @content 

	다차원 배열 개념 설명
	1. 다차원 배열 ? 2차원 이상의 배열을 다차원 배열이라고 한다.
		2차원, 3차원, 4차원 ... (메모리 허용) 할 때 까지 계속 사용 가능
		  
	2. 배열의 배열이다. ***
		( 그림과 같이 꼭 암기 )
 */

public class Ex08 {

	public static void main(String[] args) {
		// 1차원 배열 - 열
		// 2차원 배열 - 행, 열
		// 3차원 배열 - 면, 행, 열
		// 4차원 배열 - 권, 면, 행, 열
		
		// int [] m = new int[8];
		// int m [] = new int[8]; <- 상관없음
		
		// 4행 2열 2차원 배열
		// int [][] m = new int [4][2];

		// 2면 2행 2열 3차원 배열   - 양면
		// int [][][] m = new int [2][2][2];
		
		// int [] kors = new int[3*7*30];
		// int [][][] kors = new int[3][7][30];  // 한년,반,번호라 하면 한번에 계산 가능해서 더 효율적
		// kors[1][4][16];
		// kors[1][4][0~29];
		
		
	}

}
