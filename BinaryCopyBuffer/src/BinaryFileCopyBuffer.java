import java.io.*;

public class BinaryFileCopyBuffer {
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\binarytest.pptx");
		File destfile = new File("C:\\Temp\\binarytest_result.pptx");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int c;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while((c = bis.read()) != -1) {
				bos.write((byte)c);
			}
			
			fis.close();
			fos.close();
			
			System.out.println(srcfile.getPath() + "�� " + destfile.getPath() + "�� �����Ͽ����ϴ�.");
		} catch(IOException e) {
			System.out.println("���� ���� ����.");
		}
	}
}
