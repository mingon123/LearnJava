package days12;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 10. - 오후 12:01:55
 * @subject
 * @content
  		
  		[ private로 선언된 필드를 접근하는 방법 ]
  		Person 클래스 새로 추가.
 		  ㄴ getter, setter 자바에서 만들어서 접근... - 필드를 초기화하고 필드 값을 얻어오는 메서드
 		  ㄴ alt+shift+s 로 get,set 메서드를 만듦
 		  
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// The constructor Person() is undefined
		Person p1 = new Person();
		
		//The field Person.name [is not visible] == 접근지정자 오류
		// p1.name = "홍길동";  // p1이 private라 다른 클래스에서 사용할 수 없다.
		p1.setName("홍길동");

		String name = p1.getName();
		System.out.println( name );
		
		
		// 나이를 키보드로부터 입력... ( 0살 ~ 120살 )
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 나이 입력 ? ");
		int age = scanner.nextInt();
		
		/* 매번 이렇게 처리하기 보다는 예외 처리 함수를 추가하는 게 좋음
		if ( age >=0 && age <= 120 ) {
			p1.age = age;
			System.out.println( age );			
		} //
		*/ 
		
		// 예외 처리 코딩 추가해야함
		p1.setAge(age);
		System.out.println( p1.getAge() );
		
		
		
		
		
	} // main

} // class
