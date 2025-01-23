package days21;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오전 10:43:32
 * @subject
 * @content 
 
 		[ 제네릭 클래스의 객체 생성과 사용 ]
 */

/* class가 default라 중복선언 오류생겨서 이렇게 함
public class Ex03_04 {

	public static void main(String[] args) {
		
		Box03<Fruit> fruitBox = new Box03<>();
		Box03<Apple> appleBox = new Box03<>();
		Box03<Grape> grapeBox = new Box03<>();
		Box03<Toy> toyBox = new Box03<>();
		
		// 예외 발생.
		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		// Box03<Apple> box = new Box03<Grape>();
		
		fruitBox.add( new Fruit() ); // 과일객체
		fruitBox.add( new Apple() ); // 사과객체
		fruitBox.add( new Grape() ); // 포도객체
		
		//The method add(Fruit) in the type Box03<Fruit> is not applicable for the arguments (Toy) - Toy는 상속등 fruit과 상관이 없기 때문에 fruitBox에는 Toy 객체를 생성할 수 없다.
		// fruitBox.add( new Toy() ); // 장난감객체
		// toyBox.add(new Apple() );
		
		toyBox.add(new Toy() ); // 이건가능
		
		
	} // main

} // class


// Fruit
// ㄴ Apple
// ㄴ Grape
// Toy
class Fruit { public String toString() { return  "Fruit";  } }
class Apple extends Fruit { public String toString() { return  "Apple";  } }
class Grape extends Fruit { public String toString() { return  "Grape";  } }
class Toy { public String toString() { return  "Toy";  } }


// 제네릭 클래스 선언
class Box03<T> {
	
	ArrayList<T> list = new ArrayList<>();
	void add(T item) { this.list.add(item); }	
	T get(int i) { return this.list.get(i); }
	int size() { return this.list.size(); }
	public String toString() { return this.list.toString(); }
	
}
*/



