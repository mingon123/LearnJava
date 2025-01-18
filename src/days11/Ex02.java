package days11;

import java.util.Random;
import java.util.Scanner;

import util.MyCalendar;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오전 11:20:42
 * @subject
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {

		// 1. 클래스, 객체, 인스턴스 구분
		// 2. 지역변수, 참조변수 설명
		
		// int age; // age 지역변수
		
		// 참조변수 : 주소값을 갖는 변수
		// int [] m = new int[3];
		// m : 변수, 지역변수, 참조변수, 배열명
		
		// 객체 : 클래스를 자료형으로 선언된 참조변수
		// 변수 선언 형식 : 자료형 변수명[=초기값]
		Car myCar = null;
		// myCar : 변수, 지역변수, 참조변수, [객체]
		
		// 인스턴스화 과정 == 객체를 생성하는 과정. =결과=> 인스턴스
		// new 클래스명();
		myCar = new Car();
		
		// The local variable myCar may not have been initialized == 초기화하지 않으면 오류생김
		// 			days11.Car@3ac3fd8b
		// System.out.println( myCar );
		
		
		// int [] m = new int[3];
		// 배열명[첨자값] = 0;
		// System.out.println( 배열명[0] ) 
		
		// 접근 방법
		// 객체명.메서드명();
		myCar.dispCarInfo();   // 필드는 지역변수가 아니기 때문에 초기화하지 않아도 각 자료형의 초기값으로 초기화되어있다.
		
		// 객체명.필드명;
		myCar.name = "K9"; // . == 멤버(영역)연산자
		myCar.speed = 300;
		
		myCar.dispCarInfo();
		System.out.printf("> 차명:%s, 속도:%d, 바퀴수:%d\n", myCar.name, myCar.speed, myCar.wheelCOunt);
		
		
		// Random rnd = new Random();
		// Scanner sc = new Scanner(System.in);
		
		// "인스턴스화"할 수 없다.
		// 객체를 생성하는 과정 == 인스턴스화
		// 객체 생성 X(불가)
		// 왜? System 클래스는 객체 생성이 안될까?
		// System s = new System();
		
		
		
		
		
		
		
//		Car myCar = new Car();
//		// 위 코드에서 인스턴스화 코딩은 아래뿐
//		new Car();
		
	} // main

} // class
