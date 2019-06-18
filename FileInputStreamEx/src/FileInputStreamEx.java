import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte[] b = new byte[6];
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Temp\\test.out");
			
			int c;
			int n = 0;
			
			while((c = fis.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("C:\\Temp\\test.out을 읽었습니다.");
			
			fis.close();
		} catch(IOException e) {
			System.out.println("Error");
		}
	}
}
