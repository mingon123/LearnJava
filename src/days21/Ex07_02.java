package days21;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 5:07:21
 * @subject
 * @content 
 */
public class Ex07_02 {

	public static void main(String[] args) {
		
		String source = "package days21;\r\n"
				+ "\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.util.Properties;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author kenik\r\n"
				+ " * @date 2025. 1. 23. - 오전 8:59:18\r\n"
				+ " * @subject\r\n"
				+ " * @content \r\n"
				+ " */\r\n"
				+ "public class Ex01 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		\r\n"
				+ "		// jdbc.properties -> Properties -> 환경설정값 읽어와서 출력.\r\n"
				+ "		String fileName = \"jdbc.properties\";\r\n"
				+ "		\r\n"
				+ "		Properties p = new Properties();\r\n"
				+ "		\r\n"
				+ "		// FileWriter / FileOutputStream 파일 쓰기\r\n"
				+ "		// FileReader / FileInputStream 파일 읽기\r\n"
				+ "		\r\n"
				+ "		// p.getProperty(); 속성값 얻어옴 \r\n"
				+ "		// p.setProperty(); 속성값 지정\r\n"
				+ "		\r\n"
				+ "		// 저장\r\n"
				+ "		// p.store(null, fileName);\r\n"
				+ "		// p.storeToXML(null, fileName);\r\n"
				+ "		\r\n"
				+ "		// 읽기\r\n"
				+ "		// p.load(reader);\r\n"
				+ "		// p.load(inStream);\r\n"
				+ "		\r\n"
				+ "		try (FileReader reader = new FileReader(fileName)) {			\r\n"
				+ "			p.load(reader);	// 읽어와서 p에 넣음\r\n"
				+ "			\r\n"
				+ "			// p.list(System.out); // 내용 출력\r\n"
				+ "			String className = p.getProperty(\"ClassName\");\r\n"
				+ "			String user = p.getProperty(\"user\");\r\n"
				+ "			String url = p.getProperty(\"url\");\r\n"
				+ "			String password = p.getProperty(\"password\");\r\n"
				+ "			\r\n"
				+ "			System.out.println( className );\r\n"
				+ "			System.out.println( user );\r\n"
				+ "			System.out.println( url );\r\n"
				+ "			System.out.println( password );\r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println( e );\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";
		
//		System.out.println( source ); // 그냥 출력
		
		// [문제] source 문자열에서 16번째 라인의 문자열을 찾아서 출력..
		
		// [1]
		String regex = "\r\n";
		String [] sArr = source.split(regex);
		System.out.println( sArr[15] );
		
		
		// [2] StringReader/StringWriter 	메모리 스트림
		//	 source 문자열 -> 스트림 -> 라인단위처리 -> BufferedReader/BufferedWriter == 보조스트림
		try (
				StringReader reader = new StringReader(source);
				BufferedReader br = new BufferedReader(reader);
				){
			int i = 1;
			while (i++<=15) br.readLine();
			String line16 = br.readLine();
			System.out.println(line16);
		} catch (Exception e) {
			System.out.println( e );
		}
	

	} // main
	
} // class
