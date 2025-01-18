package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오후 3:14:59
 * @subject
 * @content 
 */
public class Ex08 {
	
	public static void main(String[] args) {
		/* Employee 클래스로 아래 내용들 전부 설명
		
		1. 상속성
		2. 다형성 / 인터페이스
		3. 업캐스팅 / 다운 캐스팅
		4. 오버로딩 / 오버라이딩
		5. 추상화 ( 추상메서드, 추상 클래스 )
		6. this, super 키워드 사용
		등등
		
		
		1. 사원이라면 공통적으로 가지고 있어야할 멤버들을 선언한 사원 클래스 선언
			Employee
		2. 사원클래스의 자식클래스인 정규직 사원 클래스
			Regular
		3. 정규직 클래스를 물려받은 자식 클래스인 영업직 사원 클래스
			SalesMan
		4. 사원클래스의 자식클래스인 임시직 사원 클래스
			Temp
		*/
		
		/*
		[상속 계층도]
		
			   Object		모든 클래스의 최상위 부모 클래스이다.
		   		 ↑           
			  Employee
		   ↑		   ↑
		Regular		  Temp
		   ↑
		SalesMan
		 */
		
		/*
		// 1. 사원(Employee) 객체 생성 후 메서드 호출
		Employee emp1 = new Employee("김민곤", "서울 강남구", "010-1111-2222", "2025.06.31");
		emp1.dispEmpInfo();
		*/
		
		/*
		// 2. 정규직(Regular) 객체 생성
		// 상속관계에서 객체 생성시 생성자 호출 순서 ( 기억 ) <- 부모먼저호출, 자식나중호출
		Regular emp2 = new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000);
		// [문제점] 부모의 dispEmpInfo() 메서드를 사용하면 문제점이 있다.
		//		  basePay 기본급과 관련된 사원 정보는 출력되지 않더라...
		//		  재정의 함수( 오버라이딩 override )
		emp2.dispEmpInfo();
		*/
		
		
		// 클래스들 간에 형변환할 수 있다.	[왜함?]  
		// 클래스들 간에 자동으로 형변환이 되었다.
		// 1) UpCasting (자동 업캐스팅)
		// 부모타입 참조 <-		자식 객체 생성 후 
		Employee emp3 = new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000);
		// [질문] dispEmpInfo() n,a,t,h + basePay
		// Employee의 메서드가 호출될까? Regular의 메서드가 호출될까?
		// (중요) 실제 참조된 Regular 객체의 dispEmpInfo()메서드가 호출된다.
		emp3.dispEmpInfo();
		
		// [문제점] 업캐스팅 후의 문제점 파악
		// emp3.getPay();  X. 호출할 수 없더라...(자식클래스에는 있는데 부모클래스에는 없음)
		
		
		// 자동 업캐스팅(upCasting) 	: 부모 <- 자식으로 형변환
		// 강제 다운캐스팅(downCasting) : 부모 -> 자식으로 형변환
		// Type mismatch: cannot convert from Employee to Regular
		// 클래스들 간의 형변환할 때 사용하는 방법(연산자) : (변환하고자하는 클래스명) cast연산자		
		Regular emp4 = (Regular) emp3;
		
		
		/* 클래스들 간의 상속 관계가 있을 경우에만 형변환이 가능하다.
		// Type mismatch: cannot convert from Regular to Temp
		Temp emp4 = new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000);  // 오류
		
		Object emp4 = new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000); // 가능
		*/
		
		
		/*
		[형변환]
		자동형변환 2가지 경우
		강제형변환 - cast연산자

		// long = int  자동 형변환
		long l = 100;
		// int = long  자동 형변환 X, 강제 형변환 O	- cast연산자
		int i = (int) l;
		*/
		

	} // main
	
} // class
