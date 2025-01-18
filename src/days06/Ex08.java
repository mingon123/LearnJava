package days06;

/*
	조건보고 이거 코딩할 수 있어야함
 */


import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) throws IOException {

		// 가위(1)/바위(2)/보(3)
		int com, user = 0;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		
		
		do {
			com = (int)(Math.random()*3)+1;
//			com = 0.0 <= double Math.random()*3 < 1.0;

			int count = 0;
			boolean flag = false; //이걸로 처음입력한건지 여러번입력한건지 체크
			do {
				if(flag) {
					System.out.printf("\t\t [%d번 실패] 가위바위보 선택 잘못!!! \n> 다시", count);
					if(count==3) {
						System.out.println(" 못함!! 게임종료");
						return;
					}
				}

				System.out.print("> user 가위(1)/바위(2)/보(3) 선택? ");	
				user = scanner.nextInt();
				flag = true;
				count++;
			} while ( !(user==1 || user==2 || user==3) );
			
				
				
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
			
			// y를 입력하면 다시하도록
			System.out.print("\n>게임 계속합니까? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while ( con == 'y' || con == 'Y');

	}

}
