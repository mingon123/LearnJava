package days22;

import java.io.FileWriter;

/**
 * @author kenik
 * @date 2025. 1. 24. - 오전 9:23:50
 * @subject
 * @content

 		Data[InputStream]/Data[OutputStream]
 		- 바이트 스트림(보조스트림)
 		- 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림.
 		
 		Ex02.java/Ex02_02.java - 문자스트림(저장, 출력)
 		Ex03.java/Ex03_02.java - 바이트스트림(저장, 출력)
 */
public class Ex02 {

	public static void main(String[] args) {
		
		String name = "이찬희";
		int kor = 69, eng = 87, mat = 97;
		int tot = kor + eng + mat;
		double avg = (double) tot/3;
		boolean gender = true;
		
		// 위의 한 학생의 정보를 문자스트림(FileWriter) 사용 -> 파일로 저장
		String fileName = "student.txt";
		
		// 2번째 매개변수 : append -> 기존에 파일이 있을 경우 뒤에 새로 추가
		try ( FileWriter writer = new FileWriter(fileName, true); ) {
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n", name,kor,eng,mat,tot,avg,gender); // 전부 string으로 만들어서 저장
			writer.write(data);
			writer.flush();
		} catch (Exception e) {
			System.out.println( e );
		}
		
		
		
	} // main
	
} // class


