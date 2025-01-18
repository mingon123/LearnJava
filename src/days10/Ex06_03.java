package days10;

import java.util.Scanner;

// days07 패키지 안의 모든 클래스를 다 사용
import days07.Ex05_03;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오전 9:34:39
 * @subject		다차원 배열은 배열의 배열이다. (*****) - 그림을 이해하고 있어야 함.
 * @content 

		다른 학생이 푼 문제(전공자)
		
		
		단축키 : 함수에 누르고 f3 or ctrl+첫번째꺼 클릭하면 해당 파일 위치로 바로 이동
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// 로또게임
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		int [][] lottos = new int[gameNumber][6];

		fillLottos(lottos);
		dispLottos(lottos);


		} // main

	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임] ",i+1);
			Ex05_03.dispLotto(lottos[i]);
		}
	}

	private static void fillLottos(int[][] lottos) {
		for(int i = 0; i < lottos.length; i++) {
			Ex05_03.fillLotto(lottos[i]);
		}
	}


} // class
