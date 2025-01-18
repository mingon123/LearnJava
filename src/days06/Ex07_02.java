package days06;


// 절대치를 구하는 abs함수

import java.util.Arrays;
import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
			
		// 1~100 임의의 정수를 뽑아내
		// 정수를 입력받아서 입력받은 수와 가장 가까운 수를 찾아서 출력
		// [문제] 배열에서 가장 가까운 정수를 찾아서 출력~
		// [출력형식] 정수 입력 ? 56
		int [] m = new int [10];
		
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*101)+1;
		}
		
		// [47, 8, 2, 16, 94, 26, 9, 25, 15, 17]
		System.out.println( Arrays.toString(m));
		
		// 정수입력 ? 56
		System.out.printf("정수 입력 ? ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		int min = 101;	// 안나오는 값으로 초기화
		int result = 0; // 제일 가까운 거리
		
		for (int i = 0; i < m.length; i++) {
			
			int d = Math.abs(m[i]-n); // 절대치 구하는 함수

			if ( d < min ) {
				result = m[i];
				min = d;
			}
//			System.out.printf("m[%d]=%d - %d = %d  [%d] \n", i, m[i], n, d, d * ( d < 0?-1:1)); // 삼항연산자: 음수면 양수만들기
		}
		System.out.printf("%d[%d] \n", result, min);

		
	}

}
