package days07;

/*
	재귀함수
	합, 팩토리얼
	거듭제곱 == 누승 == 멱 == power
	2^3 = 2*2*2=8
	밑수(2) 지수(3)
	- 밑수를 지수만큼 반복해서 곱하는 것.


	위의 3개는 필수 암기**

*/

public class Ex04_04 {

	public static void main(String[] args) {
		
//		int result = pow(2, 3);
//		double result = pow(2, -3);
//		double result = recursivePow(2, 3);
		double result = recursivePow(2, -3);
		System.out.println(result);
		
	} // main

	// 2, -3 == 1/(2,3)
	// This method must return a result of type double - 3가지의 if문에 안걸렸을 때 return문이 없음
	private static double recursivePow(int b, int e) {
		if (e==1) {
			return b;
		} else if (e < 0) {
			return 1/recursivePow(b, -e);
		} else {
			return b * recursivePow(b, e-1);
		}
	}

	// 밑수 base, 지수 exponent
	private static double pow(int b, int e) {
		int result = 1;
		int e2 = Math.abs(e);
		
		for (int i = 1; i <= e; i++) {
			result *= b;
		}
		return e < 0 ? (double)1/result : result;

		
	}

} // class
