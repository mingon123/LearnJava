package days19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/**2025. 1. 21. - 오후 4:49:20
 * 
 * 
		게임 횟수를 입력받아서 로또 번호 출력.
		days10.Ex06_03.java 이용해서..
		List
		Set
 */
public class Ex12_03 {

	public static void main(String[] args) {
		// 컬렉션 클래스 어떤 걸 사용해야 제일 효율적일지 생각해서 list, set 사용해서 처리..
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		// <E> == Element == HashSet<Integer>
		ArrayList<HashSet<Integer>> lottos = new ArrayList<HashSet<Integer>>(gameNumber);
		
		for (int i = 0; i < gameNumber; i++) {
			// Set : [중복허용X], 순서유지X - 중복허용X때문에 사용			
//			HashSet<Integer> lotto = new HashSet<Integer>();
			LinkedHashSet<Integer> lotto = new LinkedHashSet<Integer>();	// 순서유지O, 중복허용X
			fillLotto(lotto);
			lottos.add(lotto);	// 게임 횟수만큼 lotto번호를 증가
		}

		// 출력
//		dispLotto(lotto);
		for (int i = 0; i < gameNumber; i++) {
			System.out.printf("%d 게임 : ", i+1);
			dispLotto( lottos.get(i));
		}
		
		
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
	
	
}// class