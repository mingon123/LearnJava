package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2025. 1. 17. - 오후 4:24:12
 * @subject
 * @content

			단축키 : ctrl+shift+f : 자동 줄 정렬
알아서 정리

 */
public class Ex11 {

	public static void main(String[] args) {

		/*
		 * 1. 정규표현식( Regular Expression == regex(p) )
		 */

		String[] data = { "ab", "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc", "fx" };

		// [ 정규표현식을 설명하세요 ]
		String regex = "c[a-z]*";		// c문자로 시작, 소문자가 0~여러개 패턴 
//		String regex = "c[a-z]";		// c문자로 시작, 소문자 1개 와야함.
//		String regex = "c[a-zA-Z]";		// c문자 + 알파벳 1개
//		String regex = "c[a-zA-Z0-9]";	// c문자 + 알파벳 or 숫자 1개
//		String regex = "c\\w";			// c문자 + 알파벳+숫자 1개
//		String regex = ".*";			// 모든 문자
//		String regex = "c.";			// c문자 + 모든 문자 1개
//		String regex = "c\\.";			// c문자 + .
//		String regex = "c[0-9]";		// c문자 + 한자리 숫자
//		String regex = "c.*t";			// c문자 + t로 끝나는 문자
//		String regex = "[b|c]";			// b or c
//		String regex = "[bc]";			// bc
//		String regex = "[b-c].*";		// b~c로 시작하는 모든 문자
//		String regex = "[^bc].*";		// bc로 시작하지 않는 모든 문자
//
//		String regex = ".*a.*";			// a가 들어가 있는 모든 문자
//
//		String regex = "[^bcd].*";		// bcd로 시작하지 않는 모든 문자
//
//		String regex = "[a-zA-Z].*";	// 알파벳 전부
//		String regex = "[ae-zA-Z].*";	// a, e~z + 대문자 전부로 시작하는 모든문자
//		String regex = "[a-zA-Z&&[^b-d]].*";	// 알파벳 전부인데 b~d는 제외로 시작하는 모든 문자

		
		// 1. Pattern 객체 생성
		Pattern pattern = Pattern.compile(regex);
		
		// 2. Matcher 객체 생성
		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher(data[i]);	// () 안의 내용과 같은지 확인해야함
			if (matcher.matches()) {
				System.out.println(data[i]);
			}
		}
		
		

		
		

		/*
		 * 정규표현식을 만들어주는 사이트에서 만들어서 수정하는 것이 좋음
		 * 
		 * 메타문자 \d : 숫자, \D : ^숫자 \w : 문자+숫자, \W : ^문자+숫자 \s : 공백문자(스페이스, 탭) \S : ^공백문자
		 * 
		 * 위치 지정자 (Anchors) ^abc : 문자열의 시작 abc$ : 문자열의 끝
		 * 
		 * 그룹화 (abc) : [abc] a|b == [ab] // a or b
		 */
	}

}
