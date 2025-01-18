package days09;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오후 2:07:19
 * @subject
 * @content 

	카드 섞기, 화투 섞기 등

 */
public class Ex05 {

	public static void main(String[] args) {

		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i]=i;
		}
		System.out.println(Arrays.toString(m));

		// 배열 섞기
		shuffle(m);
		
		System.out.println(Arrays.toString(m));
	} // main

	// Call By Reference - 얘를 섞어도 원래 값도 섞임
	private static void shuffle(int[] m) {
		Random rnd = new Random();
		int idx1 = 0, idx2;		
		for (int i = 0, temp; i < 100; i++) { // 100번 정도 두 사람이 일어나서 자리 바꿈
			// idx1 = rnd.nextInt(m.length); // 한자리는 고정하고 한자리만 바꿔도 값은 바뀜 
			idx2 = rnd.nextInt(m.length);
			
			temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		} // for
	} // shuffle

} // class
