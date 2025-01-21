package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**2025. 1. 21. - 오후 4:27:15
 * 
 * 
		로또 게임
		days07.Ex08.java
		days10.Ex05_03.java
			fillLotto()
			dispLotto()
			isDuplicateLotto()
		days10.Ex06_02.java
 */
public class Ex12_02 {

	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		fillLotto(lotto);
		dispLotto(lotto);
		
		
	} // main

	private static void dispLotto(HashSet<Integer> lotto) {
		Iterator <Integer> ir = lotto.iterator();
		while (ir.hasNext()) {
			Integer num = (Integer) ir.next();
			System.out.printf( "[%02d]", num );	// 값이 안나오면 디버깅해서 값 찾기
		}
		System.out.println();
	}

	private static void fillLotto(HashSet<Integer> lotto) {
		int n;
		Random rnd = new Random();
		
		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while
		
	}

} // class
