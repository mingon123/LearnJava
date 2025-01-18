package days14;

import days13.Employee;
import days13.Regular;
import days13.SalesMan;
import days13.Temp;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오전 10:44:51
 * @subject
 * @content 
 */
public class Ex01_02 {

	public static void main(String[] args) {

		// R/S/T 생성 -> E[] 클래스 배열 초기화.
		
		// 3개 다 같은 코드
		/*	
		Regular emp2 = new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000);
		SalesMan emp3 = new SalesMan("이찬진", "경기도 남양주", "010-7878-9878", "2000.03.29", 500000,20, 150000);
		Temp emp4 = new Temp("오재문", "서울 강북", "010-4334-3894", "2022.02.01", 15, 200000);
		
		Employee [] emps = {
				emp2,
				emp3,
				emp4
		};
		*/
		
		// 클래스 배열 + 초기화
		Employee [] emps = {
				new Regular("김민곤", "서울 양천구", "010-1212-1212", "2020.01.24", 3000000), 
				new SalesMan("이찬진", "경기도 남양주", "010-7878-9878", "2000.03.29", 500000,20, 150000), 
				new Temp("오재문", "서울 강북", "010-4334-3894", "2022.02.01", 15, 200000)
		};

		
		for (int i = 0; i < emps.length; i++) {
			사원급여출력(emps[i]);
		}
		
		
//		사원급여출력(new TempTwo());
		
		
	} // main

//	private static void 사원급여출력(Object emp) {	// 모든 자료형타입을 다 받겠다.(최상위 클래스이므로)
	private static void 사원급여출력(Employee emp) {	// 매개변수 다형성
		System.out.println( emp.getPay() );
		
		// emp.getpay <- R/S/T 에는 getPay() 함수가 있는데 Emp에는 getPay() 함수가 없기 때문에 emp.getPay()를 바로 호출할 수 없음
		/*
		// [1] 다운캐스팅
		if (emp instanceof SalesMan) {
			System.out.println(((SalesMan) emp).getPay());
		} else if (emp instanceof Temp) {
			System.out.println(((Temp) emp).getPay());
		} else if (emp instanceof Regular) {
			System.out.println(((Regular) emp).getPay());
		}
		*/
		// [2] Employee.getPay() 추가 선언
	}
	
} // class

// 10년 후에 새로운 임시직2가 생성되더라도... 사용가능 (다형성의 장점)
class TempTwo extends Temp {
	
}
