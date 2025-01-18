package days07;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {

		// [로또 게임]
//		Math.random() 1~45 정수(로또번호) <- 전에 사용했었음
		
//		java.util.Random 클래스 <- 이번에 사용
		Random rnd = new Random();
//		0+1 <= rnd.nextInt(45);+1 < 45+1
//		rnd.nextInt(45)+1 -> 1~45 범위
//		rnd.nextInt() -> -21억~21억 범위에서 임의의 실수 발생
		
		for (int i = 1; i <= 6; i++) {
			int lotto = rnd.nextInt(45)+1;
			System.out.println(lotto);
		}
		
//		중복된 값이 안나오도록 해야함
		/*
		17
		13  ***** 중복된 로또 번호 발생( 문제점 )
		10
		36
		13  *****
		22
		*/
		
		
		
		
		

	} // main

} // class
