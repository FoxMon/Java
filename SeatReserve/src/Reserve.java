import java.util.Scanner;

class ConcertReserve{
	private String[][] seat = new String[][] {{"S>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
			{"A>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
			{"B>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"}}; // �ʱ�迭
	Scanner scan = new Scanner(System.in);
	public void seatReserve() { // ����ý��� �Լ�
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(true) {
			int option; // �ɼǺ���
			
			System.out.print("����:1, ��ȸ:2, ���3, ������4>>");
			option = scan.nextInt(); // �ɼ� ����
			if(option == 1) {
				int seatIdx; // �¼� �� ����
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				seatIdx = scan.nextInt(); // �¼� �� ����
				
				int seatnum; // �¼���ȣ
				String name; // ���̸�
				
				for(int i = 0;i<seat[seatIdx-1].length;i++) { // ������ ���� �¼�����
					System.out.print(seat[seatIdx-1][i]+" ");
				}
				System.out.println();
				System.out.print("��ȣ>>");
				seatnum = scan.nextInt();
				System.out.print("�̸�>>");
				name = scan.next();
				seat[seatIdx-1][seatnum] = name; // ����Ϸ�
			}
			else if(option == 2) { // ���� �¼����� ��ȸ
				for(int i = 0;i<seat.length;i++) {
					for(int j = 0;j<seat[i].length;j++) {
						System.out.print(seat[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}
			else if(option == 3) { // ���� ���
				int seatIdx; // �¼� �� ����
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				seatIdx = scan.nextInt();
				
				for(int i = 0;i<seat[seatIdx-1].length;i++) { // ������ ���� �¼�����
					System.out.print(seat[seatIdx-1][i]+" ");
				}
				System.out.println();
				System.out.print("�̸�>>");
				String name; // ���̸�
				name = scan.next();
				
				for(int i = 0;i<seat[seatIdx-1].length;i++) {
					if(seat[seatIdx-1][i].equals(name)) { // ���ؼ� ���� �̸� ����
						seat[seatIdx-1][i] = "---";
						break;
					}
				}
			}
			else if(option == 4){
				scan.close(); // ��ĳ�� �ݰ� 
				break; // �ݺ��� ����
			}
			else {
				System.out.println("���� �ɼ��Դϴ�. �ٽ� ������ �ּ���.");
			}
		}
	}
}

public class Reserve{
	public static void main(String[] args) {
		ConcertReserve r = new ConcertReserve();
		r.seatReserve();
	}
}