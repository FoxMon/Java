import java.util.Scanner;

public class cntStarThird {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� ����!>>");
		int cntStar;	
		cntStar = scan.nextInt();
	
		for(int i = 0;i<cntStar;i++) {
			for(int j = cntStar;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}