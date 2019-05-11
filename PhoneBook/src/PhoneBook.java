import java.util.Scanner;

class Phone{
	private String name; // 사람이름
	private String tel; // 전화번호
	
	public String getName() { // 접근자
		return this.name;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public Phone(String name, String tel) { // 생성자
		this.name = name;
		this.tel = tel;
	}
}

public class PhoneBook{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Phone[] info;
		int peridx; // 인원수
		int cnt = 0; // 인원수만큼 저장하기 위한 카운트
		
		System.out.print("인원수>>");
		peridx = scan.nextInt(); // 인원수 지정
		info = new Phone[peridx]; // Phone 클래스에 대한 레퍼런스 배열 생성
		
		while(true) { // 이름과 전화번호 저장
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String pname, ptel;
			pname = scan.next();
			ptel = scan.next();
			info[cnt] = new Phone(pname, ptel); // 베열의 각 원소에 대한 객체 생성
			cnt++;
			
			if(cnt==peridx) { // 인원수만큼 저장 완료 시, 입력 종료
				System.out.println("저장되었습니다.........");
				break;
			}
		}
		
		while(true) {
			String search;
			
			System.out.print("검색할 이름>>");
			search = scan.next();
			
			if(search.equals("그만")) { // 그만일 경우 종료
				scan.close();
				System.out.println("검색을 종료합니다......");
				break;
			}
			
			for(int i = 0;i<info.length;i++) {
				if(search.equals(info[i].getName())) { // 같을 경우 출력후 바로 종료
					System.out.println(search+"의 번호는 "+info[i].getTel()+"입니다.");
					break;
				}
				else if(i == (info.length)-1) {
					System.out.println(search+" 이 없습니다.");
				}
			}
		}
	}
}