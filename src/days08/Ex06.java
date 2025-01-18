package days08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 10진수 정수를 입력받아서
		// 2바이트 2진수 형태로 출력...
		
		// 정수 입력 ? 10
		// 배열 선언 -> 크기 : 16 
		// [0][][][][][][][][] [][][][][0][1][0][1][0] <- 빈칸은 전부 0

		int [] binaryArr = new int[16];
//		System.out.println(Arrays.toString(binaryArr)); // 자동으로 0으로 채워져있어서 넣을 값만 넣으면 나머지는 안채워도 됨.
		
		int n = 10;
		int 몫, 나머지;
		int index = binaryArr.length-1;
		while( n != 0 ) {
			몫 = n / 2;
			나머지 = n % 2;
//			System.out.println(나머지);
			binaryArr[index--] = 나머지;
			n = 몫;
		} // while
		System.out.println(Arrays.toString(binaryArr));
		
	}

}
