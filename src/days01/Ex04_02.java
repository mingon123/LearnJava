package days01;

/**
 * @author kenik
 * @date 2024. 12. 23. - 오후 4:21:47
 * @subject
 * @content 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		// 변수 - 변하는 수 , 값을 변경할 수 있는 기억공간
		// 상수 - 고정된 수 , 값을 변경할 수 없는 기억공간
		
		// [ 변수 선언 형식 ]
		// 자료형 변수명[=초기값];
		String name = "이창익";
		
		// 좌측변수 = 우측항의 값;
		//name = "이창익";
		
		//The local variable name may not have been initialized
		System.out.println( name );
		
		name = "윤형식";
		name = "김대원";
		// Ctrl + Alt + 방향키 
		System.out.println( name );

	} // main

} // class
