package days13;

// [정규직 사원 클래스]
public class Regular extends Employee {

	// 필드 - private : name, addr, tel, hiredate 상속
	// 메서드 - public : getter, setter, dispEmpInfo() 상속
	// 생성자 - 상속X
	
	// 필드
	private int basePay; // 기본급

	
	// getter, setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	
	// 생성자 - 초기화하는 역할
	public Regular() {
		super();  // Employee의 부모 클래스인 Object를 호출함
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {	
		super(name, addr, tel, hiredate);																	// Point3D.java도 이것처럼 바꾸면됨
		this.basePay = basePay;
		System.out.println("> Employee 5 생성자 호출됨."); // 매개변수 5개
	}	
	
	// 메서드
	// 급여 계산해서 반환하는 메서드
	public int getPay() {
		return this.basePay; // 정규직은 기본급만...
	}
	
	// 사원 정보를 출력하는 메서드
	@Override
	public void dispEmpInfo() {
//		super.dispEmpInfo(); // name, addr, tel, hiredate
//		System.out.printf("기본급=%d\n", this.basePay);
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d\n", this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.basePay);
	}

}
