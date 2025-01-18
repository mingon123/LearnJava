package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01_03 {

	public static void main(String[] args) {

		// 내가 푼거 고쳐야함

		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days17\\SiStE.html";
		
		String [][] students = new String[3][5];
		
		String name = null;
		try (FileReader reader = new FileReader(fileName );
			 BufferedReader br = new BufferedReader(reader); 
			 FileWriter writer = new FileWriter(saveFileName) ) {
			
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 E강의실 학생 명단</h3>");
			writer.write("<ol>");


			
			for (int i = 0; i < students.length; i++) {
				String ol = String.format("<h3>%s조</h3>", students[i]);
				writer.write(ol);
				for (int j = 0; j < students[i].length; j++) {
					while ( (students[i][j] = br.readLine()) != null ) {
						String li = String.format("<li>%s</li>", students[i][j]);
						writer.write(li);
					} // while
				}
			}
			
			writer.write("<ol>");
			writer.write("</body>");
			writer.write("</html>");
		} catch (Exception e) {
			System.out.println( e );
		}

		System.out.println(" end ");

	
	} // main

} // class
