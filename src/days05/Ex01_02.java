package days05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		// [문제]
		// 두 정수 n, m 입력받아서
		// 두 정수 사이의 합을 출력
		
		
//	[1] 제일 좋지 않은 코드 - 정답은 나옴
//		
//		int n, m, sum=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("두 정수를 입력해주세요: ");
//		n = scanner.nextInt();
//		m = scanner.nextInt();
//		
//		if ( n > m ) {
//			for (int i = m; i <= n; i++) {
//				System.out.printf("%d+",i);
//				sum+=i;
//			}
//			System.out.printf("\b=%d", sum);
//		} else {
//			for (int i = n; i <= m; i++) {
//				System.out.printf("%d+",i);
//				sum+=i;
//			}
//			System.out.printf("\b=%d", sum);
//		}


		
//	[2] n 두 정수 작은 값, m 큰 값 설정	- 좋은 코딩	
//	
//		int n, m, sum=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("두 정수를 입력해주세요: ");
//		n = scanner.nextInt();
//		m = scanner.nextInt();
//		
//		if (n>m) {
//			int temp = n;
//			n = m;
//			m = temp;
//		}
//		
//		for (int i = n; i <= m; i++) {
//			System.out.printf("%d+",i);
//			sum+=i;
//		}
//		System.out.printf("\b=%d", sum);
		
		
		
// [3] ***이게 정답 - 변수명이 가독성이 좋음
		
		int n, m;
		int min, max, sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("두 정수를 입력해주세요: ");
		n= scanner.nextInt();
		m = scanner.nextInt();

//		min = n > m ? m : n; //- if값과 같은 항. 이렇게 바꿀수도 있음
//		max = n > m ? n : m;

		min = Math.min(n, m); // - 같은 결과
		max = Math.max(m, n);
		
//		if (n > m) {
//			min = m;
//			max = n;
//		} else {
//			min = n;
//			max = m;
//		}

		for (int i = min; i <= max; i++) {
			System.out.printf("%d+",i);
			sum+=i;
		}
		System.out.printf("\b=%d", sum);

		
		
	}

}
