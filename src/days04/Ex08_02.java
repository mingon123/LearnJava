package days04;

import java.util.Scanner;

/*

	컴퓨터 + 사용자가 가위(1)/바위(2)/보(3) 게임을 하도록 함
	1/2/3	키보드 입력
	 2(바위) < 3(보)
	
	사용자가 이겼다.  //라고 출력
	컴퓨터가 이겼다.  //라고 출력
	무승부

 */

public class Ex08_02 {

	public static void main(String[] args) {
		
		// 가위(1)/바위(2)/보(3)
		int com, user;
		Scanner scanner = new Scanner(System.in);
		
		com = (int)(Math.random()*3)+1;
//		com = 0.0 <= double Math.random()*3 < 1.0;

		System.err.print("> user 가위(1)/바위(2)/보(3) 선택? ");
		user = scanner.nextInt();
		
		System.out.printf("> com= %d, user= %d \n", com, user);
		
		// 승자 판단해서 출력..
		switch ( user - com ) {
		case 0:
			System.out.println("무승부");
			break;
		case 1:
			System.out.println("사용자 승리");
			break;
		case -2:
			System.out.println("사용자 승리");
			break;
		case -1:
			System.out.println("컴퓨터 승리");
			break;
		case 2:
			System.out.println("컴퓨터 승리");
			break;
			
		} //switch
		
		
		
	}

}
