package days03;

public class Ex06 {

	public static void main(String[] args) {  //String[] = 문자열 여러개를 불러옴
		
		/*
		
		[] 인덱스 연산자 - String에 '[]' 기호
		한 학생의 국어점수를 저장할 변수를 선언하세요.
			int kor ;
		
		1000명 학생의 국어점수를 저장할 변수를 선언하세요.
		
		> 이럴 때 배열을 사용한다. 1000번을 선언할 순 없으니까
		
		[배열]
		1. 참조타입의 한 종류 (data type)
		
		2. 정의: 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것.  //동일한 자료형이 여러개 필요할 때 사용함.
		
		3. 배열 선언 형식
			자료형 [] 배열명; // 자료형[]까지가 주소, 배열명을 변수명이라 해도 틀리지는 않음
		3-2. 배열 생성 형식
			배열명 = new 자료형[배열크기]		//new = Heap(동적)영역에 생성		
			Heap(동적)									Stack
			  0     1      배열크기-1 : 첨자값(index)
			[ 90 ][ 88 ]...[4바이트]					[0x100번지]배열명
			^
			시작주소
			0x100번지
			
		4. 각각 배열의 저장공간 == 배열의 요소
				int [] kors = new int[3];
				
				System.out.println("배열의 크기 == 배열명.length : " + kors.length);
				//배열명[첨자값] 각각의 배열의 요소를 나타냄.    여기서는 kors가 배열명, []는 인덱스 번호
				kors[0] = 90; // 0번째 요소
				kors[1] = 88; // 1번째 요소
				kors[2] = 99;
				
				// kors = null; - 이 코드를 넣으면 배열을 가리키던 참조가 끊어짐. heap영역의 메모리와 기억공간의 연결이 끊어짐. 뒤의 값들은 오류가 남
				// ArrayIndexOutofBoundsException - index번호는 index-1이라 개수가 넘어가면 안됨
				// kors[3] = 87; 
				
				System.out.println( kors[0] );
				System.out.println( kors[1] );
				System.out.println( kors[2] );

		 */
		 
		 
		
		
//		int [] kors = new int[3];
		
//		System.out.println("배열의 크기 == 배열명.length : " + kors.length);
		
		
	}

}
