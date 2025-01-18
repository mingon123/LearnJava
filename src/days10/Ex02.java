package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 8. - 오전 11:17:19
 * @subject
 * @content 

	1. 한 반에 10명인 학생의 성적 관리
	 ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
	 1. 이름, 국,영,수 입력
	 2. 총,평, 등 계산 처리
	 3. 모든 학생 정보를 출력..
	조건) 등수 처리하는 메서드를 만드세요. 
	조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
	조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.
	
*/
public class Ex02 {

	public static void main(String[] args) throws IOException {
		final int STDENT_NUMBER = 10;
		
		String [] names = new String[STDENT_NUMBER];
		int [] kors = new int[STDENT_NUMBER];
		int [] engs = new int[STDENT_NUMBER];
		int [] mats = new int[STDENT_NUMBER];
		int [] tots = new int[STDENT_NUMBER];
		double [] avgs = new double[STDENT_NUMBER];
		int [] ranks = new int[STDENT_NUMBER];
		
		int cnt = 0; // 입력받은 학생의 수
		char con = 'y';
		
		// 입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		Scanner scanner = new Scanner(System.in);
		
		do {
			// 배열의 크기 증가 코딩
			if(cnt == names.length) { // 위치가 아래면 cnt+1이 되어야함.
	            kors = Arrays.copyOf(kors, kors.length+3);
	            engs = Arrays.copyOf(engs, engs.length+3);
	            mats = Arrays.copyOf(mats, mats.length+3);
	            tots = Arrays.copyOf(tots, tots.length+3);
	            avgs = Arrays.copyOf(avgs, avgs.length+3);
	            ranks = Arrays.copyOf(ranks, ranks.length+3);
	            names = Arrays.copyOf(names, names.length+3);
	         }    
			
			// 입력 및 초기화
			System.out.print("> 이름 국어 영어 수학 정보 입력 ? ");
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
						
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1; 
			
			// 각각의 배열에 어디에 채워넣을까?
			// cnt가 0부터 1씩 증가하고 index도 0부터 1씩 채우기 때문에 [cnt]를 한다.
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			
			cnt++;
			// 입력 계속 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );
				
		
		// 1. 등수 처리
		processingRanks(tots, ranks, cnt);
		
		// 2. 출력
		printStudent(names, kors, engs, mats, tots, avgs, ranks, cnt);
		
	}
	
	public static void printStudent(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,	int[] ranks, int cnt) {
		System.out.printf("> 입력받은 학생수: %d명\n", cnt);
		// 출력...
		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		} // for
	}

	
	public static void processingRanks(int[] tots, int[] ranks, int cnt) {
		for (int i = 0; i < cnt; i++) { // 등수를 매길 학생
			// tots[i] // 등수를 매길 학생
			ranks[i] = 1;
			
			for (int j = 0; j < cnt; j++) { // 비교할 모든 학생 for문
				if (tots[i] < tots[j]) ranks[i]++;
			} // for j
		} // for i
	} // processingRanks

	
	public static String getName() {
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		// char[] -> String 변환
		String name = new String(nameArr);
		return name;
	} // getName

	
	public static int getScore() {
		return (int)(Math.random()*101);
	} // getScore

}
