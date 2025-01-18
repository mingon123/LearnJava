package days03;



public class Ex04_05 {

	public static void main(String[] args) {

		
		// 단항 연산자
		System.out.println( !true );
		System.out.println( +3 );
		System.out.println( -3 );
		
		// 증감연산자(기능) ++ --
		int x =10;
		
		// 1) 단독으로 사용될 때는 전/후위형은 동일한 기능이다.
		// x++;	// 후위형 증감연산자
		// ++x;	// 전위형 증감연산자
		
		// 2) 단독X
		// int y = ++x; // 11/11 - x값 증가 먼저 후 연산
		int y = x++; // 11/10 - 대입연산자 후 x값 증가
		
		System.out.println(x + " / " + y);
		
		// 전위형/후위형 증감 연산자
		// int x = 10;
		// while(x++ <= 10) {}	10<=10 true
		// while(++x <= 10) {}	11<=10 false
		
		/*
		// x 기억공간의 값을 [1증가]/1감소 하는 방법
			(1) x = x + 1;
			(2) x += 1;
			(3) x++;
			
		//1 감소시키는 코딩
			(1) x = x - 1;
			(2) x -= 1;
			(3) x--;

		 */
		
		//[문제] x 기억공간의 값을 5증가		
		x = x + 5;
		x += 5;
				
		
	}

}
