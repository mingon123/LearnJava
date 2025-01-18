package days11;

//public class Person {
class Person { // default는 접근지정자가 없음

	// fileds
	public String name;
	public int age;
	
	// methods
	public void walk() {
		System.out.println("사람이 걷는다. ");
	}
	public void run() {
		System.out.printf("%s이 뛴다\n", name);
	}
	
}
