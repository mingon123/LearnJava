package days23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kenik
 * @date 2025. 1. 31. - 오후 2:28:43
 * @subject
 * @content 
 */
public class Ex03_06 {

	public static void main(String[] args) {
		// 아래처럼 매일매일 생성하고 싶음
		// days17.1차조편성 txt
		// C:\\Temp			
		//		ㄴ 2025.1.31(금)
		//			ㄴ 1조
		//				ㄴ 김민곤
		//				ㄴ 김하은
		//				ㄴ 박예진
		//				ㄴ 양희동
		//				ㄴ 박정현
		//			ㄴ 2조
		//			ㄴ 3조
		String fileName = ".\\src\\days17\\1차조편성.txt";
		String pathname = "C:\\Temp\\";

		
		Date d = new Date();
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(d);
		pathname += now;
		
		try (FileReader in = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(in); ){
			String line = null;
			String teamName = null;
			while ( (line=br.readLine()) != null ) {
//				System.out.println(line);
				teamName = line.substring(0, line.indexOf(":")-1);
//				System.out.println(teamName);	
//				
				
				String TeamMember = line.substring(line.indexOf(":")+2);
				String [] teamMemberArr = TeamMember.split("\\s*, \\s*");
				for (int i = 0; i < teamMemberArr.length; i++) {
					String name = teamMemberArr[i];
//					System.out.println(name);
					System.out.println( pathname + "\\" + teamName + "\\" + name );
					File f= new File( pathname + "\\" + teamName + "\\" + name );
					if( !f.exists() ) {
						System.out.println( f.mkdirs() );
					}
					
				} // for i
				
			} // while 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
