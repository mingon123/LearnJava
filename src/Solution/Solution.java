package Solution;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		StringBuffer sb = new StringBuffer(a);
		
		sb = null;
		
		for (int i = 0; i < sb.length(); i++) {
			char ch = (char) sb.charAt(i);
			System.out.println(ch);

			if (ch == Character.toLowerCase(ch)) {
				sb.append(a.toUpperCase());
			} else if (ch == Character.toUpperCase(ch)) {
				sb.append(ch);
			} else {
				sb = null;
			}
			
		}
		
		

		System.out.println(a);

		//aacABCcc

	}
}
