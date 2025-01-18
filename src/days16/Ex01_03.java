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
public class Ex01_03 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days15\\Ex01.java";
		int one, prev = -1; // prev : 현재 읽어오기 전의 값을 저장
		int lineNumber = 1;

		try(FileReader reader = new FileReader(fileName); ) {
			System.out.printf("%d : ", lineNumber++);
			while ( (one = reader.read()) != -1 ) {
				if( prev == 10) {
					System.out.printf("%d : ", lineNumber++);
				}
				System.out.print((char)one);
				prev = one;
			} // while		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(" END ");
		
		// [2] 자릿수를 모르니까
		// int lineNumber1 = 123456;
		// int -> String 변환 방법 3가지
		// (lineNumber1+"").length();	 
		// new String(lineNumber1);
		// String.valueOf(lineNumber1);
		// "\b".repeat(5)

		// [3]
//		int lineNumber2 = 1234567;      
//		int numberOfDigits = 1;      // 숫자의 자릿수
//		while((lineNumber2/=10) !=0)    numberOfDigits++;
//		System.out.printf("%d의 자릿수\n", numberOfDigits);



	} // main

} // class
