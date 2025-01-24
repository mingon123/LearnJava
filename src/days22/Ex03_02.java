package days22;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;

public class Ex03_02 {

	public static void main(String[] args) {
		
		String name;
		int kor, eng , mat;
		int tot;
		double avg;
		boolean gender;
		
		// 위의 한 학생의 정보를 문자스트림(FileWriter) 사용 -> 파일로 저장 -> 읽어와서 출력
		String fileName = "student.dat";
		
		// 2번째 매개변수 : append -> 기존에 파일이 있을 경우 뒤에 새로 추가
		try(FileInputStream fis = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(fis);
			  ) {
			String line;
			while ( dis.available() > 0 ) {

				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n", name,kor,eng,mat,tot,avg,gender); 
				
			} // while
			
		} catch (Exception e) {
			System.out.println( e );
		}

	}

}
