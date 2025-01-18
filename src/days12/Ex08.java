package days12;

/**
 * @author kenik
 * @date 2025. 1. 10. - 오후 3:20:15
 * @subject
 * @content 

		[ static 키워드 ]
		클래스 앞 - 중첩클래스에서만  - 여기서는 설명X
		메서드 앞 
		필드 앞
		에서 사용가능
		Save 클래스 새로 추가
		
		인스턴스 변수 : 인스턴스가 만들어질때마다 만들어지는 필드
 */
public class Ex08 {

	public static void main(String[] args) {
		// 1. 농협은행 - 저축 ( 이자율 동일 )
		// 2. 저축 관련된 클래스 + 사용 예제 + [static 키워드]
		//	  save

		/* [1]
		Save s1 = new Save("유형식", 10000, 0.02);
		Save s2 = new Save("김대원", 4000, 0.02);
		Save s3 = new Save("박형식", 16000, 0.02);
		Save s4 = new Save("오재문", 9000, 0.02);
		Save s5 = new Save("김민곤", 20000, 0.02);
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		*/
		
		/* [2] 클래스 배열 사용 처리 Alt+Shift+A로 한번에 
		Save [] ss = new Save [5];
		ss[0]= new Save("유형식", 10000, 0.02);  
		ss[1]= new Save("김대원", 4000, 0.02);  
		ss[2]= new Save("박형식", 16000, 0.02);  
		ss[3]= new Save("오재문", 9000, 0.02);  
		ss[4]= new Save("김민곤", 20000, 0.02);  
		*/
		
		// 클래스변수
		// 클래스명.클래스변수명
		// The field Save.rate [is not visible]
		// Save.rate =0.04;
		Save.setRate(0.04);
		
		// [3] 클래스 배열 초기화 사용
		Save [] ss = {
			new Save("유형식", 10000, 0.02),
			new Save("김대원", 4000, 0.02), 
			new Save("박형식", 16000, 0.02), 
			new Save("오재문", 9000, 0.02), 
			new Save("김민곤", 20000, 0.02) 
		};
		
		Save.setRate(0.04);
		
		ss[3].setRate(0.07); // static 메서드는 공유변수이기 때문에 한명만 바꿔도 전부 바뀜
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].printSave();
		}
		
		
		
	} // main                                        

} // class
