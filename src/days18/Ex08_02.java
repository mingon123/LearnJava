package days18;

/**
 * @author kenik
 * @date 2025. 1. 20. - 오후 2:23:37
 * @subject
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {

		String source = "이름:홍길동, 나이:20살, 성별:여자";
		
		String name;
		int age;
		
		boolean gender;
		
//		name = source.substring(3, 6);
//		age = Integer.parseInt(source.substring(11, 13) );	// 매번 자리수 어려움
		
		String [] infoArr = source.split(",");
		name = infoArr[0].split(":")[1];
		age = Integer.parseInt( infoArr[1].split(":")[1].replace("살", "") ) ;
		gender = infoArr[2].split(":")[1].equals("여자") ? false : true ;
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println(" end ");	
	} // main

} // class
