package days17;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오전 11:40:27
 * @subject
 * @content 
 */
public class Ex04 {
	
	public static void main(String[] args) {
		/*
	      [문제 설명]
	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
	    */

		String answer1 = solution1(3); // 수박수
		String answer = solution(3); // 수박수
		// String answer = solution(4);    // 수박수박
		System.out.println(answer1);
		System.out.println(answer);

	} // main

	// String answer = ; XX 변경하는 값은 무조건 StringBuffer or StringBuilder 사용!!
	// 이게 가장 좋음
	public static String solution(int n) {
		StringBuffer answer = new StringBuffer();
		
		// 13/2 = 몫   "수박"
		// 수박수박수박수박수박수박수
		for (int i = 1; i <= n/2; i++) {
			answer.append("수박");
		} // for i
		if(n%2==1) answer.append("수");
		
		return answer.toString();
	}



	public static String solution1(int n) {
		// Strig answer = ;
		StringBuffer answer = new StringBuffer();
		
		for (int i = 1; i <= n; i++) {
			// i 홀수 :  "수"
			// i 짝수 :  "박"

			/*
			if (i%2 == 1) {
				answer.append("수");
			} else {
				answer.append("박");
			}
			*/
			answer.append( i % 2 == 1 ? "수" : "박" );
		}
		return answer.toString();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	/* 내가 푼 문제
	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 값입력 ? ");
		n = scanner.nextInt();

		solution(n);
		
		System.out.println(solution(n));
		
	} // main

	private static StringBuffer solution(int n) {
		StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
		return sb;
	}
	*/

