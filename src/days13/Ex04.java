package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오전 11:41:03
 * @subject
 * @content 

		Point2D.java 클래스 생성
		Point3D.java 클래스 - 상속 설명
 */


public class Ex04 {

	public static void main(String[] args) {
		// [has-a 관계]
		// System			// 클래스 	(ex) Car)
		// [PrintStream] out; // 객체 	(ex ) Engine)
		// [System.out].println(); // println()은 system클래스께 아니고 PrintStream out에서 가져오는 것.

		// 클래스들 간의 관계
		/* 
		2) is-a 관계( 상속 ) ***중요
		
		1. 상속([inherit]ance)
		2. 상속 - 부모 -> 자식 ( 재산 )
			   - 부모 -> 자식 ( 코드 )
			   - 정의 : 기존 클래스를 재사용하여 새로운 클래스를 작성(선언)하는 것.
		3. 상속 장점
			- 코드 재사용 + 코딩양이 적다. -> 생산성 향성, 유지보수 용이
		4. 상속 선언 형식
		  extends 키워드 - 연장, 확장하다
		  
		  class 새로선언클래스 extends 기존클래스 {
		  }
		  
		5. 기존클래스 - 부모 클래스, 기초 클래스, [ Super 클래스 ], 상위 클래스
		   자식클래스 - 자식 클래스, 파생 클래스, [ Sub	클래스 ], 하위 클래스
		
		6. 상속 예제
			좌표 관리하는 클래스 선언 - Point2D.java
								 x, y + 메서드 구현
			[1]
			int x1, y1;
			int x2, y2;
			int x3, y3;
			int x4, y4;
			:
			int x30, y30;
			
			[2]
			int [] xArr = new int[30];
			int [] yArr = new int[30];
			
			[3]
			Point2D [] points = new Point2D[30];
		*/
		
		// 좌표 관리 : x, y + z축 관리하는 새로운 클래스가 필요
		// Point3D.java 새로운 클래스 선언
		
		Point2D p1 = new Point2D(10, 20);
		
		Point3D p2 = new Point3D(10, 20, 30);

		Point3D p3 = new Point3D( p1 , 30);	// p1에서 x,y값 읽어오고 z는 입력받음
		
//		= new Scanner( 읽고자하는경로(대상), 파일 인코딩(타입) ) - 오버로딩
		
		
	} // main

} // class













