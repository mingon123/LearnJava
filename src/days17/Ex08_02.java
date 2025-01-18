package days17;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 2:47:39
 * @subject
 * @content 

 		java.util 패키지
 		  ㄴ 자주 사용되는 유용한 유틸리티(클래스)
 		  
 		  Arrays 클래스 - 배열을 사용하기 쉽도록 기능(메서드)이 구현된 클래스
 		  
 */
public class Ex08_02 {

	public static void main(String[] args) {
		int [] m = { 3, 5, 2, 4, 1 };
		int [] n = { 3, 5, 2, 4, 1 };

		// [1] int[] -> List 변환하는 메서드 ( 컬렉션 프레임 워크 ) 할 때 수업
		// asList(T...a) 메서드	-> Type...가변인자a
		// List<int[]> (반환형?)
//		Arrays.asList(m);
		
		// [2] 순차검색, 이진검색==binarySearch()
//		int index = Arrays.binarySearch(m, 3);
		
		// [3] 두 배열이 같은지 여부 - 양수, 음수, 0 로 반환
		// 리턴타입 int, 같으면 0, 다르면 차이만큼 나옴
//		System.out.println(Arrays.compare(m, n));
		
		// [4] 배열 복사하는 함수
//		int [] x = Arrays.copyOf(m, 3);	// 3은 복사 개수
//		System.out.println( Arrays.toString(x) );
		
		// [5] Arrays.copyOfRange(배열, from, to)	 	// 어디부터 어디까지 복사할지 정할 수 있다
		
		// [6] Arrays.equals(m, n);		// 반환형 true/false
		
		
		
		
		
	} // main

} // class
