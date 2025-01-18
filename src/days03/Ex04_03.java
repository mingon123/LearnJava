package days03;

/*
	비교연산자
	: 결과는 true/false ...boolean 형이다.
	  == != > < >= <=
	
 */

public class Ex04_03 {

	public static void main(String[] args) {

		int i = 10, j = 5;
		
		System.out.println( i == j); // false
		System.out.println( i != j); // true
		System.out.println( i > j); // true
		System.out.println( i < j); // false
		System.out.println( i >= j); // true
		System.out.println( i <= j); // false
		
		// 비교연산자를 사용할 때 (주의할 점)
		System.out.println( i = j ); // 비교연산자가 아니라 대입연산자라 5가 출력됨
		
		//The left-hand side of an assignment must be a variable - 좌측항을 변수로 설정하지 않음
		//System.out.println( 10 = 5 );
		
		//System.out.println( i =! j );
	}

}
