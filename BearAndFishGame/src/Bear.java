import java.util.Scanner;

public class Bear extends GameObject {
	private Scanner scan;
	
	public Bear(int x, int y, int distance) {
		super(x, y, distance); // 슈퍼클래스 생성자 호출
		scan = new Scanner(System.in); // 생성자 호출 시에만 String 객체 생성
	}
	
	@Override
	public void move() {
		char c;
		
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		c = scan.next().charAt(0); // 문자열을 문자로 바꾼다.
		
		switch(c) {
		case 'a': // 왼쪽
			if(x < 0) {
				x = 0;
			}
			else {
				x -= distance;
			}
			break;
		case 's': // 아래
			if(y >= Game.MaxY) { // 맵 밖이라면 ?
				y = Game.MaxY - 1;
			}
			else {
				y += distance;
			}
			break;
		case 'd': // 위
			if(y < 0) {
				y = 0;
			}
			else {
				y -= distance;
			}
			break;
		case 'f': // 오른쪽
			if(x >= Game.MaxX) { // 맵 밖이라면 ?
				x = Game.MaxX - 1;
			}
			else {
				x += distance;
			}
			break;
		}
	}
	
	@Override
	public char getShape() {
		return 'B';
	}
}
