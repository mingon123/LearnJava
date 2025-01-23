package days21;

import java.time.temporal.ValueRange;
import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 12:19:05
 * @subject
 * @content 
enum은 클래스 안에, 밖에 다 선언할 수 있다.
 */
public class Ex04_02 {

	// 열거형 선언 가능

	public static void main(String[] args) {


		// 1. 열거형 선언 형식
		// [접근지정자] enum 열거형이름 { 상수명... }   // 기타제어자 X
		// 클래스의 일종 - java.lang.Enum 부모클래스를 가짐
		
		// 2. 열거형 사용 방법
		// 열거형이름.상수명
		System.out.println( Card.CLOVER ); // "CLOVER" 출력
		System.out.println( Card.HEART.toString() ); // "HEART" 출력
		
		System.out.println( Card.HEART.name() ); // "HEART" - HEART. 찍을 수 있다는 것은 객체 선언됨
		System.out.println( Card.HEART.ordinal() ); // 1 - 자릿수
		
		Card cardType = Card.valueOf("HEART"); // String으로 반환
		System.out.println( cardType );
		
		Card [] cardArr = Card.values(); // 배열로 반환
		System.out.println( Arrays.toString(cardArr) );
		
	} // main

} // class



// 열거형 선언 가능 == 일종의 클래스



