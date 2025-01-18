package days11;

import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 1. 9. - 오후 3:26:53
 * @subject
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		/* [1]
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		*/
		
		/* [2]
		int [] m = new int[5];		
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}
		
		// 배열 초기화
		int [] m = { 1,2,3,4,5};
		
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]); 
		}
		*/
		
		
		// [클래스 배열 == 객체 배열]
		/*
		Person p1 = new Person();
		p1.name = "홍길동";
		
		Person p2 = new Person();
		p2.name = "김대원";
		
		Person p3 = new Person();
		p3.name = "김민곤";
		
		Person p4 = new Person();
		p4.name = "오재문";
		
		Person p5 = new Person();
		p5.name = "양희동";
		*/
		
		// 배열 선언 형식
		// 자료형 [] 배열명 = new 자료형[배열크기];
		
		/*
		Person [] persons = new Person[5];
		
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
		}
		*/
		
		// 클래스(객체) 배열 초기화
		Person [] persons = {
				new Person(), 
				new Person(), 
				new Person(), 
				new Person(), 
				new Person() 
		};
		
		
		persons[0].name = "홍길동";
		persons[1].name = "김대원";
		persons[2].name = "김민곤";
		persons[3].name = "오재문";
		persons[4].name = "양희동";
		
		for (int i = 0; i < persons.length; i++) {
			persons[i].run() ;
		}

	} // main

} // class




