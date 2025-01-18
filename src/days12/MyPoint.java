package days12;
// Ex03코드와 연동
// + Ex04(생성자 : constructor) 설명 추가

public class MyPoint {

	// field
	public int x = 0;
	public int y;
	
	// default constructor
	public MyPoint() {
		System.out.println("> MyPoint default constructor");
	}
	
	
	public MyPoint(int i, int j) {
		this.x = i;
		this.x = j;
		System.out.println("> MyPoint 2 constructor");
	}


	public MyPoint(int i) {
		this(i, i);		// 생성자 안에서 또다른 생성자를 호출하는 this - 생성자를 재사용해서 호출
//		x = i;
//		y = i;
		System.out.println("> MyPoint 1 constructor");
	}


	// method
	// (기억) 호출한 객체 : p1.dispMyPoint(); -> p1.x, p1.y
	// p2.dispMyPoint();	this == p2	  -> p2.x, p2.y							
	public void dispMyPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x, y);		
	}
	
	// 현재 좌표를 이동
	// p2.offsetPoint(100);
//	public void offsetPoint(int d) {	// 기본형 매개변수
//		x += d;
//		y += d;
//	}

	// 리턴값 참조타입
	// p2.offsetPoint(5);
	public MyPoint offsetPoint(int d) {	// 기본형 매개변수
		this.x += d;
		this.x += d;
		return this;  // p2
	}
	
	// 현재 좌표를 이동 + 매개변수로 받는 p객체의 x, y만큼 이동
	// p1.offsetPoint(p2); <- p1에 p2값만큼 증가
	public void offsetPoint(MyPoint p) {  // 참조형 매개변수
		x += p.x;
		y += p.y;
	}
	
	// 기본형 반환타입
	public int plusPointX() {
		return x + 1000;
	}
	
	// 참조형 반환타입
	// p1.createMyPoint(p2)
	// p2.createMyPoint(p2)
	public MyPoint createMyPoint(MyPoint p) {
		
		MyPoint newP = new MyPoint();
		newP.x = p.x;
		newP.y = p.y;
				
		
		return newP;
	}
	
	// p1.test()   this==p1
	public void test() {
		// p1.offsetPoint(p1);
		offsetPoint(this);  // this의 3번째 용도 - 매개변수값
	}
	
	
}
