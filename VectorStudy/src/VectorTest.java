import java.util.Scanner;
import java.util.Vector;

public class VectorTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>(); // 벡터객체
		int idx = 0; // 인덱스파악
		int max; // 최대값
		
		System.out.print("정수(-1이 입력될 때까지)>> "); // 양수만 저장
		while(true) {
			v.add(scan.nextInt());
			
			if(v.get(idx) == -1) { // -1이면 그 인덱스 삭제 후 반복문 탈출
				v.remove(idx);
				break;
			}
			idx++;
		}
		
		max = v.get(0); // amx에 먼저 0번째 인덱스 저장
		
		for(int i = 1; i < v.size(); i++) { // 최댓값 출력
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
		
		System.out.println("가장 큰 수는 " + max); // max값 출력
		
		scan.close();
	}
}