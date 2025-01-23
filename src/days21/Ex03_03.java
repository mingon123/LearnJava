package days21;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오전 10:37:04
 * @subject
 * @content 

		[ 제네릭의 제한 ]
		1. 객체별로 다른 타입으로 지정해서 동작하도록 만든 기능이기 때문에 static 필드는 선언할 수 없다.
		2. static 메서드의 매개변수 타입으로 T를 사용할 수 없다.
		3. T 타입의 배열 선언 할 수 있다.
		
 */
public class Ex03_03 {

	public static void main(String[] args) {
		

	} // main
	
}

class box2<T> {
	
	// static T item2; // 오류. 1번 설명

	/* // 오류. 2번 설명
	static int compare(T t1, T t2) {
		return 0;
	}
	*/
	
	T [] itemArr; // 3번 설명
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}





