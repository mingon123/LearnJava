package days02;

//지역변수
public class Ex03 {

	String email; //지역변수는 아님. 자바에서는 전역변수를 사용하지 않음
	
	{
		int age = 20;
	}
	
	public static void main(String[] args) {
		//지역변수(Local Variable)
		// 1. 정의: 메서드, 생성자 또는 블록 내에서 선언된 변수
		String name; //이것도 지역변수
		
		name = "김민곤";
		
		{
			char grade = 'A';
			name = "이찬희";
			
			grade = 'B'; //오류가 없지만 밖에다가 grade 선언하면 오류생김
		}
		
		//grade cannot be resolved to a variable (지역변수 안에서 선언, 밖에서 호출해서 오류)
//		grade = 'C';
		
		name = "박정현";
		//전부 main 메서드 안에서 사용했기 때문에 다 사용할 수 있다.

	} //main

} //class
