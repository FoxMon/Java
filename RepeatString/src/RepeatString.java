import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s;
		int rNum;
		int cnt;
		
		cnt = scan.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			rNum = scan.nextInt();
			s = scan.next();
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < rNum; k++) {
					char c = s.charAt(j);
					System.out.print(c);
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
