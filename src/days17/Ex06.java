package days17;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 12:30:51
 * @subject
 * @content 

		Math : 수학과 관련 메서드
		 ㄴ 모든 멤버 - public static
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// import static java.lang.Math.*; 를 하면 Math를 안붙여도 됨.
		out.println( Math.PI ); // 원주율
		out.println( Math.E ); // 지수
		out.println( random() ); // 0<=  <1
		out.println( max(1,2) ); // 0<=  <1
		out.println( min(1,2) ); // 0<=  <1
		
		out.println( pow(2,3) ); // 제곱
		out.println( abs(-2) ); // 절대값
		out.println( sqrt(4) ); // 루트값 -> double로 반환 : 2.0
		
		// 반올림, 올림(절상), 버림(절삭) 	 기준 : 수숫점 첫째자리
		out.println( ceil(45.179) ); // 올림 -> double 로 반환
		out.println( round(45.179) ); // 반올림 -> long 으로 반환
		out.println( floor(45.179) ); // 버림 -> double 로 반환
		
		
		
	} // main

} // class
