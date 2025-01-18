package days06;

public class Ex03 {

	public static void main(String[] args) {
		// 구구단 출력
		
//		[n단 출력]
//		int dan = 2;
//		System.out.printf("[%d 단] \n", dan);
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d*%d=%02d \n", dan, i, dan*i);
//		} // for i

		
//		[2~9단 출력]
		for (int i = 2; i <= 9; i++) {  // 단
			System.out.printf("[%d 단] \n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%02d \n", i, j, i*j);
			} // for j
		} // for i
		
		
		

	} // main

} // class
