package days09;

import java.util.Arrays;

public class Ex02_02 {

	public static void main(String[] args) {
//		복습 문제4 : 함수사용
		
//		[1] Arrays.copyOf()
//		int [] m = {1, 2, 3};
//		int [] temp = Arrays.copyOf(m, m.length+3);
//		m = temp; // 
//		System.out.println(Arrays.toString(m));
		
		
//		[2] System.arraycopy
		int [] m = {1, 2, 3};
		int [] temp = new int [m.length+3];
		System.arraycopy(m, 0, temp, 0, m.length); // m 배열을 0번째부터 temp에 복사할 것이다. 몇번째자리에? 몇자리까지?
		// m배열을. 0번째자리부터 복사. temp에. temp[0]부터. m의 내용 전체
		
		m = temp;
		System.out.println( Arrays.toString(m));
		
		
		
		
	}

}
