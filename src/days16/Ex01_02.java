package days16;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오전 9:33:19
 * @subject
 * @content 

days15.8-3에서 마지막 end 없애는 작업
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days15\\Ex01.java";
		int one;
		int lineNumber = 1;
		// [][][][][][][][13][10]
		// [13][10]
		// [][][][13][10]
		
		try(FileReader reader = new FileReader(fileName); ) {
			System.out.printf("%d : ", lineNumber++);
			while ( (one = reader.read()) != -1 ) {
				System.out.print((char)one);
				if(one == 10 && reader.ready() ) {	// [1] reader.ready() : 마지막문자있으면 true, 없으면 false 돌리는 메서드
					System.out.printf("%d : ", lineNumber++);
				}
			} // while		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		// [2] lineNumber 자릿수를 모를 때
		// int lineNumber1 = 123456;
		// int -> String 변환 방법 3가지
		// (lineNumber1+"").length();	 
		// new String(lineNumber1);
		// String.valueOf(lineNumber1);
		// "\b".repeat(5)

		// [3]
		int lineNumber2 = 1234561;      
		int numberOfDigits = 1;      // 숫자의 자릿수
		while((lineNumber2/=10) !=0)    numberOfDigits++;
		System.out.printf("%d의 자릿수\n", numberOfDigits);


		System.out.println(" END ");

	} // main

} // class
