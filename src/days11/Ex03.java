package days11;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 12:10:00
 * @subject
 * @content 
 */
// Illegal modifier(접+기) for the class Ex03; 
// only public, abstract & final are permitted  -> private로 바꿨을 때 생기는 오류
public class Ex03 {

	// 중첩클래스	왜 ?
	// private class Sample{
	// }
	
	public static void main(String[] args) {
	
		/*
		[ 클래스 선언 시 앞에 붙는 기타제어자 설명 ]
		  1) abstract	활성화 - 추상클래스로 선언
		  2) final		활성화 
		  		필드 앞 - 상수
		  		메서드 앞 
		  		클래스 앞 - 자식을 가질 수 없는 최종(마지막) 클래스로 선언
		  					상속 X
		  3) static		비활성화 : 중첩클래스를 선언할 때 사용 가능
		  					정적(static) 클래스
		  	 static 키워드에 대한 설명
		  
		[ 1. 클래스 선언 시 앞에 붙는 접근 지정자 설명 ]
			독립적인 클래스를 선언할 때는 public, default 만 사용 가능.
			Person 클래스 선언하여 설명
		  1) public		활성화 : 패키지 내/외부에서 사용( 상속과 참조 ) 가능
		  3) default	활성화 : 패키지 내에서만 사용( 상속과 참조 ) 가능
			 (==package)
			 
			 		중첩 클래스를 선언할 때 사용할 수 있다.
			 		( 내부 클래스, 4가지 종류 )
			 		왜 ? 클래스 안에 클래스 선언하는가?
		  2) protected	비활성화 : 디폴트(패키지 내에서만 상속, 참조 가능) 
		  						+ 패키지 외부에서는 상속만 가능
		  4) private	비활성화 : 같은 파일 내에서만 상속, 참조 가능
		  
			사용 범위 : public > protected > public > private
		
		[ 2. 필드, 메서드 선언 시 앞에 붙는 접근 지정자 설명 ]
		  1) private
		  2) default
		  3) protected
		  4) public
		  
		
		
		 */
		
		// 같은 패키지 안에서 ... public으로 선언된 클래스를 사용..
		// 같은 패키지 안에서 ... default(package)로 선언된 클래스를 사용..
		// days11.Person
		// days11.Ex03
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.name = "김민곤";
		p1.run();
		
	} // main

} // class
