class Point{
	private int x; // x��ǥ
	private int y; // y��ǥ
	
	public Point() { // PointŬ������ default ������
		this(0, 0); // �Ű����ڰ� �ٸ� ������ ȣ��
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { // x�� ������
		return x;
	}
	
	public int getY() { // y�� ������
		return y;
	}
	
	public void setX(int x) { // x�� ������
		this.x = x;
	}
	
	public void setY(int y) { // y�� ������
		this.y = y;
	}
}

class ColorPoint extends Point{
	private String color; // ���� ����
	
	public ColorPoint() { // ColorPointŬ������ default ������
		this(0, 0); // ������ ������ �ٸ� ������ ȣ��
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
		return this.color + "���� " + "(" + getX() + "," + getY()+")�� ��"; // string Ÿ�� ��ȯ
	}
}

public class PointTest {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0, 0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"�Դϴ�.");
	}
}