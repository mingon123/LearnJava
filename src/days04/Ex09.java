package days04;

// break, continue

public class Ex09 {

	public static void main(String[] args) {
		
//		1.  for문 사용해서 1+2+...+9+10=55
//	 	[문제1] sum을 for문 안에서 선언한 경우
//		for (int i = 1, sum = 0; i <= 10; i++) {
//			if(i > 10) break;
//			System.out.printf("%d+", i);
//			sum += i;
//					
//		} //for
//		
//		//sum cannot be resolved to a variable - sum을 for문 안에서 선언해서 for문 밖에서는 사용할 수 없다
//		System.out.printf("=%d", sum);
	
		
//		[문제2] 홀수의 합
//		1+3+5+7+9=25
//		
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				System.out.printf("%d+", i);
//				sum += i;				
//			}		
//		} //for
//		System.out.printf("=%d", sum);
	
		
//		[문제3] 홀수의 합
//		1+3+5+7+9=25
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if( i % 2 == 0 ) continue; // 밑에 코딩안하고 바로 증감식으로 보냄
//			if( i % 2 == 0 ) break; // 제어문을 빠져나갈 때 사용
//			if( i % 2 == 0 ) return; // 메서드(함수)를 빠져나감 - 여기서는 main함수를 나감. main함수 = 프로그램 시작과 종료, return하면 프로그램 종료
			System.out.printf("%d+", i);
			sum += i;				

		} //for
		System.out.printf("=%d", sum);		
		
		
		
		
		
	}

}
