import java.util.Scanner;
import java.util.Vector;

public class VectorTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>(); // ���Ͱ�ü
		int idx = 0; // �ε����ľ�
		int max; // �ִ밪
		
		System.out.print("����(-1�� �Էµ� ������)>> "); // ����� ����
		while(true) {
			v.add(scan.nextInt());
			
			if(v.get(idx) == -1) { // -1�̸� �� �ε��� ���� �� �ݺ��� Ż��
				v.remove(idx);
				break;
			}
			idx++;
		}
		
		max = v.get(0); // amx�� ���� 0��° �ε��� ����
		
		for(int i = 1; i < v.size(); i++) { // �ִ� ���
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
		
		System.out.println("���� ū ���� " + max); // max�� ���
		
		scan.close();
	}
}