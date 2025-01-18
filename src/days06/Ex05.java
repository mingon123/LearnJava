package days06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// [문제] 두 정수 n, m을 입력받아서 두 정수 사이의 짝수의 합을 출력
		// > n m 입력? 3 50
		// > n m 입력? 10 3

		int n, m, sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("n m 입력? ");
		n = scanner.nextInt();
		m = scanner.nextInt();
				
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		
		if (min%2!=0) {
			min++;
		}
		
		for (int i = min; i <= max; i+=2) {
				System.out.printf("%d+", i);
				sum += i;
		}
		System.out.printf("\b=%d ", sum);

		
		
	}

}
