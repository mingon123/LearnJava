package days23;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오전 11:04:23
 * @subject
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {

		// 역직렬화
		// 스트림 -> 객체

		String fileName = ".\\src\\days23\\child.ser";
		
		// ObjectInputStream : 보조스트림
		try (
				FileInputStream in = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(in);
			){
			Child c = (Child) ois.readObject();
			
			System.out.println( c.name + " / " + c.age ); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
