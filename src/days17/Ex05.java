package days17;

import java.util.StringTokenizer;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 12:13:50
 * @subject
 * @content 

		StringTokenizer 클래스 	X(잘안씀) -> split() 권장
 */
public class Ex05 {

	public static void main(String[] args) {
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//  잘린 하나하나를 'Token' 이라함
		
		// [권장]
//		String regex = "\\s*,\\s*";
//		team1.split(regex);
		
		StringTokenizer st =new StringTokenizer(team1, ",");	// , 기준으로 자름
		
		System.out.println( st.countTokens() );	// 토큰 갯수
		
//		st.hasMoreTokens(); // 토큰 가지고 있는지 확인 - true/false로 답변
		
//		String name = st.nextToken().trim(); // 토큰 가져감, 해당 토큰 삭제
//		System.out.println( name );
//
//		name = st.nextToken().trim();
//		System.out.println( name );
		
		String name = null;
		while ( st.hasMoreTokens() ) {	// 참일 때 계속 도는거라 == true생략해도됨
			name = st.nextToken().trim();
			System.out.println( name );
		}
	
		System.out.println("end");
	} // main

} // class
