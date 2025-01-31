package days23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import util.FileUtil;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 3:16:47
 * @subject
 * @content 
큰 파일 쪼개기
붙이기는 sequence붙은 stream 객체로 해서 파일 합체 가능
 */
public class Ex03_09 {

	public static void main(String[] args) {
		
		String parent = ".\\src\\days23";
		String child = "2. 시간표(20241223 KDT_AWS).pdf";
		
		File f = new File(parent, child);
		
		// > 파일 크기 : 115902(bytes)
		// System.out.println("> 파일 크기 : "+ f.length() + "(bytes)");
		
		// 10kb = 10*1024 로 나눠서 저장
		// 2. 시간표(20241223 KDT_AWS)_1.pdf 10kb
		// 2. 시간표(20241223 KDT_AWS)_2.pdf 10kb
		// :
		// 2. 시간표(20241223 KDT_AWS)_12.pdf 10kb
		
		// "2. 시간표(20241223 KDT_AWS)"
		String baseName = FileUtil.getBaseName(child);
		// ".pdf"
		String ext = FileUtil.getExtension(child);
		
		final int VOLUME = 10 * 1024; // 10kb
		int data = 0;
		int i = 0; // _index.pdf 	읽어온 바이트 수
		int index = 0;
		
		// 읽기는 한번만, 쓰기는 10kb로 나눈 횟수만큼 저장
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try (
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
				){
			
			while ( (data = bis.read()) != -1 ) {
				if ( i % VOLUME == 0 ) { // 10kb 일때
					if ( i != 0 ) bos.close(); // bos.flush() 자동 호출 -> i가 0일때는 저장할 필요없음
					
					child = String.format("%s_%d%s", baseName, ++index, ext);
					System.out.println( child );
					
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				} // if
				bos.write(data);
				i++;
			} // while
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
