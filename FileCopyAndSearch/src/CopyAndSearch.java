import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class CopyAndSearch {
	private File srcfile = null; // ���� ����
	private FileInputStream fis = null; // ���̳ʸ�
	private InputStreamReader isr = null; // ����
	private BufferedReader br = null; // ���� ����
	private Vector<String> stringVector = new Vector<String>();
	
	public void readFile(String fileName) { // ������ ���� -> ���Ϳ� ������ ����
		srcfile = new File(fileName);
		
		String line;
		
		try {
			fis = new FileInputStream(srcfile);
			isr = new InputStreamReader(fis, "MS949");
			br = new BufferedReader(isr);
			
			while((line = br.readLine()) != null) { // ���ٷ� ����
				stringVector.add(line); // �� ������ ���Ϳ� �߰���
			}
			
			fis.close();
			br.close();
		} catch(IOException e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
	
	public Vector<Integer> search(String word){ // �ܾ ã�Ƽ� ���� ��ȣ�� ��ȯ�� ����
		Vector<Integer> line = new Vector<Integer>(); // ������ ��ȣ �����ϱ� ����
		
		for(int i = 0; i < stringVector.size(); i++) {
			String tStr = stringVector.get(i);
			
			if(tStr.indexOf(word) != -1) { // word�� �����ϰ� �ִ� �ε�����
				line.add(i); // line ���Ϳ� �ִ´�.
			}
		}
		
		return line;
	}
	
	public void print(Vector<Integer> line) {
		for(int i = 0; i < line.size(); i++) {
			int lineNumber = line.get(i); // auto unboxing ��ü -> �⺻Ÿ��
			String str = stringVector.get(lineNumber); // �ش� �� ��ȣ�� �ش��ϴ� ���ڿ�
			
			System.out.println(lineNumber + ":" + str); // ���
		}
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> line = new Vector<Integer>();
		String file;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		file = scan.nextLine();
		
		readFile(file);
		
		while(true) {
			String word;
			
			System.out.print("�˻��� �ܾ ����>> ");
			word = scan.nextLine();
			
			if(word.equals("�׸�")) { // �׸� �Է� �� �����.
				scan.close();
				
				System.out.println("���α׷��� �����մϴ�...");
				
				break;
			}
			
			line = search(word); // word�� �����ϴ� ��� �ٹ�ȣ�� ��ȯ�� ����
			print(line);
		}
	}
	
	public static void main(String[] args) {
		CopyAndSearch cas = new CopyAndSearch();
		
		cas.start();
	}
}
