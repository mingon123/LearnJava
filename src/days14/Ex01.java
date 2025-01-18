package days14;

import days13.Employee;
import days13.Regular;
import days13.SalesMan;
import days13.Temp;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오전 9:34:33
 * @subject
 * @content 
 
다형성(업캐스팅) + 다운캐스팅(instanceof) 설명
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// 1.
		// Cannot instantiate the type Employee : Employee 클래스가 abstract 클래스인 경우
//		Employee emp1 = new Employee("김대원", "서울 강남구", "010-1111-2222", "2025.06.31");
		
		// 2.
		Regular emp2 = new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000);
		
		// 3. 영업직(SalesMan) 객체 생성
		SalesMan emp3 = new SalesMan("이찬진", "경기도 남양주", "010-7878-9878", "2000.03.29", 500000,20, 150000);
//		emp3.dispEmpInfo();
//		System.out.println( emp3.getPay() );

		
		// 4. 임시직(Temp) 객체 생성
		Temp emp4 = new Temp("오재문", "서울 강북", "010-4334-3894", "2022.02.01", 15, 200000);
//		emp4.dispEmpInfo();
		
		// ( 가정 : 사원들의 종류가 100가지... )
//		사원정보출력(emp1);
//		사원정보출력(emp2);	// E emp = new R() 상속관계, 업캐스팅
		사원정보출력(emp3); // E emp = new S() 상속관계, 업캐스팅
//		사원정보출력(emp4); // E emp = new T() 상속관계, 업캐스팅
		
		// 캡슐화(은닉화) : 데이터에 바로 접근하지 못하게 만들어 안전하게 보호하고, 비슷한 기능을 모아서 사용하기 편하게 만든 것
		// 상속성 : 기존클래스를 재사용하여 새로운 클래스를 선언하는 것
		
		/*
		[ 다형성 ( polymorphism ) ]
		1. 상속 관계
		2. 다양한 성질
		3. 여러가지 형태를 가질 수 있는 능력 ( 업캐스팅 )
		4. 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 한 것. ( 업캐스팅 )
		*/

		
	} // main

	private static void 사원정보출력(Employee emp) {	// 매개변수의 다형성( 다형성은 다형성인데 매개변수가 다형성으로 존재하는 것 )  - 업캐스팅 개념을 포함하고 있기 때문에 메서드를 전부 선언할 필요없이 부모만 선언해도 됨. 
		// 매개변수로 전달된 실제 객체가 E/R/S/T 파악 - instanceof 연산자
		// intstanceof 연산자 - 주의할점 : 자식 클래스부터 확인 + if else if 문 사용( 상위는 전부 true로 뜨기 때문에 구분할 수 없기 때문 )
		if (emp instanceof SalesMan) {
			System.out.println("영업직");
			// SalesMan 다운캐스팅
			SalesMan sm = (SalesMan) emp;
			// 여기서 다운캐스팅 된 sm을 사용하면 됨
			//
			//
		} else if (emp instanceof Regular) { 
			System.out.println("정규직");
			// Regular 다운캐스팅
		} else if (emp instanceof Temp) { // 상속관계가 없는 Temp는 Employee 위에(먼저 계산)만 위치하면 됨
			System.out.println("임시직");
			// Temp 다운캐스팅
		} else if (emp instanceof Employee) {
			System.out.println("사원");
		}

		System.out.println(emp instanceof Employee);
		System.out.println(emp instanceof Regular);
		System.out.println(emp instanceof SalesMan);
		System.out.println(emp instanceof Temp);

		emp.dispEmpInfo();
	}
	
	/*
	private static void 사원정보출력(Employee emp) {
		emp.dispEmpInfo();
	}
	
	private static void 사원정보출력(Regular emp) {
		emp.dispEmpInfo();
	}

	private static void 사원정보출력(SalesMan emp) {
		emp.dispEmpInfo();
	}
	private static void 사원정보출력(Temp emp) {
		emp.dispEmpInfo();
	}
	*/
	
	
} // class
