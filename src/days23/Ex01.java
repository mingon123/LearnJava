package days23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오전 11:04:23
 * @subject
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		1. 직렬화(Serialization) : 
			Object(객체)를 입출력하기 위해서 스트림으로 만드는 것.
		2. 역직렬화(deSerialization) :
			스트림 -> 객체
		3. 객체를 직렬화 바이트 스트림 제공
			Object[InputStream]
			Object[OutputStream]
		
		4. UserInfo 클래스 추가
		 */

		UserInfo u1 = new UserInfo("홍길동", "1234", 25);
		UserInfo u2 = new UserInfo("이찬희", "4321", 27);
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		
		String fileName = ".\\src\\days23\\UserInfo.ser";
		
		// ObjectOutputStream : 보조스트림
		try (
				FileOutputStream out = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(out);
			){
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush(); // 저장~
			
			System.out.println("u1, u2 객체를 직렬화해서 파일로 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
