import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Converter conv = new Converter();
		double rate;
		
		System.out.print("ȯ��(1�޷�)>> ");
		rate = scan.nextDouble();
		conv.setRate(rate); // �����ڷ� rate�� ���� (ȯ���� ������ ����)
		
		System.out.println("�鸸���� $"+conv.toDollar(1000000)+"�Դϴ�");
		System.out.println("$100�� "+conv.toKWR(100)+"���Դϴ�");
		
		scan.close();
	}
}
