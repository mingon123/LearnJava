package days07;

import java.util.Random;

/* 필수 암기

문자열을 내가 원하는 형태의 문자열로 바꿀때 사용하는 메서드
	1. String.format
	2. String.join

*/

public class Ex06 {

	public static void main(String[] args) {

		String card = "7655-8988-9234-5677";
		
		Random rnd = new Random();
		int index = rnd.nextInt(4); // 0<= int <4
		System.out.println(index);
		
		String [] cardArr = card.split("-");
		
		cardArr[index] = "****";
		
		for (int i = 0; i < cardArr.length; i++) {
			System.out.printf("cardArr[%d]=%s\n", i, cardArr[i]);
		}
		
		// 1. String.format()
		card = String.format("%s-%s-%s-%s", cardArr[0], cardArr[1], cardArr[2], cardArr[3]); 
		
		// 2. String.join()
		String.join("-", cardArr); // 여러개일수록 join을 사용하는게 유리
		
		System.out.println(card);
				
				
		// 결제할 때 마다 랜덤하게 특정 위치 4자리 숫자가 ****로 출력(표시)
		/*
		System.out.println("****-8988-9234-5677")
		System.out.println("7655-****-9234-5677")
		System.out.println("7655-8988-****-5677")
		System.out.println("7655-8988-9234-****")
		 */

	}

}
