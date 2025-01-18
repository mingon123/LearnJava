package days14;

// 오재문
public class OracleDBConn implements IDBConn {

	@Override
	public void open() {
		System.out.println("> 오라클 DB 연결하는 구현 코딩...");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		System.out.println("> 오라클 DB 조회하는 구현 코딩...");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	/* 표준화하지 않으면 이름을 마음대로 정할 수 있음
	void connection( ) {
		// 123213
	}
	*/
}
