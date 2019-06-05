import java.io.*;

public class BinaryFileCopy {
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\binarytest.pptx");
		File destfile = new File("C:\\Temp\\binarytest_result.pptx");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int c;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			while((c = fis.read()) != -1) {
				fos.write((byte)c);
			}
			
			fis.close();
			fos.close();
			
			System.out.println(srcfile.getPath() + "�� " + destfile.getPath() + "�� �����Ͽ����ϴ�.");
		} catch(IOException e) {
			System.out.println("���� ���� ����.");
		}
	}
}
