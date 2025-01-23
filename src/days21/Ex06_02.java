package days21;

import java.io.File;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 3:15:01
 * @subject
 * @content
 	
 		FileReader / FileWriter
		File 클래스
		 ㄴ 파일, 디렉토리(폴더)를 다루는(생성,삭제,수정, 정보 얻어오기 등등) 클래스
		 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 절대경로
		// 상대경로 . 현재 디렉토리,  .. 상위 디렉토리
		String parent = ".\\src\\days20"; // 파일아닌 디렉토리
		File dir = new File(parent); // 디렉토리
		System.out.println( dir.isDirectory() ); // true -> 디렉토리임
		
		String child = "Ex01.java";
		
//		File file = new File(parent, child);
		File file = new File(dir, child);
		System.out.println( file.isFile() ); // true -> 파일임
		// file.exists() // 존재 유무 -> true/false 반환
		
		System.out.println(">파일 크기 : " + file.length() + "(bytes)");
		
		int code ;
		try (FileReader reader = new FileReader(file) ){
			
			while ( ( code = reader.read() ) != -1 ) {
				System.out.print( (char) code );
			} // while
			
		} catch (Exception e) {
			System.out.println( e );
		}
		
	} // main
	
} // class
