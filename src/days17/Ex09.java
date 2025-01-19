package days17;

import java.util.Objects;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 3:08:14
 * @subject
 * @content 

		java.util.Arrays 클래스 - 08, 08_02
		java.util.Random 클래스 - 09
		java.util.Objects 클래스 - 09
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// [1] Random 클래스
		Random rnd = new Random();
		// rnd.nextInt(int bound) // 0<= int <bound 반환
		// rnd.nextBoolean(); // 무작위 true/false 반환
		// rnd.nextDouble(); // 실수(double) 범위 반환 
		// rnd.nextInt(); // 정수(int) 범위 반환
				
		
		// [2] Objects 클래스
		// Object의 보조클래스 : Objects 클래스 		- Object가 8~9개밖에 없고 다 오버라이딩해서 사용해야 하니까
		// static 멤버로만 이루어짐

		// 이렇게 존재하지만 위에께 더 편해보여서 위에꺼 쓰면됨. 알아만 두면 됨
		days13.Point2D p = null;
		if( p != null) {}
		if( !Objects.isNull(p) ) {}			

	
		if( p != null ) {}
		if( Objects.nonNull(p) ) {}			
		
		days13.Point2D p2 = null;
		if( p != null && p.equals(p2) ) {}
		if( Objects.equals(p, p2) ) {}
		
		
		
		
		
		
		
	} // main

} // class
