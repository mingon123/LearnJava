package days12;

// 디버그에서 f5를 누르면 그 안으로 들어감, f6은 다음으로 이동하는것


/**
 * @author kenik
 * @date 2025. 1. 10. - 오후 2:01:39
 * @subject
 * @content 

			[ this 키워드 ]
			
 */
public class Ex06 {

	public static void main(String[] args) {
		/*

		[ this ] 키워드 설명
		1. 정의
			ㄴ 인스턴스가 생성되면 자기자신의 주소를 갖는 참조변수
		2. 3가지 용도
		  1) 멤버를 가리킬 때의 this 용도
		  	 멤버 == 클래스(객체)의 구성 요소
			 멤버변수(필드)
			 멤버함수(메서드)
		  2) 생성자에서 또 다른 생성자를 호출할 때의 this
		  	 생성자 호출 시기 : 객체 생성될 때... + 자동으로          생성자 ? 10개 - Ex04파일
		  	 	  역할 : 필드 초기화
		  	 왜 ? A생성자 -> B생성자 호출
		  3) 단독(홀로)으로 사용될 때의 this
		  	  ㄴ 매개변수
		  	  ㄴ 리턴값
		 */
		
		/*
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println( p1.getName() );
		*/
		
        MyPoint p1 = new MyPoint(10, 20); // this 용도 1번
        p1.test();
        
		MyPoint p2 = new MyPoint(100); // this 용도 2번
		p2.test();
		
		// 메서드 체인
//		p2.offsetPoint(5).dispMyPoint(); // this 용도 3번 - offsetPoint반환값이 p2이므로 p2.dispMyPoint()가 된다.

		p2
		  .offsetPoint(5)			// 이렇게 많이 표현
		  .dispMyPoint();
		
		/*
		p2
		  .offsetPoint(new MyPoint(1,1))
		  .dispMypoint();  
		  // this를 리턴하지 않기 때문에 .dispMypoint()가 되어 오류가 생김
		*/
		
		
	} // main

} // class
