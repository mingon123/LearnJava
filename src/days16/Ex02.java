package days16;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오전 10:03:15
 * @subject
 * @content 

4. equals() 설명
5. clone() 설명
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		Object 메서드
		1. hashCode()
		2. getClass()
		3. toString()	fullName@hashCode16진수값
		4. equals()
		 */
//		int a = 10;
//		int b= 20;
//		System.out.println( a == b ); // == 연산자
		
		// 두 객체가 같냐?
		Value v1 = new Value(10);
		Value v2 = new Value(10);		//	(1)	false
//		Value v2 = v1;	// 클래스 복사(copy)	(2) true
//		Value v2 = null;
		
		// 0x100 == 0x200	(1)
		// 0x100 == 0x100	(2)
		System.out.println( v1 == v2 ); // 두 인스턴스가 같은지 묻는게 아니라 주소값이 같냐고 물어보는거
		
		
		// Object.equals() 메서드		원래 오브젝트의 equals 함수를 그대로 사용하면 == 연산자와 동일한 결과값이 나온다. equals를 오버라이딩(재정의)하지 않으면 == 연산자와 같은 것이다.
//		System.out.println( v1.equals(v2) ); // false
		
		// Object.equals() - Value 클래스에서 [오버라이딩]
		// v1, v2 주소값이 달라도  value 필드의 값이 같으면 같다라고 출력...
		System.out.println( v1.equals(v2) ); // false
		
		// [문제] Point 클래스
		// 		x, y 필드값이 같으면 equals() 같다.
		//		equals() 메서드를 오버라이딩 하세요..
//		Point p1 = new Point(10, 20);
//		Point p2 = new Point(10, 20);
//		
//		System.out.println( p1 == p2 );
//		System.out.println( p1.equals(p2) );
		
		/*
		5. clone()
		 ㄴ 복제 의미 : 같은 값을 가지는 새로운 인스턴스 생성...
		*/
		Point p1 = new Point(10, 20);
		// 복제
		/* [1]
		Point p2 = new Point();
		p2.x = p1.x;
		p2.y = p1.x;
		*/
		/* [2]
		Point p2 = new Point(p1.x, p1.y);	// 위와 같은 코딩
		*/
		
		// The method clone() from the type Object [ is not visible ] - 접근지정자 오류
		// Point p2 = p1.clone();
		
		// Type mismatch: cannot convert from Object to Point
		// Point p2 = (Point) p1.clone();	// clone은 사용할 때 다운캐스팅 필요 - 반환형 object일 때
		Point p2 = p1.clone();				// 반환형을 Point로 하면 다운캐스팅 필요없음 - jdk1.5~
		
		System.out.println( p1 );	// Point [x=10, y=20]  // .toString() 자동 생략
		System.out.println( p2 );
		
	} // main

} // class  

class Value extends Object{
	int value;
	
	public Value(int value) {
		this.value = value;
	}

	// 오버라이딩 조건: 
	// 접근지정자는 부모접근지정자의 범위보다 같거나 커야한다. 리턴자료형 같아야한다. 함수명 같아야한다. 매개변수 타입, 갯수 같아야한다. throws문은 더 많으면 안된다.
	// v1.equals(v2)	v2가 object obj, v1이 리턴값
	@Override
	public boolean equals(Object obj) {
		if ( obj != null && obj instanceof Value ) {
			Value v = (Value)obj; // 다운캐스팅
			return this.value == v.value;	// 비교연산자는 그 자체로 true/false 값이라 바로 리턴함
		} // if
		return false;	
	}
	
}

class Point extends Object implements Cloneable {	// repair과 같은 느낌. implements Cloneable을 구현하여, Object의 clone() 메서드는 해당 클래스에서 객체 복제를 허용한다.
	int x; 
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// p1.equals(p2)
	@Override
	public boolean equals(Object obj) {
		if ( obj != null && obj instanceof Point ) {
			Point p = (Point)obj; // 다운캐스팅
			return this.x == p.x &&	this.y == p.y;
		} // if
		return false;
	}
	
	// Point p2 = p1.clone();
	// Object.clone() 메서드를 이용하여 객체를 복제할 때
	// Cloneable 인터페이스를 구현하지 않는 클래스를 복제하려고 한다면
	// CloneNotSupportedException이 발생
	/*
	@Override
	protected Object clone() {	// 모든타입 다 복제해서 리턴하기 위해 리턴타입을 object로 설정 // throws CloneNotSupportedException 붙어있는게 기본인데 지우고 여기서 try~catch로 처리함 - 공부	
		Object obj = null;

		try {
			// UpCasting
			obj = super.clone();
		} catch (CloneNotSupportedException e) {	// 에러생기면 에러메세지로 검색해봐야함
			e.printStackTrace();
		}
		return obj;
	}
	*/

	// jdk1.5부터 '공변 반환 타입' 추가
	// 오버라이딩 할 때 조상 메서드의 반환타입을 자식 클래스의 타입으로 변경이 가능하도록 추가
	@Override
	protected Point clone() {	
		Object obj = null;
		
		try {
			// UpCasting
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Point) obj;
	}
	
	
	// alt+shift+s -> Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]"; 
	}	
	
	
	/* 이렇게 직접 쳐도 되지만 위처럼 하면 바로 예시가 나와서 편함
	@Override
	public String toString() {		
		// return super.toString(); // funallName@haCode16
		return String.format("> x=%d, y=%d", this.x, this.y);
	}
	*/		
	
}





