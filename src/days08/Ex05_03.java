package days08;

public class Ex05_03 {

	public static void main(String[] args) {

		// [정보처리기사 실기] 
//		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//		규칙 : 화폐단위 50000/ 5, /2, /5, /2, /5, /2
		
		int money = 125760;
		int unit = 50000;
		boolean sw = false; // 스위치 변수
		int count = 0; // 수량(갯수)
		
		while( unit >= 1) {
			count = money / unit;
			System.out.printf("%d원 : %d 개 \n", unit, count);
			money %= unit; // 나머지 값이 새로운 money 변수에 저장
			unit /= ( !sw ? 5 : 2 );
			sw = !sw;
		} // while	
		
		

		
	} // main

} // class
