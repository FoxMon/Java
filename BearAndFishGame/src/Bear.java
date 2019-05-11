import java.util.Scanner;

public class Bear extends GameObject {
	private Scanner scan;
	
	public Bear(int x, int y, int distance) {
		super(x, y, distance); // ����Ŭ���� ������ ȣ��
		scan = new Scanner(System.in); // ������ ȣ�� �ÿ��� String ��ü ����
	}
	
	@Override
	public void move() {
		char c;
		
		System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >> ");
		c = scan.next().charAt(0); // ���ڿ��� ���ڷ� �ٲ۴�.
		
		switch(c) {
		case 'a': // ����
			if(x < 0) {
				x = 0;
			}
			else {
				x -= distance;
			}
			break;
		case 's': // �Ʒ�
			if(y >= Game.MaxY) { // �� ���̶�� ?
				y = Game.MaxY - 1;
			}
			else {
				y += distance;
			}
			break;
		case 'd': // ��
			if(y < 0) {
				y = 0;
			}
			else {
				y -= distance;
			}
			break;
		case 'f': // ������
			if(x >= Game.MaxX) { // �� ���̶�� ?
				x = Game.MaxX - 1;
			}
			else {
				x += distance;
			}
			break;
		}
	}
	
	@Override
	public char getShape() {
		return 'B';
	}
}
