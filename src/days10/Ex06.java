package days10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 5:17:10
 * @subject
 * @content 
 
 		로또게임
 		days7.Ex05_03.java
 		
 		> 게임 횟수 입력 ? 3
	      [1 게임]      [42][36][21][38][6][26]
	      [2 게임]      [11][7][19][2][25][15]
	      [3 게임]      [36][33][44][42][18][10]
	      
	      
	      내가 풀어야함. 숙제 - 아직 안함
 */
public class Ex06 {

	public static void main(String[] args) {
		// 로또 게임.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		int [][] lottos = new int[gameNumber][6];
		
		fillLotto(lottos);
		dispLotto(lottos);
	} // main

	
	private static void dispLotto(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) { 
			System.out.printf("[%d]", lottos[i]);
		}		
		System.out.println();
	}

	
	private static void fillLotto(int[][] lottos) {
		int index = 0, n;
		Random rnd = new Random();
		
		while (index < 6) {
			n = rnd.nextInt(45)+1;
			
			for (int i = 0; i < lottos.length; i++) {
				// 중복되면 true 반환
				if ( !isDuplicateLotto(lottos, n, index) ) { // 중복체크 후 중복X
					lottos[i][index++] = n;
					// index++;						
				}
			}

		} // while		
	}

	
	private static boolean isDuplicateLotto(int[][] lottos, int n, int index) {
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < index; j++) {
				if ( lottos[i][j] == n ) return true;
			}
		}

		return false;
	} // isDuplicateLotto

} // class
