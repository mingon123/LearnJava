package days21;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 2:26:10
 * @subject
 * @content 
 */
public class Ex05 {

	
	public static void main(String[] args) {
		
		/*
		[ 어노테이션(annotation) ]
		  ㄴ 주석
		  ㄴ comment
		  ㄴ 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것을 "어노테이션" 이라고 한다.
		  ㄴ 형식 : @어노테이션명
		  
		 [JDK에 제공하는 표준 어노테이션 ( 주로 컴파일러 )]
		  1) @Override : 컴파일러에게 오버라이딩한 메서드라는 것을 알려주는 어노테이션
		  2) @Deprecated : 앞으로 사용되지 않는 것 나타내는 어노테이션
		  3) @SuppressWarnings("resource") 
		     - 컴파일러의 특정 경고 메시지가 나타나지 않게 붙이는 어노테이션.
		  4) @FunctionInterface : 함수형인터페이스 라는 것을 알려주는 어노테이션.
		  		람다식에서 사용~
		  5) @SafeVararg : 제네릭 타입의 가변인자에 사용하는 어노테이션.
		  					대상( 메서드, 생성자 ) 에만 붙일 수 있다.
		  6) @Navtive : C 언어로 만든 메서드를 호출
		  				native메서드에서 참조되는 상수 앞에 붙인다.
		  				
		 [ 어노테이션 사용되는 어노테이션. ]                           
       	  7) @Target : 어노테이션이 적용가능한   대상을 지정할 때 사용하는 어노테이션.
          8) @Documented
          9) @Inherited
          10) @retention
          11) @Repeatable 

       	
       	 다른 라이브러리에서 제공하는 어노테이션들 있다.
       		ㄴ 스프링 프레임워크에서 제공하는 어노테이션
       		ㄴ 롬복에서 제공하는 어노테이션들
       		:
       		:       
       
       
		  comment 예)
		  //
		  /* */
		  /** ~ 소스코딩에 대한 정보를 저장 주석처리 - javadoc.exe -> HTML문서 생성~~ */

		
		Scanner scanner = new Scanner(System.in);
		scanner.next();

		
	} // main

} // class
