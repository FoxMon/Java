import java.io.*;

public class FileCopyBuffer{
	public static void main(String[] args) {
		File srcfile = new File("C:\\Temp\\test.txt"); // 원본파일경로
		File destfile = new File("C:\\Temp\\test_result.txt"); // 복사파일경로 
		
		FileInputStream fis = null; // 바이너리
		FileOutputStream fos = null;
		
		InputStreamReader isr = null; // 문자
		OutputStreamWriter osw = null;
		
		BufferedReader br = null; // 버퍼
		BufferedWriter bw = null;
		
		String line;
		
		try {
			fis = new FileInputStream(srcfile);
			fos = new FileOutputStream(destfile);
			
			isr = new InputStreamReader(fis, "MS949");
			osw = new OutputStreamWriter(fos, "MS949");
			
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			while((line = br.readLine()) != null) { // 한줄로 읽음
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
			System.out.println("오류");
		}
	}
}