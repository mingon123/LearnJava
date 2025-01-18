package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오후 12:09:19
 * @subject
 * @content 
 * 
 		3반 + 한 반 30명 	이/국/영/수/총/평/등 입력 -> 등수처리 -> 출력
  		2/3차원 배열 사용
 
 */
public class Ex02_03 {

	public static void main(String[] args) throws IOException {
		
		final int STDENT_NUMBER = 30;
		// 반도 바뀔 수 있다면 final 사용해서 하면 좋음
		
		// String [] names = new String[3*STDENT_NUMBER];
		String [][] names = new String[3][STDENT_NUMBER]; // 행 : 반, 열 : 학생번호
		double [][] avgs = new double[3][STDENT_NUMBER];
		//						면:반		행:학생번호		열: 0국 1영 2수 3총 4등 5전교등수
		int [][][] infos = new int[3][STDENT_NUMBER][6];
		
		char con = 'y';
		// cnts[0] 1반학생의 입력받은 학생 수
		// cnts[1] 2반학생의 입력받은 학생 수
		// cnts[2] 3반학생의 입력받은 학생 수		
		int [] cnts = new int[3];
		
		// 입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank, wrank; // rank는 반등수, wrank는 전교등수
		double avg;

		Scanner scanner = new Scanner(System.in);

		int ban; // 1,2,3 입력받은 반 저장할 변수
		
		do {
			// 1. 반 입력 ?
			System.out.print("> 반 입력 ? ");
			ban = scanner.nextInt(); // 1,2,3

			// 2. 학생정보 입력 ?
			System.out.printf("> 2. %d반의 [%d]번 학생 이름,국,영,수 입력하세요 ? ", ban, cnts[ban-1]+1); // index0번부터라 -1하고 표시할때는 1반이 나와야하니까 +1
			
			name = Ex02.getName();
			kor = Ex02.getScore();
			eng = Ex02.getScore();
			mat = Ex02.getScore();
						
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1; // 반등수
			wrank = 1; // 전교등수
			
			// 각각의 배열에 어디에 채워넣을까?
			names[ban-1][cnts[ban-1]] = name;
			infos[ban-1][cnts[ban-1]][0] = kor;
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat;
			infos[ban-1][cnts[ban-1]][3] = tot;
			avgs[ban-1][cnts[ban-1]] = avg;
			infos[ban-1][cnts[ban-1]][4] = rank;
			infos[ban-1][cnts[ban-1]][5] = wrank;
			
			cnts[ban-1]++; // 입력받은 그 반 학생만 증가
			// 입력 계속 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );
		
		
		// [반, 전교등수 처리]
//		3*30으로 안나눴으면 90명으로 계산한 것과 똑같음
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				//infos[i][j][3]; // 총점
				infos[i][j][4] = 1; // 반등수
				infos[i][j][5] = 1; // 전교등수
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						
						if (infos[i][j][3] < infos[i2][j2][3]) {
							infos[i][j][5]++;  // 전교등수 1증가
							if( i == i2) {  // 반까지 같으면
								infos[i][j][4]++;
							} // if
						} // if
					} // for j2
				} // for i2
			} // for j
		} // for i
		
		
		// [전교생 출력]
		//int totalCnt = cnts[0] + cnts[1] + cnts[2];
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
		for (int i = 0; i < cnts.length; i++) { // 3반이기 때문에 cnts.length = 3
			System.out.printf("[%d]반 학생수 : %d명\n", i+1, cnts[i]);

			// 실제 그 반 학생 정보 출력...
			for (int j = 0; j < cnts[i] ; j++) {
				System.out.printf("\t%d.\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
						, j+1, names[i][j], infos[i][j][0], infos[i][j][1], infos[i][j][2], infos[i][j][3], avgs[i][j], infos[i][j][4], infos[i][j][5]);
			} // for j
		} // for i

		
	} // main

} // class
