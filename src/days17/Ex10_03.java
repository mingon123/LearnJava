package days17;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 4:14:14
 * @subject
 * @content 
 */
public class Ex10_03 {

	public static void main(String[] args) {

		int [] m = {3,5,2,4,1};
		
		// 스트림 사용
		// [1]
		// int [] -> Stream 변환해야 메서드() 를 사용할 수 있다
//		IntStream s = Arrays.stream(m);
//		s.sum();
		
		// [2]
//		int sum = Arrays.stream(m).sum();
//		System.out.println(sum);

		// [3]
		int sum = IntStream.of(m).sum();
		System.out.println( sum );
		
		

//		int [] m = {3,5,2,4,1};
//		
//		int sum = 0;
//		for (int i = 0; i < m.length; i++) {
//			sum += m[i];
//		}
//		System.out.println(sum);

		
		
		
	} // main

} // class
