package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01_02 {

	public static void main(String[] args) {

		// 1차원 배열의 값을 -> 2차원 배열 변환
		// 제시) 2차원 배열의 값을 -> 1차원 배열 변환
		// 제시) 2행 3열 		-> 3행 2열
		
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int [][] n = new int[6][2];
		
		/*		행	열
			i/열갯수	i%열갯수
		i=0		0	0
		i=1		0	1
		i=2		1	0
		i=3		1	1
		i=4		2	0
		i=5		2	1
		i=6		3	0
		i=7
		i=8
		i=9
		i=10
		i=11	5	1
		 */

		int cols = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/cols][i%cols] = m[i];
//			n[행][열] = m[i];
		}
		
		// 2차원 배열 출력
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("n[%d][%d]=%d ", i, j, n[i][j]);
			} // for j
		System.out.println();
		} // for i

		System.out.println(" end ");
			


	}

}
