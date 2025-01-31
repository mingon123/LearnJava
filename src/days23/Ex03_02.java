package days23;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 12:19:24
 * @subject
 * @content 

	javaPro 폴더 안에
 	  ㄴ 하위 폴더
 	  ㄴ 파일
 	  정보 조회..
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		//							C:\Users\SIST\git\LearnJava - 경로 가져옴
		String currentDirectory = System.getProperty("user.dir");
		System.out.println( currentDirectory );
		
		File parent = new File(currentDirectory);
		
		/*
		// 폴더와 파일 전부 출력 
		String[] listArr = parent.list();
		for (int i = 0; i < listArr.length; i++) {
			System.out.println( listArr[i] );
		} // for i
		*/
		
		// 리턴값: 파일[]배열
		// 1738288991904 long -> 날짜 객체로 변환 -> 형식화 클래스 사용
		
		String pattern = "yyyy-MM-dd a hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		
		
		File[] listArr = parent.listFiles();
		for (int i = 0; i < listArr.length; i++) {
			Date d = new Date();
			File f = listArr[i];
			System.out.printf("%s\t %s\t %s\t %s\t \n", f.isDirectory() ? "[폴더]" : "파일", f.getName(), sdf.format(d), f.isFile() ? f.length()+"(bytes)" : "" ); // f.lastModified() : 수정된 날짜를 long형으로 반환 
		} // for i
		
		
		
	} // main

} // class
