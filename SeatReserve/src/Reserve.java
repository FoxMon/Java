import java.util.Scanner;

class ConcertReserve{
	private String[][] seat = new String[][] {{"S>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
			{"A>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
			{"B>>", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"}}; // 초기배열
	Scanner scan = new Scanner(System.in);
	public void seatReserve() { // 예약시스템 함수
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			int option; // 옵션변수
			
			System.out.print("예약:1, 조회:2, 취소3, 끝내기4>>");
			option = scan.nextInt(); // 옵션 선택
			if(option == 1) {
				int seatIdx; // 좌석 행 구분
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				seatIdx = scan.nextInt(); // 좌석 행 선택
				
				int seatnum; // 좌석번호
				String name; // 고객이름
				
				for(int i = 0;i<seat[seatIdx-1].length;i++) { // 선택한 행의 좌석상태
					System.out.print(seat[seatIdx-1][i]+" ");
				}
				System.out.println();
				System.out.print("번호>>");
				seatnum = scan.nextInt();
				System.out.print("이름>>");
				name = scan.next();
				seat[seatIdx-1][seatnum] = name; // 예약완료
			}
			else if(option == 2) { // 현재 좌석상태 조회
				for(int i = 0;i<seat.length;i++) {
					for(int j = 0;j<seat[i].length;j++) {
						System.out.print(seat[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("<<<조회를 완료하였습니다.>>>");
			}
			else if(option == 3) { // 예약 취소
				int seatIdx; // 좌석 행 구분
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				seatIdx = scan.nextInt();
				
				for(int i = 0;i<seat[seatIdx-1].length;i++) { // 선택한 행의 좌석상태
					System.out.print(seat[seatIdx-1][i]+" ");
				}
				System.out.println();
				System.out.print("이름>>");
				String name; // 고객이름
				name = scan.next();
				
				for(int i = 0;i<seat[seatIdx-1].length;i++) {
					if(seat[seatIdx-1][i].equals(name)) { // 비교해서 같은 이름 삭제
						seat[seatIdx-1][i] = "---";
						break;
					}
				}
			}
			else if(option == 4){
				scan.close(); // 스캐너 닫고 
				break; // 반복문 종료
			}
			else {
				System.out.println("없는 옵션입니다. 다시 선택해 주세요.");
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