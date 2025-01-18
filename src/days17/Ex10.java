package days17;

import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 3:18:56
 * @subject
 * @content


파일에서 알파벳 대소문자를 구분하지 않고 A, B.., Z 알파벳 개수 파악 
 */
public class Ex10 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days16\\Ex05.java";

		// 알파벳 대소문자를 구분하지 않고 A, B.., Z 알파벳 개수 파악
		// 갯수를 파악해서 #으로 막대그래프를 그리기.
		// A(20) : ####################
		// B(11) : ###########
		// :
		// z(3)	 : ###

		// c[0] = 'A' 갯수	65 -> 0(index) : 'A' -'A' or 65 ... 0
		// c[25] = 'Z' 갯수	66 -> 1			 'B' -'A' or 65 ... 1
		int [] counts = new int [26];	// 알파벳 개수
		char one = '\u0000';
		int code = -1;

		try (FileReader reader = new FileReader(fileName)) { 
			while ( ( code = reader.read() ) != -1 ) {
				one = Character.toUpperCase( (char) code );	// 문자를 하나입력 - 알파벳이 아닐경우 그 문자 그대로 반환, 소문자일 경우 대문자로 반환 : 무조건 대문자
				if( Character.isUpperCase(one) ) { // 대문자이니 아니니? 물어보는 함수
					counts[one - 'A']++;	// 문자-> 숫자
				} // if
			} // while
		} catch (Exception e) {
			System.out.println(e);
		}


		// 막대그래프 그리기
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%c(%d) \t %s\n", counts[i]+'A', counts[i], "#".repeat(counts[i]));
		}


		System.out.println(" end ");

	} // main

} // class
