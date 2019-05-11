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
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work+"입니다.");
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
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
		
		System.out.print("날짜(1~"+date+")?");
		dateidx = scan.nextInt();
		schedule[dateidx-1] = new Day();
		System.out.print("할일(빈칸없이입력)?");
		schedule[dateidx-1].setWork(scan.next());
	}
	
	public void view(int date) {
		int dateidx;
		
		System.out.print("(날짜1~"+date+")?");
		dateidx = scan.nextInt();
		System.out.print(dateidx+"일의 할 일은 ");
		schedule[dateidx-1].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
}

public class MonthScheduler{
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		
		april.run();
	}
}