package days06;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
	
//		3. 문자열 메시지를 입력받아서 입력받은 문자열의 한 문자씩 출력하세요. 

		String message;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> message input ? ");
		message = scanner.nextLine();
		//message = scanner.next(); <- hello 까지만 읽어옴, world~를 못읽어옴
		
		System.out.println("message : " + message); // 메세지(입력값) 일단 확인
		
		/*
		System.out.printf("'%c' \n", message.charAt(0));
		System.out.printf("'%c' \n", message.charAt(1));
		System.out.printf("'%c' \n", message.charAt(2));
		System.out.printf("'%c' \n", message.charAt(message.length()-1));
		*/
		
//		[방법1] - for문
//		for (int i = 0; i < message.length(); i++) {
//			System.out.printf("'%c' \n", message.charAt(i));
//		}
		
		
//		[방법2] - toCharArray() 사용 후 foreach문으로 읽어오기
//		char [] messageCharArray = message.toCharArray();
//		
//		for (char c : messageCharArray) {
//			System.out.printf("'%c' \n", c);
//		}
				
	}

}
