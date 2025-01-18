package days02;

/*
자바의 자료형(Data Type)


*/

public class Ex06_05 {

	public static void main(String[] args) {

		//평균 저장(실수)
//		double avg = 78.99;
		
		//형변환하는 2가지 방법 1)자동형변환 2)강제형변환 - cast연산자 사용해야함
		//Type mismatch: cannot convert from double to float - 마지막에 f를 붙여 해결
		float avg = 87.123f;
		System.out.printf("국어 점수: %.2f점 \n", avg);
		
		// 0	int(4)
		// 0L	long(8)
		// 0F	float(4) == 0.0F
		// 0D 	double(8) == 0.0 (double이 기본형이라 D를 안붙여도 됨) - 0D, 0f는 저렇게 표현해도 실수다!
		
		// 1	정수
		// '1'	문자
		// "1"	문자열 = '1' + '\0'
	
	
	}

}
