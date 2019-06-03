import java.io.*;

public class TextFileCopy {
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\test.txt"); // ���� ���� ��θ�
		File destfile = new File("C:\\Temp\\test_result.txt"); // ���� ���� ��θ�

		FileInputStream fis = null; // ���̳ʸ�
		FileOutputStream fos = null; // ���̳ʸ�
		
		InputStreamReader isr = null; // ����
		OutputStreamWriter osw = null; // ����
		
		int c;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			isr = new InputStreamReader(fis, "MS949");
			osw = new OutputStreamWriter(fos, "MS949");
			
			while((c = isr.read()) != -1) { // ����
				System.out.print((char)c);
				osw.write((char)c);
			}
			
			System.out.println();
			
			isr.close();
			osw.close();
			fis.close();
			fos.close();
		} catch(IOException e) {
			System.out.println("�����߻�");
		}
	}
}
