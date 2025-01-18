package days10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오전 9:09:32
 * @subject
 * @content 
 
 		다른 학생이 숙제로 푼 문제(비전공자)
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 로또 게임
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		int [][] lotto = new int[gameNumber][6];

		fillLotto(lotto, gameNumber);
		//	      fillLotto(lotto); //이렇게 해도 상관없음 
		dispLotto(lotto, gameNumber);  
	} // main

	private static void fillLotto(int[][] lotto, int gameNumber) {
		// lotto.length == 행 갯수 == gameNumber

		int index = 0, n;
		Random rnd = new Random();
		for (int i = 0; i < gameNumber; i++) {
			index = 0;
			while (index < 6) { 
				n = rnd.nextInt(45)+1;
				// 중복되면 true 반환
				if( !isDuplicatedLotto(lotto, n, index, i)) { // i = 행 값
					lotto[i][index++] = n; 
				} // if         
			} // while
		} // for
	} // fillLotto


	private static boolean isDuplicatedLotto(int[][] lotto, int n, int index, int row) { // row는 행
		for (int i = 0; i < index; i++) {
			if( lotto[row][i] == n ) return true;
		}
		return false;		
	} // isDuplicatedLotto


	private static void dispLotto(int[][] lotto, int gameNumber) {
		for (int i = 0; i < gameNumber; i++) { // 행(게임) 개수
			System.out.printf("[%d게임] ", i+1);
			for (int j = 0; j < lotto[i].length ; j++) { // 열(로또번호) 개수
				System.out.printf("[%02d]", lotto[i][j]);      
			} // for j
			System.out.println();      
		} // for i      
	} // dispLotto

}
