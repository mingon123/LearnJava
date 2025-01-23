package days21;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오전 11:08:31
 * @subject default 생성자라 같은 클래스내에서 중복선언으로 취급하기 때문에 전부 주석처리
 * @content 

		[ 제한된 제네릭 클래스 ]
 */
public class Ex03_05 {

	public static void main(String[] args) {
		
		
		
		
		
	} // main
	
}

/*
interface Eatable { }
class Fruit { public String toString() { return  "Fruit";  } }
class Apple extends Fruit { public String toString() { return  "Apple";  } }
class Grape extends Fruit { public String toString() { return  "Grape";  } }
class Toy { public String toString() { return  "Toy";  } }


// Box04 제네릭 클래스는 모든 타입(T)을 담을 수 있는 상자를 만드는 클래스

class Box04<T> {
	
	ArrayList<T> list = new ArrayList<>();
	void add(T item) { this.list.add(item); }	
	T get(int i) { return this.list.get(i); }
	int size() { return this.list.size(); }
	public String toString() { return this.list.toString(); }
	
}
*/


// 제네릭 클래스 선언 + 과일만 담을 수 있는 제네릭 클래스( 제한 )
// FruitBox<T extends Fruit> - 제한 코딩
/* 클래스 대신 인터페이스를 사용
class FruitBox<T extends Fruit> extends Box04<T> {
	
}
*/


/*
// implement 인터페이스. 여기선 extends : T가 인터페이스가 될 수도 있기 때문에 업캐스팅으로 extends 사용
class FruitBox<T extends Eatable> extends Box04<T> {
	
}
*/

/*
// Eatable 인테페이스로 구현된 Fruit 클래스의 자식만 T로 제한
class FruitBox<T extends Fruit & Eatable> extends Box04<T> {
	
}
*/























