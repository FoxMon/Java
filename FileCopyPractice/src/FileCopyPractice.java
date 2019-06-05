import java.io.*;

public class FileCopyPractice {
	public static final int BUFFER_SIZE = 1024; // ������ ������
	
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\testfile.jpg"); // ���� ���� ���
		File destfile = new File("C:\\Temp\\testfile_result.jpg"); // ���� ���� ���
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[BUFFER_SIZE]; // �迭�� �̿��Ͽ� ���Ϻ��縦 �õ���
		int readCount = 0;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			System.out.println("testfile.jpg�� testfile_result.jpg�� �����մϴ�.");
			System.out.println("10%���� *�� ����մϴ�.");
			
			while(true) {
				int readfile = fis.read(buf);
				
				fos.write(buf, 0, BUFFER_SIZE);
				readCount += readfile;
				
				if(readfile < BUFFER_SIZE) { // EOF�߰� ��
					System.out.println("*");
					
					break; // �ݺ��� Ż��
				}
				
				if(readCount >= (srcfile.length() / 10)) { // 10���� �ʰ� ��
					System.out.print("*"); // �� ��� ��
					
					readCount -= (srcfile.length() / 10);
				}
			}
			System.out.println();
			
			fis.close(); // ��Ʈ���� �ݾ���
			fos.close();
			
			System.out.println(srcfile.getPath() + "�� " + destfile.getPath() + "�� �����Ͽ����ϴ�.");
		} catch(IOException e) {
			System.out.println("���� ���� ����.");
		}
	}
}
