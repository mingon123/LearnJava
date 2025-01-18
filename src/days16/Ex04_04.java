package days16;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오후 2:32:15
 * @subject
 * @content 
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 업로드		클라이언트	-> 서버
		// 다운로드 	클라이언트	<- 서버
		// A사람 a.txt		[upload 폴더]
		//					a.txt		파일 이름이 같을 경우
		//					a(1).txt	형태로 파일 이름이 바뀌어서 올라감
		//	업로드할 때 파일명과 확장자를 잘라서 index를 붙이는 작업을 해야함
		

		
		
		// [문제]
		// path 라는 전체 경로 속에서 Sample.java 순수한 파일명만... 추출
		// 파일명에서 확장자(.java)만 얻어와서 출력.
		String path = "C:\\temp\\src\\Sample.java";
		String fileName; // Sample.java
		String ext; // .java
		
		/*
		// [1] split(String regex)
		String [] pathArr = path.split("\\\\");
		fileName = pathArr[pathArr.length-1];
		System.out.println(fileName);
		
		ext = "." + fileName.split("\\.")[1];
		System.out.println( ext );
		*/
		
		/* 
		// [2] substring
		int index = path.lastIndexOf("\\");
//		System.out.println(index);
		fileName = path.substring(index + 1);
		System.out.println(fileName);

		index = fileName.lastIndexOf(".");
//		System.out.println(index);
		ext = fileName.substring(index);
		System.out.println(ext);
		*/
		
		
		
		/*
		// 내꺼
		fileName = path.substring(path.length() - path.lastIndexOf("\\"));
		System.out.println(fileName);
		
		ext = path.substring( path.length() - fileName.lastIndexOf(".") + 1 );
		System.out.println(ext);
		 */

	} // main
	
	
	
	/* [1]
	public static void main(String[] args) {
		// [문제]	 
		String dir = "C:\\temp\\src";
		String fileName = "Sample.java";
		
		// dir 마지막에 "\\" 존재를 모른다면? 
		if( !dir.endsWith("\\") ) {
			dir += "\\";
		} 

		// 열고자하는 전체 경로 = dir + fileName
//		String path = dir + fileName;
		String path = String.join("", dir, fileName);
		
		// C:\temp\src\Sample.java
		System.out.println( path ); // C:\temp\srcSample.java	dir, fileName 사이에 \가 없음

	} // main
	*/ 
	
	
	
} // class














