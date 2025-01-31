package days23;

import java.io.File;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 3:08:06
 * @subject
 * @content 
재귀함수 써서 하위폴더부터 전부 삭제해서 최종적으로 Temp까지 삭제
 */
public class Ex03_07 {

	public static void main(String[] args) {
		// [문제] 재귀 함수
		String pathname = "C:\\Temp";
		File f = new File(pathname);
		
//		System.out.println( f.exists() ); // 있는지 확인 false
		if ( !f.exists() ) {
			// 폴더 생성
			System.out.println( f.mkdirs() ); // 하위폴더가 없는 경우 해당하는 폴더들 전부 생성
		} else { 
			// 폴더 삭제
			System.out.println( f.delete() );  // upload 폴더 삭제
			// f.deleteOnExit(); // 프로그램 종료할 때 삭제
		}
		
	} // main

} // class
