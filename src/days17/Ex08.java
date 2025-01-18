package days17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 2:11:35
 * @subject
 * @content

 		java.util 패키지
 		  ㄴ 자주 사용되는 유용한 유틸리티(클래스)
 		  
 		  Arrays 클래스 - 배열을 사용하기 쉽도록 기능(메서드)이 구현된 클래스
 		  
 */
public class Ex08 {

	public static void main(String[] args) {
		int [] m = { 3, 5, 2, 4, 1 };	// 내림차순 안됨

		
		// [2] int[] -> Integer [] 변환 (람다와 스트림 코딩)
		Integer[] n = ((IntStream) Arrays.stream(m)).boxed().toArray(Integer[]::new); // 배열을 스트림 -> 래퍼클래스로 만들어서 배열로 만듦
		
		
		/* [1] // int[] -> Integer[]
		Integer [] n = new Integer[m.length];		
		for (int i = 0; i < n.length; i++) {
			n[i] = m[i];  // auto boxing
		} // for i
		*/
		
		
//		Integer [] m = { 3, 5, 2, 4, 1 };	// Wrapper 클래스로 선언하면 내림차순 선언가능
		// 					[3, 5, 2, 4, 1]
		System.out.println(Arrays.toString(m));	// 출력
		
//		Arrays.fill(m, -1);	// 채우기
//		System.out.println(Arrays.toString(m));
		
		// 기본 : 오름차순(asc) 정렬
//		Arrays.sort(m);	// 정렬
		
		
		
		// 내림차순(desc) 정렬
		//  T[] t				<? super T>
		// Type [] ,  Comparator<Integer> 
		// [1]
//		Arrays.sort(m, Collections.reverseOrder());
//		Arrays.sort(n, Collections.reverseOrder());
		
		// [2] T[] t
		//	  Integer[] n
		/*
		Arrays.sort(n, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {  
				
//				return o1 - o2;		// 반환형이 int여서 
//				return o2 - o1;		// 내림차순 -> 차이가 음수면 알아서 큰값으로 치고 정렬
				return o2.compareTo(01);	// 문자열이 같으면 0, 소문자<->대문자면 32,-32	. Integer(래퍼클래스)이기 때문에 사용할 수 있음				
			}
		});
		*/
		
		// [3]  : [2]과 100% 똑같은 코딩
		Arrays.sort(n, (o1, o2) -> {
			return o2.compareTo(o1);
			}
		);		
		
		// [4] : [3][2] 와 100% 똑같은 코딩
		//						-> 람다연산자를 사용한 식 : 람다식
		Arrays.sort(n, (o1, o2) -> o2.compareTo(o1)	);		

		
		System.out.println(Arrays.toString(n));
		
		
	}

}
