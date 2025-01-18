package days07;

import java.util.Iterator;
import java.util.Random;

/*
	메서드(함수) 처리(로또)
 */

public class Ex05_03 {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		fillLotto(lotto);
		
		// 1. 기능 -로또번호 출력 메서드
		// 2. 매개변수 - 출력할 배열 lotto
		// 3. 리턴값 - X, void
		dispLotto(lotto);
		

	} // main

	
	// 6번째 방까지 값을 채워넣는 함수
	public static void fillLotto(int[] lotto) {
		int index = 0, n;
		Random rnd = new Random();
		
		while (index < 6) {
			n = rnd.nextInt(45)+1;
			
			// 중복되면 true 반환
			if ( !isDuplicateLotto(lotto, n, index) ) { // 중복체크 후 중복X
				lotto[index++] = n;
				// index++;						
			}
		} // while
		
	} // fillLotto
	
	
	// 중복체크하는 함수
	public static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		for (int i = 0; i < index; i++) {
			if ( lotto[i] == n ) return true;
		}
		return false;
	} // isDuplicateLotto

	
//	1. 배열, 2. 새로 발생한 값, 3. 위치값(index) -> 새로 발생한 값의 위치값을 가져와서 앞자리와 비교
	
	// 값을 출력하는 함수
	public static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) { // 여기서는 for문 썼는데 arrays.tostring써도 됨.
			System.out.printf("[%d]", lotto[i]);
		}		
		System.out.println();
	}	

	
	
	
} // class
