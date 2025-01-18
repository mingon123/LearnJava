package days07;

import java.util.Arrays;
import java.util.Random;

// 로직을 먼저 세우고 코딩, 막히면 멈추고 생각하다가 코드보고 다시하고 해야함

public class Ex05_02 {

	public static void main(String[] args) {

		// 기억할 것들 123
		int [] lotto = new int[6];
		boolean isDuplicated = false;
		
		Random rnd = new Random();
		
		// 1. 배열크기
//		System.out.println(lotto.length);
		// 2. 윗첨자값(upperbound) = lotto.length - 1 (가장 큰 index값)
		// 3. 배열은 초기화하지 않아도 자료형의 기본값으로 초기화 되어져 있다.
		System.out.println(Arrays.toString(lotto) );
		
		int index = 0;
		int n = rnd.nextInt(45)+1;
		lotto[index] = n;  //첫번째 방에 값 넣음
		System.out.println(Arrays.toString(lotto));
		index++; // 1번째
		
		
		while (index<6) {	// index 0 채우고 1번은 0번과 비교 후 채워넣고 index 5번까지 반복
			do {
				isDuplicated = false;			// 다시 초기화
				n = rnd.nextInt(45)+1;
				System.out.print(n);
				for (int i = 0; i < index; i++) { // index 0번째방부터 내꺼 앞번째 까지 비교
					if ( lotto[i] == n) {
						System.out.print("중복됨.");
						isDuplicated = true;
						break;
					}
				}
				System.out.println();
			} while (isDuplicated);
			lotto[index] = n;
			index++;

			System.out.println(Arrays.toString(lotto));			
		} // while

		//System.out.println( Arrays.toString(lotto) );
		
	} // main

} // class
