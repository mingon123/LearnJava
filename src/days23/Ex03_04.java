package days23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 2:04:56
 * @subject
 * @content 
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// days23 폴더 안에 있는 모든 파일을 읽어와서
		// 그 파일 안에 exists 문자열이 포함된 파일 목록 출력.
		String keyword = "exists";
		String pathname = ".\\src\\days23";
		File parent = new File(pathname); // 폴더
		File [] listArr = parent.listFiles();
		
		for (int i = 0; i < listArr.length; i++) {
			String fileName = listArr[i].getName();
			if( fileName.endsWith(".java") ) {
//				System.out.println( fileName );				
				File file = listArr[i];
				try (
					FileReader in = new FileReader(file);
					BufferedReader br = new BufferedReader(in);
					){
					String line = null;
					int lineNumber = 1;
					while( (line=br.readLine()) != null ) {						
						if( line.contains(keyword) ) {
							line = line.replaceAll(keyword, "["+keyword+"]");
//							line = line.replaceAll(keyword, "<span style='color:red'>"+keyword+"</span>"); // jsp에서는 이렇게 사용
							System.out.printf("%s [%d] : %s\n", fileName, lineNumber, line);
						} // if
						lineNumber++;
					} // while
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // if
		} // for i
		
		
	} // main

} // class
