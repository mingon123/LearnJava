package days02;

public class Ex02 {

	public static void main(String[] args) {
		
		// 연산자 =(대입) +(문자열 연결 연산자-똑같은 거 아님)  ;(세미콜론 - 명령 종결 나타내는 연산자) 
		// 변수(새로운 값을 계속 할당할 수 있는 공간)
		String name = "김민곤";
		
		name = name + "오재문";
		
		// +=(복합대입연산자)
		name += "김대원";
		
		System.out.println(name);

	}

}
