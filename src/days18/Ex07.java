package days18;

import java.text.ChoiceFormat;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 12:43:02
 * @subject
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 3. ChoiceFormat 클래스
		//	선택
		//	 ㄴ 특정 범위에 속하는 값을 문자열로 반환해주는 클래스
		//	 예) 국어점수 -> 수우미양가 등급 출력
		//		90~100 수, 80~89 우... ~~
		
		int [] kors = { 100, 57, 95, 88, 77, 80, 0 };
		
		// [1]				낮은 값부터 범위
//		double [] limits = {0, 60, 70, 80, 90}; 
//		String [] formats = {"가", "양", "미", "우", "수"};
//		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		
		// [2]
		// 					# : 경계값을 범위에 포함
		//					0# : 0<=
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		for (int i = 0; i < kors.length; i++) {
			System.out.printf( "%d 점수 - %s 등급\n", kors[i], cf.format(kors[i]) );
		} // for i
		
				
		System.out.println(" end ");
	} // main

} // class
