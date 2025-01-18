package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01 {

	public static void main(String[] args) {
		
//		days16.Ex04_06.java 복사
//		   days16.학생명단.txt 파일을 읽어서
//		   String [][] students = new String[3][5];
//		   2차원 배열에 5명씩 채워넣고 
//		   결과와 같이 파일로 저장하기.
		
		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days17\\SiStE-Team.html";
		String [][] students = new String[3][5];
		
		String name = null; // line
		try (FileReader reader = new FileReader(fileName );
			 BufferedReader br = new BufferedReader(reader); 
			 FileWriter writer = new FileWriter(saveFileName) ) {
			
			int cnt = 0; // 이름을 읽어온 갯수
			int cols = students[0].length;
			while ( (name = br.readLine()) != null ) {
//				students[행][열]	-> Ex01_02에서 풀이함
				students[cnt/cols][cnt%cols] = name;
				cnt++;
			} // while
	
			// 파일로 저장..
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 E강의실 학생 명단</h3>");
			
			
			for (int i = 0; i < students.length; i++) { // 행 == 팀
				writer.write("<h3>" +(i+1)+ "조</h3>");
				writer.write("<ol>");
				for (int j = 0; j < students[i].length; j++) { // 열 == 팀원
					String li = String.format("<li>%s</li>", students[i][j]);
					writer.write(li);
				} // for j 
				writer.write("</ol>");
			} // for i
			
			writer.write("</body>");
			writer.write("</html>");
		} catch (Exception e) {
			System.out.println( e );
		}
		System.out.println(" end ");
		

	} // main

} // class