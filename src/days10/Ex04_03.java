package days10;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 4:16:05
 * @subject
 * @content 

		검색(Search)
		 ㄴ 항목의 집합 중에 특정 항목을 찾아낸 것.
 		1) 순차 검색( sequence search )
 		2) 이진 검색( binary search )

		Ex04_02는 여러 방법 설명, 정답은 Ex04_03

 */
public class Ex04_03 {

	public static void main(String[] args) {
//		int fromIndex = 0; // 값을 바꿔 그 위치부터 시작할 수 있도록
//		System.out.println( "안녕하세요. 홍길동입니다. 홍길동입니다.".indexOf("홍홍동", fromIndex)); // indexOf : 찾기 시작하는 위치값 정하는 함수, 없으면 -1값 자동반환
		
		
		
		//	0<= 정수 <=20
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); // 12를 입력
		
		// 찾는 정수가 없을 경우에는 -1을 반환하도록 정했다.
		int index = -1; // 찾을 위치를 저장할 변수
		int startIndex = 0;
		
		while ( (index = sequenceSearch(m, n, startIndex)) != -1 ) {
			System.out.println(index);
			startIndex = index + 1;
		} // m : 찾을 배열, n : 찾을 값
		
	} // main

	private static int sequenceSearch(int[] m, int n, int startIndex) {
		int index = -1;
		
		for (int i = startIndex; i < m.length; i++) {
			if(m[i] == n) {
				index = i;
				break;
			} // if
		} // for
		return index;
	}
	
//	private static int sequenceSearch(int[] m, int n) {
//		int index = -1;
//		
//		for (int i = 0; i < m.length; i++) {
//			if(m[i] == n) {
//				index = i;
//				break;
//			} // if
//		} // for
//		return index;
//	}
		

} // class
