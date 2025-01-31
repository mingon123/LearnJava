package days23;

import java.io.File;
import java.io.IOException;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 12:07:22
 * @subject
 * @content
		[ File 클래스 ] 
		

 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		String pathname = ".\\src\\days23"; // 디렉토리
		// String pathname = ".\\src\\days23\\Ex01.java"; // 파일
		
		File parent = new File(pathname);
		
		// System.out.println( parent.isDirectory() );
		// System.out.println( parent.isFile() );
		
		String child = "Ex01.java";
		
		File f = new File(parent, child); // 폴더명, 파일명
		
		System.out.println( f.getName() ); // 파일명 가져옴 (Ex01.java)
		int pos = f.getName().indexOf(".");
		// 순수한 파일명 (Ex01)
		System.out.println( f.getName().substring(0, pos) );
		// 확장자 (.java)
		System.out.println( f.getName().substring(pos) );
		
		
		System.out.println( f.getPath() );
		// 절대경로
		System.out.println( f.getAbsolutePath() );
		// Canonical : 법전같은 것으로 인정받은
		System.out.println( f.getCanonicalPath() );
		
		
		System.out.println( f.getParent() ); // 파일명 제외 경로 (.\src\days23) 
		// asdf;asdf;asdf; 
		System.out.println( File.pathSeparator ); // 경로구분 ;(세미콜론)
		// 폴더\폴더
		System.out.println( File.separator ); // 폴더\폴더 구분(\)
		
		
		
		
		
		
	} // main

} // class
