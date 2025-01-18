package days03;

/*

	삼항연산자( 조건연산자 )
	 	항1 ? 항2 : 항3
	   참/거짓
	x > 5 ? 100 : 200;
	항1이 참이면 항2
		거짓이면 항3
	
		
		// instance of 연산자 - 클래스 수업할 때 설명


 */

public class Ex04_06 {

	public static void main(String[] args) {
		
		int x = 30, y;
		
		//y = x > 5 ? 100 : 200; // 보기 편하게 하기 위해 ()를 해도 안해도 상관없음

		y = x > 5 ? (x < 10 ? 1: 2) : 200; // 삼항연산자 안에 삼항연산자 무한으로 반복 가능
		
		System.out.println( y );

		
	}

}
