package days03;

/*

	산술 연산자 (이항연산자) 설명
	+ - * / 등등
	
	쉬프트 연산자 (비트연산자) - 산술연산자에 포함
	>> >>> <<


*/

public class Ex04_02 {

	public static void main(String[] args) {
		
		// 2. 쉬프트(shift) 연산자
		// shift 사전적 의미: 방향을 바꾸다. 물건을 이동시키다(옮기다)
		
		System.out.println(15 >> 2);
		// 0000 1111 >> 2
		// __00 0011  
		// 0000 0011 = 3 // 첫번째 부호비트에 따라 0과 1이 정해짐
		System.out.println(15 >>> 2); 
		// >>> 3개는 첫번째 비트를 무조건 0으로 채움		
		
		System.out.println(15 << 2);
		// 0000 1111 << 2
		// 0011 11__
		// 0011 1100 = 60 // 좌측 쉬프트 연산자는 무조건 0
		
		
		/* 1. 산술연산자 예제
		
		int i = 10, j = 3;
		
		// Alt + Shift + A - 여러 항 선택해서 한번에 여러줄 입력도 가능

		System.out.println( i + j ); // 13
		System.out.println( i - j ); // 7
		System.out.println( i * j ); // 30
		System.out.println( i / j ); // 3 - ( 몫 ) i,j 모두 정수형이기 때문에 소숫점이 붙지 않음.
		System.out.println( (double)i / j ); // 3.333333333 - 하나를 실수형으로 바꾸면 소숫점까지 출력됨
		System.out.println( i % j ); // 1 - ( 나머지 )

		// (주의할 점)
		//System.out.println( 10 / 0 ); // ArithmeticException: / by zero. -> 0으로 나누는 산술적 오류
		System.out.println( 10D / 0 ); // Infinity : 무한대. -> 실수는 오류가 나지 않음 

		//System.out.println( 10 % 0 ); // ArithmeticException: / by zero
		//System.out.println( 10D % 0 ); // NaN(Not a Number = 숫자가 아니다
		
		*/
		
		
	}

}
