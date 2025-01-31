package days23;

import java.io.File;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 2:21:10
 * @subject
 * @content 

		폴더 유무 확인, 생성, 삭제
 */
public class Ex03_05 {

	public static void main(String[] args) {
		
		String pathname = "C:\\Temp\\upload";
		File f = new File(pathname);
		
		System.out.println( f.exists() ); // 있는지 확인 false
		if ( !f.exists() ) {
			// 폴더 생성
			System.out.println( f.mkdirs() ); // 하위폴더가 없는 경우 해당하는 폴더들 전부 생성
			// f.mkdir(); // Temp까지는 있어야 함. 가장 마지막껏만 생성
		} else { 
			// 폴더 삭제
			System.out.println( f.delete() );  // upload 폴더 삭제
			// f.deleteOnExit(); // 프로그램 종료할 때 삭제
		}
		
	} // main

} // class
