package days20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author kenik
 * @date 2025. 1. 22. - 오후 5:05:54
 * @subject
 * @content 

		Map - TreeMap, Hashtable, HashMap, LinkedHashMap
			Properties 컬렉션클래스
			 ㄴ key String, value String
			 ㄴ Hashtable의 자식 클래스이다.
			 ㄴ 환경설정 정보들을 다룰 때 사용
			 	속성(property) -> 속성값


Hashtable은 HashMap에서 이름만 바꾸면 됨
HashMap을 권장.
 */
public class Ex11 {

	public static void main(String[] args) {
		// 오라클 DBMS 
		// DataBase 연결하기 위한 설정값...
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";
		
		// 1) 위의 4개 설정값 -> Properties 저장 -> 파일형태로 저장.
		Properties p = new Properties();														// key,value모두 String이기 때문에 값을 주지 않는다
		// p.put(k, v); - 지금까지 Map은 이렇게 했었는데 properties는 아래처럼함
		p.setProperty("className", className);	// 이름, 값 설정
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		// {password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
		System.out.println( p );
		
		/*
		// 파일로 저장. FileWriter/FileReader
		String fileName = "jdbc.properties";	// 경로안주면 지금 프로젝트 경로. .properties : 설정파일
		try (FileWriter writer = new FileWriter(fileName)) {
			p.store(writer, "[DB ConnectionString]");
			System.out.println("=save end=");
		} catch (Exception e) {
			System.out.println(e);
		}
		*/
		
		// XML 파일 저장
//		String fileName = "jdbc.xml";	// 경로안주면 지금 프로젝트 경로. 
//		try (FileOutputStream fos = new FileOutputStream(fileName)) {
//			// p.store(writer, "[DB ConnectionString]");
//			p.storeToXML(fos, "[DB ConnectionString]", "UTF-8");
//			System.out.println("=save end=");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
				
		
		
		
		
		
		
		
		// 2) 			  <-				<-				반대로도 해야함 - 읽어와서 쓰는작업
		
		
		

		
	} // main

} // class
