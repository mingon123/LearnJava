package days09;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		// 16진법 : 0 1 2 3 4 5 6 7 8 9 10(a) ~ 15(f)
		int n = 123; //7B로 나타내자
		int 몫, 나머지; // share, rest
		
//		문자가 들어가기 때문에 int 배열을 사용하면 안된다, String ""로 해도 됨
		
		char [] hex = new char[4];
		Arrays.fill(hex, '0');

		int index = hex.length-1;

		while (n != 0) {
			몫 = n/16;
			나머지 = n%16;
			// 나머지 10(A = 65), 11(B)...15(F) 저장
			char value = (char)( 나머지 += 나머지 >= 10 ? 55 : 48); // A(10)는 65이기 때문에 65-10=55 
			hex[index--] = value;
			
			/* - 위의 한줄로 바꿈
			if (나머지 >= 10) {
				switch (나머지) {
				case 10:
					hex[index--] = 'A';
					break;
				case 11:
					hex[index--] = 'B';
					break;
				case 12:
					hex[index--] = 'C';
					break;
				case 13:
					hex[index--] = 'D';
					break;
				case 14:
					hex[index--] = 'E';
					break;
				case 15:
					hex[index--] = 'F';
					break;
				} // switch
			} else {
				hex[index--] = (char) (나머지+'0'); // '0'을 더하지 않으면 숫자 7이기 때문에 값이 안들어감
			} // else
			*/
			
			n = 몫;
		} // while

		// '0' = 48
		// '7' - 55가 되어야 함
		System.out.println("0x"+Arrays.toString(hex));

	}

}
