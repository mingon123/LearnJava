package days04;

public class Ex09_02 {

	public static void main(String[] args) {
		//while 1+2+...9+10=55
		
		/*

//		[문제1] while문을 사용하고, 홀수만 출력
		int i = 1, sum = 0;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.printf("%d+", i);
				sum += i;				
				//i++; // 예외처리를 하지 않아 ++하여 i값이 2가 되어 if문에서 빠져나오지 못함
			}
			i++;
			
		}
		System.out.printf("=%d", sum);
		
		*/
		/*
		
//		[문제2] while문을 사용하고 홀수만 출력 + continue문을 꼭 사용해야하는 경우
//		(1 - 내가푼거)
		int i = 0, sum = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0 ) continue; 
			System.out.printf("%d+", i);
			sum += i;				
		} 	//while
		System.out.printf("=%d", sum);
		
		*/
		
		/*
//		(2 - 다른사람이 푼거 - 가독성이 좋음)
		int i = 1, sum = 0;
		while (i < 10) {
			if (i % 2 == 0 ) { 
				i++;
				continue; 
			}
			System.out.printf("%d+", i);
			sum += i;		
			i++;
		} 	//while
		System.out.printf("=%d", sum);
		*/
		
		/*
//		(3 - 교수님이 푼거)
		int i = 0, sum = 0;
		while (i++ < 10) { 			// while문 안에 넣음
//		while (++i <= 10) {			// ++i를 하면 10을 체크하지 않기 때문에 (++i <= 10) 을 해야함, i=1;로 선언되었었다면 1이 출력되지 않음
			if (i % 2 == 0 ) continue; 
			System.out.printf("%d+", i);
			sum += i;				
		} 	//while
		System.out.printf("=%d", sum);
		*/
		
		
		
	} //main

} //class
