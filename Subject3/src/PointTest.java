class Point{
	private int x; // x좌표
	private int y; // y좌표
	
	public Point() { // Point클래스의 default 설정자
		this(0, 0); // 매개인자가 다른 생성자 호출
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { // x의 접근자
		return x;
	}
	
	public int getY() { // y의 접근자
		return y;
	}
	
	public void setX(int x) { // x의 설정자
		this.x = x;
	}
	
	public void setY(int y) { // y의 설정자
		this.y = y;
	}
}

class ColorPoint extends Point{
	private String color; // 점의 색깔
	
	public ColorPoint() { // ColorPoint클래스의 default 생성자
		this(0, 0); // 생성자 내에서 다른 생성자 호출
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	
	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return this.color + "색의 " + "(" + getX() + "," + getY()+")의 점"; // string 타입 반환
	}
}

public class PointTest {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0, 0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString()+"입니다.");
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}
}