package days06;

import java.util.Scanner;

// 문자입력했을 때 오류안뜨게 하는 코드

public class Ex08_02 {

	public static void main(String[] args) {

		// 입력값에 대한 유효성 검사... (암기)
		Scanner scanner = new Scanner(System.in);
		System.out.printf("> user 가위(1), 바위(2), 보(3) 선택 ? ");
		
		// String.matches(String regex) 일치하니? 물어보고 boolean형으로 반환해서 알려줌
		String regex = "[1-3]"; // 이 안의 값에 해당하면 전부 가져옴 [123]도 가능
		String strUser = scanner.next();
		int user;
		if ( strUser.matches(regex) ) {
			user = Integer.parseInt(strUser);
			System.out.println(user);
		} else {
			System.out.println("입력 잘못 !!!");
		}
		
		
		
	}

}
