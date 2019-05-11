import java.util.Scanner;

class Day{
	private String work;
	
	public void setWork(String work) {
		this.work = work;
	}
	
	public String getWork() {
		return work;
	}
	
	public void show() {
		if(work == null) {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println(work+"�Դϴ�.");
		}
	}
}
	
class MonthSchedule{
	private Day[] schedule = null;
	private int date;
	
	Scanner scan = new Scanner(System.in);
	
	MonthSchedule(int date){
		this.date = date;
		schedule = new Day[date];
	}
	
	public void run() {
		int option;
		
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			option = scan.nextInt();
		
			if(option == 1) {
				input(date);
			}
			else if(option == 2) {
				view(date);
			}
			else {
				finish();
				break;
			}
		}
	}
	
	public void input(int date) {
		int dateidx;
		
		System.out.print("��¥(1~"+date+")?");
		dateidx = scan.nextInt();
		schedule[dateidx-1] = new Day();
		System.out.print("����(��ĭ�����Է�)?");
		schedule[dateidx-1].setWork(scan.next());
	}
	
	public void view(int date) {
		int dateidx;
		
		System.out.print("(��¥1~"+date+")?");
		dateidx = scan.nextInt();
		System.out.print(dateidx+"���� �� ���� ");
		schedule[dateidx-1].show();
	}
	
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
}

public class MonthScheduler{
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		
		april.run();
	}
}