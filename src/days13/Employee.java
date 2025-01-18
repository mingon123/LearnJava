package days13;

// [사원클래스]
// 사원이라면 공통적으로 있어야할 멤버(필드, 메서드)를 구현한 클래스
// 추상클래스 : 객체를 생성할 수 없는 불완전한 클래스
//	ㄴ 하나라도 추상 메서드를 가지고 있으면 추상클래스가 된다.
// 추상클래스 : 공통적인 멤버로 클래스를 구현할 경우에는 추상클래스 선언할 경우가 많다.
public abstract class Employee extends Object{  // class앞에 abstract가 붙으면 추상클래스

	// 필드
	private String name;		// 사원명
	private String addr;		// 사원주소
	private String tel;			// 사원연락처
	private String hiredate;	// 입사일자

	
	// 메서드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getHiredate() {
		return hiredate;
	}
	
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	// 사원 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n", this.name, this.addr, this.tel, this.hiredate);
	}
	
	
	// 생성자
	public Employee() {
		super();  // Employee의 부모 클래스인 Object를 호출함
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨."); // 매개변수 4개
	}
	
	
	// getPay() X 	R(기)	S(기+판*커)	T(일*일수) - 월급 계산 방식이 다 달라서 어차피 오버라이딩 해야해서 Employee에는 getPay()메서드를 만들지 않았었음.
	/*
	public int getPay() {	// 아무 기능 없는 함수를 자식클래스에서 오버라이딩해서 사용하도록 한다. - 다른 언어에서는 가상메서드라고 한다(자바에는 없음).
		return 0;
	}
	*/
	
	// 몸체(body) == { } - X 구현이 안된 불완전한 메서드를 abstract 키워드를 붙여서 "추상메서드"라고 부른다.
	// 반드시 오버라이딩해서 사용하는 메서드는 이렇게 몸체없이 선언한다.
	// This method requires a body instead of a semicolon - abstract 키워드 붙여서 해결
	public abstract int getPay(); 	
	
	
} // class
