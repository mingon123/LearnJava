package days03;

/*

	논리연산자 
	true/false
	1) 일반 논리 연산자
		연산자 우선순위
		!	>	&&	>	|| 		//우선순위(중요)
		(1) !	부정(not) 연산자
			!참  => 거짓
			!거짓 => 참
		
		(2)	&&	일반 논리 AND 연산자 ( 논리곱 )
			참1	&& 참1	=> 참1	- 둘다 참일때만 참
			참1	&& 거짓0 	=> 거짓0
			거짓0	&& 참1 	=> 거짓0
			거짓0	&& 거짓0	=> 거짓0
			
		(3)	||	일반 논리 OR 연산자 ( 논리합 )
			참1	|| 참1	=> 참1	- 두 개 중에 하나라도 참이면 참
			참1	|| 거짓0 	=> 참1
			거짓0	|| 참1 	=> 참1
			거짓0	|| 거짓0	=> 거짓0
			
		
	2) 비트 논리 연산자
		(1) ~	"tilde" 연산자 == 비트 부정(NOT) 연산자
		(2) &	비트 논리 AND 연산자
		(3) |	비트 논리 OR 연산자
		(4) ^	e[X]clusive OR 연산자 == XOR 연산자
				배타적인(서로 다른)

 */

public class Ex04_04 {

	public static void main(String[] args) {
		
		// 2. 비트 논리 연산자 예제
		byte i = 10;
		System.out.println( ~i ); // -11
		// 0000 1010
		// 1111 0101 => -11
		// 1111 0100 -1을 함
		// 0000 1011 보수를 취함
		// 11 = 8+2+1
		// -11
		
		//  0000 1010
		// &0000 0011
		//  0000 0010
		System.out.println( i & 3 ); // 2
		
		//  0000 1010
		// |0000 0011
		//  0000 1011
		System.out.println( i | 3 ); // 11

		//  0000 1010
		// ^0000 0011
		//  0000 1001
		System.out.println( i | 3 ); // 9

		
		
		/* 1. 일반논리연산자 예제
		
		System.out.println( !true );
		//System.out.println( !100 ); // java에선 !연산자를 boolean형을 써야함. c언어에서는 100도 true로 인식하지만 java는 아니기 때문에 !뒤에는 무조건 boolean형 써야함
		System.out.println( 5 > 3 );
		//The operator ! is undefined for the argument type(s) int
		//System.out.println( !5 > 3 );
		System.out.println( !(5 > 3) ); // 비교 후 부정하느 식으로 해야함
		
		//					효율적 연산( short circuit evaluation )
		System.out.println( !(5 > 3) && !true );
		//					false

		//					효율적 연산에 의해 앞에께 0이 되거나 1이 되어 뒤에는 더 이상 연산할 필요없으면 안함
		System.out.println( !(5 < 3) || !true );
		//					true		
		
		*/

	}

}
