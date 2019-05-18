import lib.Calculator; // Ãß»óÅ¬·¡½º
import app.GoodCalc; // Ãß»óÅ¬·¡½º ±¸Çö

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal = new GoodCalc();
		
		System.out.println(cal.add(2, 3)); // µ¡¼À
		System.out.println(cal.subtract(2, 3)); // »¬¼À
		System.out.println(cal.average(new int[] {1, 2, 3, 4})); // Æò±Õ, ¹è¿­Àü´Þ
	}
}
