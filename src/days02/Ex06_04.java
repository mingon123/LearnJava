package days02;

/*
자바의 자료형(Data Type)


*/

public class Ex06_04 {

	public static void main(String[] args) {
		// 기본형 8가지 - 정수계열( b, s, i, l )
		// 자료형 = 크기 + 형식(유형)
		
		// 나이를 저장할 변수를 선언하고 출력
		// 자료형 변수명[=초기값];
		int age = 20;
		System.out.println(age);
		System.out.printf("나이 = %d살", age);
		
		// byte  = 1바이트 = 8비트  = 2^8=256가지 = -128~127 정수
		// short = 2바이트 = 16비트 = 2^16=65536가지 = -32768~32767 정수
		// int	 = 4바이트 = 32비트 = 2^32=42억가지 = -21억~21억 정수
		// long	 = 8바이트 = 64비트 = 1800경가지 = -900경~900경 정수
		
		byte age1 = 20;
		//첫주는 나이 최고령이 120살이니까 용량을 아끼기 위해 byte로 배움
		System.out.printf("%d \n", age1);
	
		//[문제] 국어 점수 저장할 변수 선언
		// 0~100 정수 byte
		byte score_kr;
		
	
	
	}

}
