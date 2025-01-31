package days22;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
// 바이트 스트림 사용
public class Ex03 {

	public static void main(String[] args) {
		
		String name = "이찬희";
		int kor = 89, eng = 77, mat = 57;
		int tot = kor + eng + mat;
		double avg = (double) tot/3;
		boolean gender = true;
		
		// 위의 한 학생의 정보를 문자스트림(FileWriter) 사용 -> 파일로 저장
		String fileName = "student.dat";
		
		// 2번째 매개변수 : append -> 기존에 파일이 있을 경우 뒤에 새로 추가
		try (
				FileOutputStream fos = new FileOutputStream(fileName, true); // true : 값 추가
				DataOutputStream dos = new DataOutputStream(fos);
			) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();			
		} catch (Exception e) {
			System.out.println( e );
		}

	}

}








