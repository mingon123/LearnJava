package days05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// n 정수를 입력받아서 - 1보다 작은 값을 입력하면 for문은 한번도 돌지 않는다
		// 1~ n 까지의 합을 출력하는 코딩..
		
		int n = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);	
		System.out.print("> 정수를 입력하세요: ");
		n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d",sum);
		
		
	}
	
}
