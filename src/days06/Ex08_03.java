package days06;

import java.util.Scanner;

// 문자입력했을 때 오류안뜨게 하는 코드

public class Ex08_03 {

	public static void main(String[] args) {

		// 정규 표현식( [reg]ular [exp]ression )
	      //                  regex
	      
	      // 입력값에 대한 유효성 검사... ( 암기 )
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 주민등록번호 입력(ex)000000-0000000) ? ");      
	      // boolean String.matches(String regex)  일치하니?
	      // String regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";      
	      // String regex = "[0-9]{6}-[0-9]{7}";
	      String regex = "\\d{6}-\\d{7}";
	      //             \\D (숫자 입력하면 입력잘못한 걸로 뜸 \\d와 반대)
	      // X? 0 1
	      // X+ 1 여러번
	      // X* 0 여러번
	      // X{n} n번
	      // X{n,m} n~m 번
	      // X{n,}  n~ 번 이상
	      String rrn = scanner.next();      
	       
	      if( rrn.matches(regex) ) {
	         System.out.println("OK");
	      }else{
	         System.out.println("입력 잘못!!!");
	      }
		
	      
//	      [문제] 우편번호 000-000	00000	
//	      String regex = "\\d{3}-\\d{3} | \\d{5}";
//	      [문제] 비밀번호 8~15 특수문자 1개, 숫자 1개, 대,소1개 ( 검색 )
	      //String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[A-Za-z\\d!@#$%^&*(),.?\":{}|<>]{8,15}$";

		
	}

}
