package days14;

/**
 * @author kenik
 * @date 2025. 1. 14. - 오후 4:15:21
 * @subject
 * @content
 ~~able == ~~하는 기능이 있는 추상메서드
 
		인터페이스
		 ㄴ 상수, 추상메서드
		 ㄴ jdk1.8~ static 메서드, default 메서드			이번엔 이부분 학습
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// html 문서를 파싱(구문분석)을 해서 내가 원하는 내용 얻어오기.
		// xml 문서를 파싱(구문분석)을 해서 내가 원하는 내용 얻어오기.
		String docType="xml";
		String fileName = "sample.xml"; // XML문서 파일명
		
		// 업캐스팅, 다형성
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(fileName);
		parser.print();
		
		System.out.println(" end ");
		
		
		Parseable.test();
		
	} // main
	
} // class


// 2020년도 개발
interface Parseable {
	
	// 구문분석하는 추상메서드
	void parse(String fileName);
	
	
	// [문제] 사용하던 인터페이스에서 나중에 기능을 추가하고 싶을 때
	// 추상메서드를 추가하면 해당 인터페이스를 사용하는 모든 클래스, 인터페이스에서 오류가 생김.
	// (방법1) jdk 1.8이후부터는 default를 사용해서 가능
	default void print() {
		System.out.println("인쇄 기능 구현...");
	}
	
	static void test() {
		System.out.println("> test()... 구현");
	}
	
}

// 인터페이스끼리의 상속은 extends 키워드 사용
interface ParseablePlus extends Parseable { 		// (방법2) 상속받는 새로운 인터페이스를 만들어 앞으로는 ParseablePlus를 사용하는 것도 한 방법
	// 인쇄하는 추상 메서드						
	void print();							
}


// 2020년도 개발
// HTML문서를 파싱하는 클래스(파서)
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 파일 구문 분석 메서드");
	}
	
}

// 2020년도 개발
// XML문서를 파싱하는 클래스(파서)
class XMLParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("XML 파일 구문 분석 메서드");
	}
	
	// (방법3) 직접 print() 구현	- 해당 클래스 안에서 구현
	// 인터페이스 안의 default 메서드는 무시된다.
	public void print() {
		System.out.println("코딩 직접 구현...");
	}
	
}

// 2022년도 개발
class PDFParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("XML 파일 구문 분석 메서드");
	}
	
}

//2023년도 개발
class WORDParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("XML 파일 구문 분석 메서드");
	}
	
}



// 2025년 1월 14일	???Parser 20개 클래스 선언되어있음(가정)


// HTMLParser, XMLParser 앞으로 여러개의 파서가 존재할 수도 있음
// 관리하는 관리자(Manage) 클래스
class ParserManager{

	public static Parseable getParser(String docType) {
		
		Parseable parser = null;
		
		switch ( docType ) {
		case "xml":
			parser = new XMLParser();
			break;

		case "html":
			parser = new HTMLParser();
			
		default:
			parser = null;	// 기본이 null이라 없어도 됨.
			break;
		}
		return parser;
	}
	
}












