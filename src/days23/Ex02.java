package days23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오전 11:37:04
 * @subject
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {

		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		
		String fileName = ".\\src\\days23\\child.ser";
		
		// ObjectOutputStream : 보조스트림
		try (
				FileOutputStream out = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(out);
			){
			oos.writeObject(c);
			
			oos.flush(); // 저장~
			
			System.out.println("c 객체를 직렬화해서 파일로 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class

// 1. Child 객체를 직렬화해서 파일 저장
//	예외발생 : java.io.FileNotFoundException
//	예외처리 : class Parent implements Serializable
//	(정리) 부모클래스가 직렬화가 가능하다면 자식클래스는 자동으로 직렬화 가능한 클래스가 된다.
/*
class Parent implements Serializable{
	String name;
}

class Child extends Parent{
	int age;
}
*/

// [2번째 방법]
// 부모클래스는 직렬화할 수 없는 클래스이고, 자식클래스는 직렬화가 가능한 클래스
// -> 이럴 경우 부모의 멤버는 직렬화 대상에서 제외된다). (정리)
class Parent {
	String name;
}

class Child extends Parent implements Serializable{
	int age;
	
	// 개발자가 직접 부모의 멤버를 직렬화 대상에 추가하도록 구현.
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name); // 개발자 직업 직렬화 대상에 포함시키는 코딩
		out.defaultWriteObject();
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		in.defaultReadObject();
	}
	
}


