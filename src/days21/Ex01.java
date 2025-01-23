package days21;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오전 8:59:18
 * @subject
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// jdbc.properties -> Properties -> 환경설정값 읽어와서 출력.
		String fileName = "jdbc.properties";
		
		Properties p = new Properties();
		
		// FileWriter / FileOutputStream 파일 쓰기
		// FileReader / FileInputStream 파일 읽기
		
		// p.getProperty(); 속성값 얻어옴 
		// p.setProperty(); 속성값 지정
		
		// 저장
		// p.store(null, fileName);
		// p.storeToXML(null, fileName);
		
		// 읽기
		// p.load(reader);
		// p.load(inStream);
		
		try (FileReader reader = new FileReader(fileName)) {			
			p.load(reader);	// 읽어와서 p에 넣음
			
			// p.list(System.out); // 내용 출력
			String className = p.getProperty("ClassName");
			String user = p.getProperty("user");
			String url = p.getProperty("url");
			String password = p.getProperty("password");
			
			System.out.println( className );
			System.out.println( user );
			System.out.println( url );
			System.out.println( password );
			
		} catch (Exception e) {
			System.out.println( e );
		}
		
	} // main

}
