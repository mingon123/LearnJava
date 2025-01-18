package days12;
// this 1,2,3 내용 공부
public class Ex07 {

	public static void main(String[] args) {
		new Calc().btnExec.exec_click();
	}

}

class Calc {
	//Button [] btns = null; // 많이 필요한데 여기서는 = 버튼 하나만 만듦
	Button btnExec = null;
	// 생성자
	public Calc() {
		init();
	}
	
	// 계산기 초기화...
	private void init() {
		this.btnExec = new Button("=", this);  // new Calc()의 인스턴스
	}

	public void exec() {
		System.out.println("연산 처리...");
	}
}

class Button {
	
	String text;	// [ * + = 등 여기서는 = ]
	Calc calc;
	
	public Button() {
	}
	
	public Button(String text) {
		this.text = text;
	}

	public Button(String text, Calc calc) {
		this(text);
		this.calc = calc;
	}
	
	public void exec_click() {
		this.calc.exec();
	}
}

