package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오전 10:08:20
 * @subject
 * @content 
제네릭
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		/* Object로 받아도 클래스 형변환하는데 번거로움이 있음
		Box box = new Box();
		box.setItem(100);
		int item = (int) box.getItem(); // Object로 받으면 다운캐스팅 해야함
		System.out.println( item ); // private라 get/set으로 설정

		Box box2 = new Box();
		box2.setItem("문자열");
		String sItem = (String) box2.getItem(); // 다운캐스팅
		System.out.println( item ); 
		*/
		
		// 컴파일 시에 타입을 결정하는 Box 클래스 선언
		Box<Integer> b1 = new Box<Integer>();
		b1.setItem(100);
		int item = b1.getItem();
		System.out.println( item );
		
		Box <String>box2 = new Box<>();
		box2.setItem("문자열");
		String sItem = box2.getItem(); // 다운캐스팅
		System.out.println( sItem ); 		
		// 자료형마다 클래스를 새로 선언할 필요도, Object로 클래스 선언 후 다운캐스팅을 매번 할 필요도 없음
		
		
		/*
		// 제네릭 없으면 이렇게 해야함
		ArrayList list = new ArrayList();
		Collections.addAll(list, 3,5,2,4,1);
		// list.add("String"); // 이렇게 추가못함 list를 int형으로 파싱하기 때문에
		// list.add(1.23);
		// list.add('C');
		// list.add(true);
		
		System.out.println(list);
		
		int first = (int) list.get(0); // object로 반환하기 때문에 형변환 해야함
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.println(n);
		}
		*/
		
		
//		// 제네릭 사용 - 형변환 안해도됨
//		ArrayList <Integer> list = new ArrayList<>();
//		
//		// list.add("String"); 이렇게 하면 오류생김
//		
//		Collections.addAll(list, 3,5,2,4,1);
//		System.out.println(list);
//		
//		int first = list.get(0); // object로 반환하기 때문에 형변환 해야함
//		
//		Iterator<Integer> ir = list.iterator();
//		while (ir.hasNext()) {
//			int n = ir.next();
//			System.out.println(n);
//		}		
		
		
	} // main
	
} // class


// [제네릭 클래스] 
// - 클래스명 뒤에 <T>을 붙이면 된다.
// T : 타입변수 또는 타입 매개변수 				- 클래스가 선언될 때 그때 타입을 정해줌
// Box : 원시타입( Raw Type )
// Box<T> : 제네릭 클래스
class Box<T>{
	private T item; // 

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}


/* Object 매개변수
class Box{
	private Object item; // int, double, String, char, 등등...

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}
*/

/* 제네릭을 사용하면 아래처럼 4개 전부 할 필요없음, object로 안받으면 4개를 전부 선언해야함
class Box{ // int
	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
}


class Box2{ // double
	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}


class Box3{ // string
	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
}


class Box4{ // char
	private char item;

	public char getItem() {
		return item;
	}

	public void setItem(char item) {
		this.item = item;
	}
	
}
*/







