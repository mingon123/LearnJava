package days04;

public class Ex08 {

	public static void main(String[] args) {
		
		// 로또번호 645	1~45 6(1~45 숫자 중 6개 뽑음)
		// 자바에서 임의의 수 발생시키는 방법
		// 1) Math.random() - 지금 사용
		// 2) Random 클래스
		
		// 0.0 <= double Math.random() < 1.0
		/*
		
		for (int i = 0; i < 10; i++) {			
			System.out.println( Math.random() );
		}
		
		 */
//		System.out.println( Math.random() ); 함수 설명
		
		// 로또 범위 설정하는 방법(이유)
		// 0.0*45 <=    double   Math.random()*45  < 1.0*45
		// 1 <=    (int)(Math.random()*45)+1  < 46  - 범위
		/*
		for (int i = 0; i < 100000; i++) {			
			int n =  (int)(Math.random()*45)+1 ;
			//if( n < 1 || n > 45) {
			if( !(n >= 1 && n <= 45) ) {
				System.out.println("XXX");
			}
		}
		*/		
		
		
		//'\n'  '\r'	'\"'	'\''	'\t'	'\b'
		for (int i = 1; i <= 6 ; i++) {			
			int n =  (int)(Math.random()*45)+1 ; 
			System.out.printf("%d\t", n); 
		}
		System.out.println(); // 개행
		System.out.println("END");		
		
		



		
			
		

		
		
		
	}

}
