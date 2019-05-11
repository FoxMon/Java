import java.util.Scanner;

public class cntStarFirst {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("º°Âï±â °³¼ö!>>");
		int cntStar;	
		cntStar = scan.nextInt();
	
		for(int i = 0;i<cntStar;i++) {
			for(int j = cntStar;j>0;j--) {
				if(j-1>i) {
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