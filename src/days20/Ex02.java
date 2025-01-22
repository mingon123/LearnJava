package days20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오전 10:23:08
 * @subject
 * @content 


 */
public class Ex02 {

	public static void main(String[] args) {

		// 1~25 정수를 중복되지 않게 2차원 배열에 채워넣기를 하고 싶다
		int [][] bingo = new int [5][5];

		// [1] LinkedHashSet 사용
		LinkedHashSet<Integer> hs = new LinkedHashSet<>(25);	// 고정된 값은 값을 주는것이 좋음
		int rnd = -1;
		while ( hs.size() < 25 ) {
			rnd = (int)(Math.random()*25)+1;
//			System.out.println(rnd);
			hs.add(rnd);
		}
		System.out.println(hs);
		
		// LinkedHashSet -> int [][]
		// int[] -> int[][]
		Iterator <Integer> ir = hs.iterator();
		int i = 0;
		while (ir.hasNext()) {
			int n = ir.next();
			bingo[i/5][i%5]=n;
			i++;
		} // while
		
		// 출력.
		for ( i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]" ,bingo[i][j]);
			}
			System.out.println();
		}
		
		
		// [2] HashSet 사용

//		HashSet<Integer> set = new HashSet<Integer>();
//		int rnd;
//		for (int i = 0; i < 5; i++) {
//			int col = 0;
//			while( col < 5 ) {
//				rnd = (int)(Math.random()*25)+1;
//				if (set.add(rnd)) {
//					bingo[i][col] = rnd;
//					col++;
//				}	
//			}
//		}
//		
//		// 출력
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//            	System.out.printf("[%02d]" ,bingo[i][j]);
//            }
//            System.out.println();
//        }

		
		
		// [3] HashSet 사용안했을 때 , 메서드 추가했는데 여기는 코드 없음
		/*
		for (int i = 0; i < bingo.length; i++) {
	         for (int j = 0; j < bingo[i].length; j++) {
	            int n = (int)( Math.random()*50 ) + 1; // 중복 되지 않으면 
	            if( ! isDuplicateCheck( bingo, i, j, n)) {
	                 bingo[i][j]  = n;
	            }else {
	               j--;
	            }
	         }
	      }
		*/

	} // main

} // class
