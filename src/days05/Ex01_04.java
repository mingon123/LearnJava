package days05;

import java.util.Arrays;

public class Ex01_04 {

	public static void main(String[] args) {
		
//		배열 사용하여 동일한 자료형을 여러개 선언함
		
//		0~100사이의 정수를 무작위로 
		
		int [] m = new int [10];
		
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random() * 101);
			}
		
//		배열값을 확인
//		Arrays 클래스: 배열을 사용하기 쉽도록 기능이 구현된 클래스
		System.out.println( Arrays.toString(m) );
//		[94, 82, 20, 60, 9, 63, 29, 89, 19, 6]
		
		int max = m[0];
		int min = m[0];
		for (int i = 1; i < m.length; i++) {  //i=0번째가 가장 큰값을 저장하기 때문에 2번째 숫자부터 비교
			 max = Math.max(max, m[i]);
			 min = Math.min(min, m[i]);
		}
		System.out.printf("> max = %d, min = %d \n", max, min);
		
		
		
		
		
	}

}
