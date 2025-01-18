package days15;

/**
 * @author kenik
 * @date 2025. 1. 15. - 오후 4:24:34
 * @subject
 * @content 

		java.lang.Object 클래스
		 ㄴ 멤버(필드, 메서드) 살펴보자.


복사 : 데이터(값)를 복사하는 것 
복제 : 새로운 것을 만들어서 자기자신을 가리키도록 하는 것(주소값을 변경)

Object는 최상위 클래스이기 때문에 확인해볼 필요가 있다.
오버라이딩해서 사용했을 수도 있기 때문에 모두 다 똑같이 사용하지 않을 수는 있다.
 */
public class Ex09 {

	public static void main(String[] args) {
		
		/*
		// 1. Object.hashCode() - 객체 자신의 해시코드를 반환하는 메서드			// 해시코드 : 객체마다 고유한 코드값이라고 지금은 생각
		Value v1 = new Value(10);
		int hashCode = v1.hashCode();	// 반환형이 int여서 int hashCode로 선언
		System.out.println( hashCode );	// 985922955

		Value v2 =new Value(10);
		hashCode = v2.hashCode();
		System.out.println( hashCode );	// 1435804085	
		*/
		
		/*
		// 2. Object.getClass() - 객체의 클래스 정보를 담고 있는 [C]lass 인스턴스를 반환하는 메서드		
		Value v1 =new Value(10);

		// <? extends Value> 제네릭(generic)을 배우면 알 수 있다.
//		Class <? extends Value> cls = v1.getClass;
		Class cls = v1.getClass();
		//		풀네임(fullName) = 패키지명.클래스명		을 반환
		String fullName = cls.getName();
		System.out.println( fullName );	// 결과: days15.Value
		
//		cls.getClass();		// getClass를 통해 클래스의 정보를 모두 얻어올 수 있다.
		*/
		
		/*
		// 3. Object.toString() - 객체 자신의 정보를 문자열로 반환하는 메서드
		Value v1 =new Value(10);
		// "days15.Value@3ac3fd8b"	
		// fullName@hashCode의16진수		로 출력. 오버라이딩을 안했다면.	
		System.out.println( v1.toString() );
		System.out.println( v1 ); // toString() 생략 , 같은 결과가 나옴.
		*/
		
	} // main

} // class


class Value extends Object{
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}

class Point { // extends Object{ -> 안붙여도 컴파일러가 자동으로 붙여서 컴파일함
	int x; 
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}