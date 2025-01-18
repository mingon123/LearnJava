package days05;

public class Ex05 {

	public static void main(String[] args) {
		
		
//		별찍기
		/*
	
		****
		****
		****
		****

		 */
		
		
		
		
//		[1]
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
//		System.out.println("****");
		
		
		
//		[2]
//		for (int i = 1; i <= 4; i++) {
//			System.out.println("****");
//		} //for

		

//		[3]
		for (int i = 1; i <= 4; i++) {   // 바깥의 for문은 행 갯수
			for (int j = 1; j <= 4; j++) {		// 안쪽의 for문은 (별)열 갯수
				System.out.printf("*");
			} // for j
			System.out.println(); //개행
		} //for i
	
	
	
	} //main

} //class
