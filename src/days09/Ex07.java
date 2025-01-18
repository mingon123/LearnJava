package days09;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 1. 7. - 오후 3:47:53
 * @subject (시험)
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {

		int [] m = new int[100];
		// 0<= 정수 <=9
		
		Random rnd = new Random();

		for (int i = 0; i < m.length; i++) {
//			m[i] = rnd.nextInt(10);
			m[i] = (int)(Math.random()*10);
		} // for i
		
		// 암기 [2]
//		m = IntStream.generate(() -> rnd.nextInt(10)).limit(100).toArray();
//		System.out.println(Arrays.toString(m));

		
//		[문제]
//		0 갯수 : 5개
//		1 갯수 : 15개
//		:
//		9 갯수 : 20개
//		
//		[문제]
//		0=? 1=? ... 9=?
		
		// cA[0]=0갯수
		// cA[1]=1갯수
		// cA[9]=9갯수
		int [] countArr = new int[10];
		
		for (int i = 0; i < m.length; i++) {
			int index = m[i];
			countArr[index]++;
			
//			countArr[m[i]]++; // 이렇게 바로 넣어도 되지만 가독성은 위가 좋음
		}
		System.out.println(Arrays.toString(countArr));
		
		
		/*
		for (int j = 0; j <= 9; j++) {
			int cnt = 0;
			for (int i = 0; i < m.length; i++) {
				if (m[i]==j) cnt++;
			}
			System.out.printf("%d : %d개 \n", j, cnt);			
		}
		*/
		
		
	} // main

} // class
