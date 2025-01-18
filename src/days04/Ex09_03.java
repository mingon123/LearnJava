package days04;

public class Ex09_03 {

	public static void main(String[] args) {

		/*
		//for문을 사용한 2씩 증가하는 코드
		int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			System.out.printf("%d+", i);
			sum+=i;
		} //for
		System.out.printf("=%d \n", sum);
			
		*/
		// while문을 사용한 2씩 증가하는 코드
		int i = 1, sum = 0;
		while (i<=10) {
			System.out.printf("%d+", i);
			sum+=i;
			i+=2;
		}
		System.out.printf("=%d \n", sum);
		
	} //main

} //class
