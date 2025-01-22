package days20;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오전 11:15:04
 * @subject
 * @content 

학번이 같으면 sSet안에 값을 추가하지 않음. 
 */
public class Ex03 {

	public static void main(String[] args) {

		/*
		Student s1 = new Student("2001001", "김대원", 25);
		System.out.println(s1.hashCode());	// 985922955
		Student s2 = new Student("2001002", "윤형식", 26);
		System.out.println(s2.hashCode()); 
		
		Student s3 = new Student("2001001", "김대원", 25);
		System.out.println(s3.hashCode());	// 1784662007 - 값이 같아도 HashCode값이 다름 == 둘이 다른 객체
		*/
		
		
		// 순서유지O, 중복허용X
		Set<Student> sSet = new LinkedHashSet<>();
		sSet.add(new Student("2001001", "김대원", 25));
		sSet.add(new Student("2001002", "윤형식", 26));
		sSet.add(new Student("2001003", "이찬희", 28));

		sSet.add(new Student("2001001", "김대원", 25));	// hashCode(), equals()를 오버라이딩함. no가 같으면 같은 객체로 판단.
		
		System.out.println(sSet.size());
		// new Student() 객체 요소로 채워넣고 있다.
		// hashCode() 가 같으면 같은 객체
		
	} // main

} // class

class Student {
	String no;	// 학번 "001"로 처리	학번 : 학생을 구별할 수 있는 고유한 필드
	String name; // 이름
	int age; // 나이
	
	
	public Student() {
		super();
	}


	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	
	// s1, s3 같아짐 
	@Override
	public int hashCode() {
		// return Integer.parseInt(this.no);	// 둘이 같음
		return this.no.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student && obj != null) {
			Student s = (Student)obj;
			return this.no.equals(s.no);
		}
		return false;
	}

}

