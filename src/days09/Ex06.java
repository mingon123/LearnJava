package days09;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오후 2:19:06
 * @subject
 * @content
 
 	정렬(Sort)
 	 ㄴ 특정 기준에 맞게 데이터를 열거하는 알고리즘.
 	  예) 성적순, 나이순 등등
 	 ㄴ 오름차순 정렬([Asc]ending Sort)
 	  작은값 -> 큰값	
 	 	12345
 	 	abcde
 	 	가나다라마
 	   내림차순 정렬([Desc]ending Sort)
 	  큰값 -> 작은값
 		54321
 		edcba
 		마라다나가
 	ㄴ 버블정렬, 선택정렬, 삽입정렬, 병합정렬, 쉘 정렬 등등..
 */

public class Ex06 {

	public static void main(String[] args) {
		
		// 버블정렬(bubble sort)
		// ㄴ 인접한 두 원소를 검사하며 정렬하는 알고리즘.
		// ㄴ 두 개의 인접한 자료 값을 비교하면서 위치를 교환하는 방식으로 정렬하는 방법
		
		// ASC
		int[] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));

//		버블정렬
		bubbleSort(m);
		
//		선택정렬
//		selectSort(m);
//		selectSort2(m);
		
		System.out.println(Arrays.toString(m));
		
		

	} // main

	private static void selectSort2(int[] m) {
		// 3,5,2,4,1
		//[0]			// 가장 작은값을 찾아서 0번째 자리에 넣음
		// 1,5,2,4,3
		//  [1]			// index<=1에서 가장 작은값을 찾아서 index값에 넣음
		// 1 2 5 4 3
		//    [2]
		// 1 2 3 4 5
		//      [3]
		// 1 2 3 4 5
		
		for (int i = 0, minIndex; i < m.length-1; i++) {
//			System.out.printf("[%d]\n", i);
			minIndex = i;
			for (int j = i+1; j < m.length; j++) {
				if (m[minIndex] > m[j]) {
					minIndex = j;
				}			
			}
			System.out.println("> minIndex " + minIndex);	

			if (i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;
			}
			System.out.println(Arrays.toString(m));	
		} // for i
	} // selectSort2

	
	private static void selectSort(int[] m) {
		// 3,5,2,4,1
		
		// 0-1 0-2 0-3 0-4	1회전 1 [] [] [] []
		// 	   1-2 1-3 1-4		2회전 1  2 [] [] []
		//         2-3 2-4			3회전 1  2  3 [] []
		//             3-4				4회전 1  2  3  4  5
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3-i; j++) {  // j = i+1하면 아래 i+j+1을 j만 써도 됨
				System.out.printf("%d-%d ", i, i+j+1);
				if ( m[i] > m[i+j+1]) {
					System.out.print("***");
					int temp = m[i];
					m[i] = m[i+j+1];
					m[i+j+1] = temp;
				}
				System.out.println(Arrays.toString(m));

			}
			System.out.println();
		}
		
	}

	private static void bubbleSort(int[] m) {
		// i-i+1
		// 0-1 1-2 2-3 3-4	1회전
		// 0-1 1-2 2-3		2회전
		// 0-1 1-2			3회전
		// 0-1				4회전

		// 0- 1- 2- 3-		1회전
		// 0- 1- 2-			2회전
		// 0- 1-			3회전
		// 0-				4회전
		
		// i=0 j=0,1,2,3
		// i=1 j=0,1,2
		// i=2 j=0,1
		// i=3 j=0
		
		// i+j==3
		// j = 3-i

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 3-i ; j++) {
				System.out.printf("%d-%d ",j, j+1);
				if (m[j] > m[j+1]) {	// 부등호만 바꾸면 내림차순<->오름차순 정렬
					System.out.print(" *** ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}
				
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= 3-i; j++) {
//				System.out.printf("%d-  ",j);
//			}
//			System.out.println();
//		}
		
	} // bubbleSort

} // class
