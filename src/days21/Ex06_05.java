package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 1. 23. - 오후 4:16:55
 * @subject
 * @content

 		확장자 exe 실행파일 복사
 		문자 스트림 X - 실행안됨
 		바이트 스트림 ( 파일 읽/쓰기 )
 		
 		FIS/FOS(1)			FileInputStream/FileOutputStream
 		BI/BO  (2)			BufferedInputStream/BufferedOutputStream
 */
public class Ex06_05 {


	public static void main(String[] args) {
		// 텍스트 파일 복사
		String fileName = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
		String copyFileName = "msedge_copy.exe";

//		fileCopy_byteStream(fileName, copyFileName);
		fileCopy_byteStream02(fileName, copyFileName);


		System.out.println(" end ");
	} // main

	
	// 처리시간(ns) : 15808200
	private static void fileCopy_byteStream02(String source, String target) {

		long start = System.nanoTime();

		final int BUFFER_SIZE = 1024;
		
		try ( 
				FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);
				// 보조스트림 - 버퍼기능 추가
				BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
				) {
			// (기억)
			byte [] b = new byte[BUFFER_SIZE];
			
			int n = -1;
			while ( ( n = bis.read(b) ) != -1 ) {
				bos.write(b, 0, n);  // 0부터 읽어온크기 n까지
			}
			
			bos.flush();
			System.out.println(" 파일 복사 완료!! ");	
			// [문제] 파일명 == 클래스명 수정(변경) 해야함
			
		} catch (Exception e) {
			System.out.println(e);
		}

		long end = System.nanoTime();
		System.out.println( "처리시간(ns) : " + (end-start) );

	} 
	
	
	
	
	// 처리시간(ns) : 8511237200
	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();

		try ( 
				FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);
				) {
			int code;
			while ( (code = fis.read() ) != -1 ) {
//				System.out.println( code ); // 화면 출력
				fos.write(code); // writer.append() 도 가능
			} // while
			fos.flush();	// 오토플러쉬가 안되어도 이걸 사용하여 기록함
			System.out.println(" 파일 복사 완료!! ");

			// [문제] 파일명 == 클래스명 수정(변경) 해야함


		} catch (Exception e) {
			System.out.println(e);
		}

		long end = System.nanoTime();
		System.out.println( "처리시간(ns) : " + (end-start) );

	} 

	
	
} // class
