package days02;

//

public class Ex06_03 {

	public static void main(String[] args) {
				
		String name = "kenik";
		int age = 20;
		
		//							[전체자리수]
		// %[argument_index$][flags][width][.precision]conversion
		// conversion
		// %	s
		System.out.printf("[%s] \n", name);
		System.out.printf("[%10s] \n", name);
		System.out.printf("[%-10s] \n", name);
		System.out.println();
		
		System.out.printf("[%d] \n", age);
		System.out.printf("[%10d] \n", age);
		System.out.printf("[%-10d] \n", age);
		System.out.println();
		
		System.out.printf("[%04d] \n", age); //숫자채우기 - flag 0001, 0002처럼 띄울 때 효과적 - (암기)

		age = 10;
		System.out.printf("[%d] \n", age); //10진수 - 10
		System.out.printf("[%#o] \n", age); //8진수 - 12  #o 붙이면 012로 표시
		System.out.printf("[%#x] \n", age); //16진수 - a  #x 붙이면 0xa으로 표시
		
		//괄호로 묶음
		System.out.printf("%(d \n", -100);
		System.out.printf("%(d \n", -100);
		
		//문자열.reapeat(횟수) - 횟수만큼 반복하는 명령어
		System.out.println("-".repeat(50));
		
		//금액을 3자리마다 콤마 찍어서 출력. 
		int money = 7635200;
		System.out.printf("%,d \n", money);
		
		// sysr - 이렇게 단축키로도 가능
		System.out.println("-".repeat(50));
		
		// 평균 출력 - 소수점 2자리까지 출력
		double avg = 78.99845;
		System.out.printf("avg=%e \n", avg);
		System.out.printf("avg=%f \n", avg);
		System.out.printf("avg=[%+010.2f] \n", avg); // 콤마도 한자리를 차지함, +는 양수를 뜻함, 10이 작으면 오류가 아니라 무시된다.
		
		
		
		
	}

}
