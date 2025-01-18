package days09;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오전 10:47:01
 * @subject
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
//		배열
		
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 1. 8 정수를 배열에 마지막 요소로 추가 = append
		// 배열 크기 증가시켜야 함
		// m[5] = 8; - 추가 못함
		
		
//		// 2. index 2 삭제
		for (int i = 3; i < m.length; i++) {
			m[i-1] = m[i];
		}
		// 마지막 값 초기화
		m[m.length-1] = 0; 
		// 마지막 방 제거
		int [] temp = Arrays.copyOf(m,  m.length-1);
		m = temp;
		System.out.println(Arrays.toString(m));
		
		
		// 3. index 2에 100 정수 삽입.. 
		temp = new int[m.length+1];
		System.arraycopy(m, 0, temp, 0, 2);
		System.arraycopy(m, 2, temp, 2+1, m.length-2);
		temp[2] = 100;
		m = temp;
		System.out.println(Arrays.toString(m));
		
		// 4. 수정
		m[2] = 200;
		
	} // main

} // class




