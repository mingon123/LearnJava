package days13;

// 기존 클래스(Point2D) + z축 추가 - 수작업으로 추가
public class Point3DCopy {

	// 필드
	private int x;
	private int y;
	private int z;
	
	
	// 생성자는 상속되지 않는다.
	public Point3DCopy() {
		System.out.println("> Point 3D 디폴트 생성자 호출됨...");
	}

	public Point3DCopy(int a) {
		this.x = a;
		this.y = a;
		this.z = a;
		System.out.println("> point2D 1 생성자 호출됨...");
	}

	public Point3DCopy(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("> point2D 2 생성자 호출됨...");
	}
	
	
	// 메서드 + getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// z getter, setter
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void dispPoint3D() {
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
		System.out.printf("z=%d\n", this.z);
	}
	
	public Point3DCopy offsetPoint(int i) {
		x += i;
		y += i;
		z += i;
		return this;
	}
	
	public void offsetPoint( Point3DCopy p) {
		x += p.x;
		y += p.y;
		z += p.z;
	}
	
	public Point3DCopy plus(Point3DCopy p) {
		int xValue = x + p.x;
		int yValue = y + p.y;
		int zValue = z + p.z;
		
		Point3DCopy newp = new Point3DCopy();
		newp.x = xValue;
		newp.y = yValue;
		newp.z = zValue;
		
		return newp;
	}
	
	

} // class
