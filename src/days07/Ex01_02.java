package days07;

import java.util.Iterator;

public class Ex01_02 {

	public static void main(String[] args) {

//	함수 = 함수안에 함수 선언하지말고, 클래스 밖에 선언하면 안된다

		
//		System.out.println("-------------"); //50줄이라고 하면 이렇게 하기 어려움
		Sample.drawLine(30); // 함수 호출부분
		System.out.println(" 부서명 : 사원명 ");
		Sample.drawLine("^", 25); // 함수 호출부분
//		System.out.println("-------------");
		System.out.println(" 영업부 : 이태규 ");
		System.out.println(" 총무부 : 신희민 ");
		System.out.println(" 생산부 : 박현주 ");
		System.out.println(" 기획부 : 김예지 ");
		System.out.println(" 기획부 : 하동호 ");
//		System.out.println("-------------");
		Sample.drawLine(); // 함수 호출부분
		
		
	} // main


} // class

