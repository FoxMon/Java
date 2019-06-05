import java.io.*;

public class BinaryFileCopyArray {
	public static final int BUFFER_SIZE = 1024; // Buffer size를 1024로 초기화
	
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
				int readCount = fis.read(buf); // buf의 크기만큼 읽어서 반환
				
				fos.write(buf, 0, BUFFER_SIZE);
				
				if(readCount < BUFFER_SIZE) { // 읽어들인 크기가 buf의 크기보다 작다면
					break;                    // EOF 파일의 끝이 포함되어 있으므로 루프 탈출
				}
			}
			
			fis.close();
			fos.close();
			
			System.out.println(srcfile.getPath() + "를 " + destfile.getPath() + "로 복사하였습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류.");
		}
	}
}
