import java.io.*;

public class BinaryFileCopyArray {
	public static final int BUFFER_SIZE = 1024; // Buffer size�� 1024�� �ʱ�ȭ
	
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\binarytest.pptx");
		File destfile = new File("C:\\Temp\\binarytest_result.pptx");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[BUFFER_SIZE];
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			while(true) {
				int readCount = fis.read(buf); // buf�� ũ�⸸ŭ �о ��ȯ
				
				fos.write(buf, 0, BUFFER_SIZE);
				
				if(readCount < BUFFER_SIZE) { // �о���� ũ�Ⱑ buf�� ũ�⺸�� �۴ٸ�
					break;                    // EOF ������ ���� ���ԵǾ� �����Ƿ� ���� Ż��
				}
			}
			
			fis.close();
			fos.close();
			
			System.out.println(srcfile.getPath() + "�� " + destfile.getPath() + "�� �����Ͽ����ϴ�.");
		} catch(IOException e) {
			System.out.println("���� ���� ����.");
		}
	}
}
