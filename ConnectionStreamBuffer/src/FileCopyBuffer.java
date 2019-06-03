import java.io.*;

public class FileCopyBuffer{
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\test.txt"); // �������ϰ��
		File destfile = new File("C:\\Temp\\test_result.txt"); // �������ϰ�� 
		
		FileInputStream fis = null; // ���̳ʸ�
		FileOutputStream fos = null;
		
		InputStreamReader isr = null; // ����
		OutputStreamWriter osw = null;
		
		BufferedReader br = null; // ����
		BufferedWriter bw = null;
		
		String line;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			isr = new InputStreamReader(fis, "MS949");
			osw = new OutputStreamWriter(fos, "MS949");
			
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			while((line = br.readLine()) != null) { // ���ٷ� ����
				System.out.print(line);
				
				bw.write(line);
				bw.newLine();
			}
			
			System.out.println();
			
			br.close();
			bw.close();
			fis.close();
			fos.close();
		} catch(IOException e) {
			System.out.println("����");
		}
	}
}