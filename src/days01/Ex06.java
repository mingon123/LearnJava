package days01;

public class Ex06 {

	public static void main(String[] args) {
		
		// [문제] 1. 나이를 저장할 변수를 선언하고
		//  [ 변수 선언 형식 ]
		// 자료형 변수명 [= 초기값];
		//       2. 20 나이를 할당
		//       3. 출력..
		//       3-2. 출력 형식
		//            나이는 20살 입니다.
		
		/*
		String  age = "20";				
		System.out.println(age + 1);
		*/   
		
		int age = 30;				
		System.out.println(age + 1);
		System.out.println("나이는 "+ age +"살 입니다.");
		
		// + 연산자 : 덧셈연산자X, 문자열 연결 연산자.
		System.out.println("문자열" + 10);  // "문자열10"
		
		// + 연산자 : 덧셈연산자
		System.out.println(20 + 10);  // 30
		

	} // main

} // class
