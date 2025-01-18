package days16;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오전 9:07:18
 * @subject
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// (시스템의)속성값을 가져옴
		// C:\Class\JavaClass\javaPro	// 기준되는현재디렉토리	
//		System.out.println(System.getProperty("user.dir"));
		String dir = System.getProperty("user.dir");

		// days15.Ex01.java 파일
		// 라인번호 붙여서 출력
		//				절대경로	- C:\\부터 경로를 전부 줌 
		//				상대경로	. 기준되는현재디렉토리		.. 부모디렉토리
//		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days15\\Ex01.java";
		String fileName = ".\\src\\days15\\Ex01.java";
		String line = null;
		int lineNumber = 1;
		
		try(FileReader reader = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(reader); ) {
			// EOF(end of file) 파일끝까지 읽음
			while ((line = br.readLine()) != null ) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			} // while		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");

	} // main

} // class
