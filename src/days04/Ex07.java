package days04;

/*

if, if~else, switch, for

조건반복문 : while, do~while

 */

public class Ex07 {

	public static void main(String[] args) {
	
		// for문은 반복하는 횟수가 정해져 있는 경우 사용하는 게 좋음
		// while문은 반복하는 횟수는 모르고 '조건에 맞다면' 사용하는 게 좋음
		// while문은 조건이 안 맞다면 한번도 실행되지 않을 수 있음 - 최소 한번은 실행하고 조건을 물어보는 반복문 : do~while문을 사용

		/*
		while (condition) {
			
		}
		
		do {
			
		} while (condition);
		*/
		
//		int i = 1, sum = 0;
//		while (i <= 10) {
//			
//			System.out.printf("%d+", i); // i대신 i++를 쓸 수도 있음
//			
//			sum += i; // i++ 이후에 sum값을 추가하면 2~11까지 합치게 됨. 계산 잘못된
//			i++;
//			//++i;
//			
//		} //while
//		System.out.printf("=%d", sum);
		
		

		// 1+2+3..+9+10=55
		
		int i = 1, sum = 0;
		while (i <= 10) {
			
			if ( i < 10) {
				System.out.printf("%d+", i); // i대신 i++를 쓸 수도 있음
				sum += i; // i++ 이후에 sum값을 추가하면 2~11까지 합치게 됨. 계산 잘못된
				i++;
			} else {
				System.out.printf("%d=", i);
				sum += i;
				i++;
			}
		} //while
		System.out.printf("%d", sum);
		
		
	}

}
