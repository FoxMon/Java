import java.io.*;

public class FileRead {
	public static void main(String[] args) {
		InputStreamReader input = null;
		FileInputStream fileInput = null;
		
		try {
			fileInput = new FileInputStream("C:\\Temp\\phone.txt");
			input = new InputStreamReader(fileInput, "MS949"); // ��Ʈ������ ����
			int readString;
			
			System.out.println("C:\\Temp\\phone.txt�� ����մϴ�.");
			
			while((readString = input.read()) != -1) { // ������ ���� �Ǻ���
				System.out.print((char)readString); // �ʼ������� charŸ������ ĳ�����ؾ���
			}
			
			fileInput.close(); // ��Ʈ���� ����
			input.close();
		}catch(IOException s) {
			System.out.println("����� �����Դϴ�.");
		}
	}
}
