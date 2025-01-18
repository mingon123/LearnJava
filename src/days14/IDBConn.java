package days14;

public interface IDBConn {

	void open();	// public abstract 자동 생략
//	public abstract void open();
	void close();
	
	// CRUD
	void select();
	void insert();
	void update();
	void delete();
	
	
}
