package days13;

// 상속
public class Point3D extends Point2D {

	// 필드
	private int z;

	// 생성자는 상속되지 않는다. (암기)
	public Point3D() {
		System.out.println("> Point 3D 디폴트 생성자 호출됨...");
	}

	public Point3D(int a) {
		// 부모클래스로 물려받은 필드를 초기화
		// The field Point2D.x [is not visible] - 접근지정자 문제
		// this.x = a;
		// this.y = a;
		this.setX(a); // setter로 접근
		this.setY(a);
			
		this.z = a;
		System.out.println("> point2D 1 생성자 호출됨...");
	}

	public Point3D(int x, int y, int z) {
		// this.x = x;
		// this.y = y;
		this.z = z;
		System.out.println("> point2D 2 생성자 호출됨...");
	}
	
	
	// 메서드 + getter, setter
	public Point3D(Point2D p, int z) {
		this.setX(p.getX());
		this.setY(p.getY());
		this.z = z;
	}

	// z getter, setter
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	public void dispPoint3D() {
		// System.out.printf("x=%d, y=%d", this.x, this.y);
		System.out.printf("x=%d, y=%d", this.getX(), this.getY());
		System.out.printf("z=%d\n", this.z);
	}
	
	@Override
	public Point3D offsetPoint(int i) { // 오버라이딩 : 물려받은 코드(매개변수 등 변경X) 안의 내용을 재정의(수정)해서 쓰겠다. : 재정의 함수
		// x += i; 
		// y += i;
		this.setX(this.getX()+i);
		this.setY(this.getY()+i);
		
		z += i;
		return this;
	}
	
	public void offsetPoint( Point3D p) {
		// x += p.x;
		// y += p.y;
		z += p.z;
	}
	
	public Point3D plus(Point3D p) {
		// int xValue = x + p.x;
		// int yValue = y + p.y;
		int zValue = z + p.z;
		
		Point3D newp = new Point3D();
		// newp.x = xValue;
		// newp.y = yValue;
		newp.z = zValue;
		
		return newp;
	}
	
	

} // class
