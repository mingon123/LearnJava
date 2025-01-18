package days13;

/**
 * @author kenik
 * @date 2025. 1. 13. - 오전 10:41:05
 * @subject
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();		// 결과에서 Noname4인 이유는 doc3에서도 count++이 실행되기 때문이다.
		Document doc5 = new Document();

	} // main

} // class

class Document { // document == 문서
	
	String fileName;
	static int count =1;
	
	// 인스턴스 초기화 블럭 - 생성자가 초기화될 때 마다, 생성자에서 공통적으로 있는 내용은 따로 빼서 사용
	{
		count++;
	}
	
	public Document() {
		// this의 두번 째 용도
		this(String.format("Noname%d.txt", count) );
	}

	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
	
} // Document






