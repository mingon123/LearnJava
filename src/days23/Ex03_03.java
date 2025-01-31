package days23;

import java.io.File;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 2:01:29
 * @subject
 * @content 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days23\\child.ser";

		File f = new File(fileName);
		
		// 파일 도는 폴더가 존재 확인
		System.out.println( f.exists() );
		
		if( f.exists() && f.isFile() ) {
			System.out.println( f.canRead() ); // 읽기 가능
			System.out.println( f.canWrite() ); // 쓰기 가능
			System.out.println( f.canExecute() ); // 실행 가능
			System.out.println( f.isHidden() ); // 숨김 파일
		}
		
	} // main

} // class
