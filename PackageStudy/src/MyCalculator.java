import lib.Calculator; // �߻�Ŭ����
import app.GoodCalc; // �߻�Ŭ���� ����

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal = new GoodCalc();
		
		System.out.println(cal.add(2, 3)); // ����
		System.out.println(cal.subtract(2, 3)); // ����
		System.out.println(cal.average(new int[] {1, 2, 3, 4})); // ���, �迭����
	}
}
