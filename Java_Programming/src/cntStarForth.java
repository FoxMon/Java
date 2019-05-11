import java.util.Scanner;

public class cntStarForth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("º°Âï±â °³¼ö!>>");
		int cntStar;	
		cntStar = scan.nextInt();
	
		for(int i = 0;i<cntStar;i++) {
			for(int j = 0;j<cntStar;j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}