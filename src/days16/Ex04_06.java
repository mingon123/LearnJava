package days16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 1. 16. - 오후 4:02:04
 * @subject
 * @content

		학생명단.txt		파일 읽어서 태그를 붙여서 HTML파일로 저장
 */
public class Ex04_06 {

	public static void main(String[] args) {
		// (생각해보기) 팀 배치
		// String [][] teamArr = new String[3][5];
		
		
		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days16\\SiStE.html";
		
		// FileReader / FileWriter 클래스  - 읽고 쓰는데 필요
		
		String name = null; // line == 한 라인에 이름 하나여서 
		try (FileReader reader = new FileReader(fileName );
			 BufferedReader br = new BufferedReader(reader); 
			 FileWriter writer = new FileWriter(saveFileName) ) {
			
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 E강의실 학생 명단</h3>");
			writer.write("<ol>");

			while ( (name = br.readLine()) != null ) {
//				System.out.println( name );
				String li = String.format("<li>%s</li>", name); // <li>이름</li>
				writer.write(li);
			} // while

			writer.write("<ol>");
			writer.write("</body>");
			writer.write("</html>");
		} catch (Exception e) {
			System.out.println( e );	// e.toString() 와 같음
		}

		System.out.println(" end ");
		
		
	} // main

} // class
