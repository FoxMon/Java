import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Converter conv = new Converter();
		double rate;
		
		System.out.print("환율(1달러)>> ");
		rate = scan.nextDouble();
		conv.setRate(rate); // 설정자로 rate값 설정 (환율을 설정한 것임)
		
		System.out.println("백만원은 $"+conv.toDollar(1000000)+"입니다");
		System.out.println("$100는 "+conv.toKWR(100)+"원입니다");
		
		scan.close();
	}
}
