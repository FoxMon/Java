import java.util.Scanner;

public class HistogramApp{
	private int[] histoData = new int[26]; // ���ĺ� 26��
	
	public HistogramApp() { // ������
		for(int i = 0; i < histoData.length; i++) {
			histoData[i] = 0; // ������ ȣ�� �� ��� 0���� �ʱ�ȭ
		}
	}
	
	public void makeHistogram(String str) { // ������׷� �׷����� ����� ���� ���ĺ� ī��Ʈ �޼ҵ�
		String tStr = str.toString(); // String���� ���ڿ� ����
		
		tStr = tStr.toLowerCase(); // ��� �ҹ��ڷ� �ٲٰ�
		
		for(int i = 0; i < tStr.length(); i++) { // ���ڿ� ��
			char c = tStr.charAt(i); // �ش��ε����� char�� ���ڿ� ��ȯ
			
			if(c >= 'a' && c <= 'z') { // �ش���ĺ��� ī��Ʈ ����
				int idx = c - 'a';
				histoData[idx]++; // �ش� �ε����� histoData ī��Ʈ
			}
		}
	}
	
	private void drawHistogram() { // ������׷��� �׸��� �޼ҵ�
		System.out.println("������׷��� �׸��ϴ�.");
		
		for(int i = 0; i < histoData.length; i++) {
			System.out.print((char)('A'+i)); // ���� �빮�ڷ� �ش� ���ĺ� ǥ�� ��
			
			for(int j = 0; j < histoData[i]; j++) {
				System.out.print('-'); // ������׷� ������ŭ - �� ���
			}
			
			System.out.println(); // ����
		}
	}
	
	private String readText() { // Ű����κ��� ���ڿ��� �а�, ���ۿ� �����ϴ� �޼ҵ�
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ�, �����ݷ��� �Է��ϼ���.");
		
		StringBuffer buffer = new StringBuffer(); // Ű �Է� ��, ���ۿ� ������ ��ü ����
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String str = scan.nextLine(); // �ؽ�Ʈ �� ����
			
			if(str.equals(";")) {
				break;
			}
			
			buffer.append(str); // ���ۿ� ����ؼ� ���ڿ� ���� ������
		}
		scan.close(); // Scanner �ݾ���
		
		return buffer.toString(); // ���ۿ� ����� ���ڿ��� ����
	}
	
	public void run() { // ���� �޼ҵ�
		String str = readText(); // ���ڿ� �о����
		
		makeHistogram(str); // ���ĺ� ī��Ʈ
		drawHistogram(); // ������׷� �׸�
	}
	
 	public static void main(String[] args) {
		HistogramApp hisApp = new HistogramApp(); // ��ü ����
		
		hisApp.run(); // ������׷� ����
	}
}