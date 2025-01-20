package days18;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 2:23:37
 * @subject
 * @content 
 */
public class Ex08_03 {

	public static void main(String[] args) {

		String source = "이름:홍길동, 나이:20살, 성별:여자";
		
		String name = null;
		int age = 0;
		boolean gender = false;
		
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object [] objArr = mf.parse(source); // 자료형이 다 다르니까 최상위 클래스인 Object로 받음
//			for ( Object v: objArr) {
//				System.out.println( v );
//			} // foreach
			
			name = (String) objArr[0];
			age = Integer.parseInt((String) objArr[1].toString().replace("살", ""));
			gender = Boolean.parseBoolean((String) objArr[2]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println(" end ");	
	} // main

} // class
