package days13;

// [영업직 사원 클래스]
// subClass 를 가질 수 없는 최종 클래스이다. // 그냥 공부하려고 final 붙여봄
public final class SalesMan extends Regular{

	// Regular꺼 물려받은 목록 + 새로 선언
	// 필드 : name, addr, tel, hiredate, basePay
	private int sales; // 판매량
	private int comm; // 커미션

	// 생성자
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}

	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {	// Employee, Regular 에서 물려받은게 5개 여기서 선언 2개
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> Employee 7 생성자 호출됨."); // 매개변수 7개
	}	

	// 메서드 : dispEmpInfo(), getPay(), getter/setter
	@Override
	public void dispEmpInfo() {
//		super.dispEmpInfo(); // name, addr, tel, hiredate, basePay
//		System.out.printf("기본급=%d\n", this.basePay);
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d, "
						+ "판매량=%d, 커미션=%d\n"
						, this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.getBasePay()
						, this.sales, this.comm);
	}

	// 급여 계산해서 반환하는 메서드
	@Override
	public int getPay() {
		// return this.getBasePay() + this.sales * this.comm; // 영업직은 기본급+판매량*커미션
		return super.getPay() + this.sales * this.comm; // 둘다 같은 코드
	}
	
}


/* final 클래스이기 때문에 자식을 만들 수 없다.
// The type LastChild cannot subclass the final class SalesMan
class LastChild extends SalesMan{
	
}
*/




