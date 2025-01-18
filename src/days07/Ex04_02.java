package days07;

/*
재귀 함수 : 가능하면 사용하지 않는게 좋음
	트리 구조를 검색할 때 사용함.
 */

public class Ex04_02 {

	public static void main(String[] args) {
		
//		int result = sum(10);
		int result = recursivesum(10);
		System.out.println(result); // 55


	} // main

	// 재귀함수 (암기)
	private static int recursivesum(int n) {
		
		if ( n == 1 ) {
			return n;
		} else {
			return n + recursivesum(n-1);
		}
	}

	
	// 1~n 합을 반환하는 메서드
	private static int sum(int n) {
		// 1~n 까지의 합을 구해서 반환하는 메서드
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

} // class
