package days23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오전 11:04:23
 * @subject
 * @content 
 */
public class Ex01_02 {

	public static void main(String[] args) {

		// 역직렬화
		// 스트림 -> 객체

		String fileName = ".\\src\\days23\\UserInfo.ser";
		
		// ObjectInputStream : 보조스트림
		try (
				FileInputStream in = new FileInputStream(fileName);
				ObjectInput ois = new ObjectInputStream(in);
			){
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();

			System.out.println( u1 );
			System.out.println( u2 );
			System.out.println( list );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
