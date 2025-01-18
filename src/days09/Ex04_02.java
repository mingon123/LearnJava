package days09;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오후 2:01:18
 * @subject
 * @content 
 */
public class Ex04_02 {

	public static void main(String[] args) {

		int [] kors = { 79, 88, 100, 33, 100, 55 ,95 };
		
		// 아래의 식을 람다식으로 
		OptionalInt op = IntStream.of(kors).max();
		int max = op.getAsInt();
		System.out.println(max);
		
		// 국어 최대 최소점수
		/*
		int max = kors[0];
		int min = kors[0];
		
		for (int i = 1; i < kors.length; i++) {
			if( max < kors[i] ) max = kors[i];
			else if( min > kors[i]) min = kors[i];
		}
		
		System.out.println("최대 국어점수 : "+ max);
		System.out.println("최소 국어점수 : "+ min);

		// index -> names[index] 학생명... // index번호로 이름을 가져옴
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d번 - 국어 : %d\n", i+1, kors[i]);
		}
		*/
	}

}
