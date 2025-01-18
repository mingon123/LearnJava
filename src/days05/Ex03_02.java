package days05;

import java.util.Iterator;

public class Ex03_02 {

	public static void main(String[] args) {
		

		// ASCII 코드 256가지
		// [문제] 한 라인에 10개의 ASCII문자를 출력
		// 26라인이 나와야함. 마지막 라인은 6개만 나와야함
		
		int line = 1;
		for (int i = 0; i < 256; i++) {
			if (i%10==0) System.out.printf("%d : ",line++);
			System.out.printf("[%c]", (char)i);
			if (i%10==9) System.out.println();
			
		} //for
		
//		0 1 2 3 4 5 6 7 8 9 + 개행
//		10 1 2 3 4 5 6 7 8 19 + 개행
//		20 1 2 3 4 5 6 7 8 29 + 개행
//		-> 9로 끝나면 9번째 줄까지 출력하고 개행하면 되기 때문에 i%10 == 9일 때 개행하면 됨

//		9->tab, 10->'/n', 13->'/r' 이라 자동 줄바꿈
		
		
	}

}
