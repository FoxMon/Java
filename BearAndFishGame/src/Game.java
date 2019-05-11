public class Game {
	public static final int MaxX = 20;
	public static final int MaxY = 10;
	private char[][] map = new char[MaxY][MaxX]; // 게임의 맵
	private GameObject[] animal = new GameObject[2]; // 추상클래스 배열 2개 생성
	
	public Game() { // 게임의 맵 초기화
		for(int i = 0; i < MaxY; i++) {
			for(int j = 0; j < MaxX; j++) {
				map[i][j] = '-';
			}
		}
		
		animal[0] = new Bear(0, 0, 1);
		animal[1] = new Fish(5, 5, 2);
	}
	
	public void state() { // 동물의 위치를 표현
		for(int i = 0;i < animal.length;i++) {
			map[animal[i].getY()][animal[i].getX()] = animal[i].getShape(); // Fish먼저 그림
		}
	}
	
	public void mapShow() { // 현재의 맵 보여줌
		for(int i = 0; i<map.length;i++) {
			for(int j = 0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public void clear() { // 현재의 맵 지움
		for(int i = 0; i < animal.length; i++) {
			map[animal[i].getY()][animal[i].getX()] = '-';
		}
	}
	
	public boolean endGame() {
		if(animal[0].collide(animal[1])) {
			return true; // 곰이 이김
		}
		else {
			return false;
		}
	}
	
	public void start() { // 게임 시작
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
		
		while(!endGame()) {
			clear(); // 현재의 맵 지우고 다시
			
			for(int i = 0; i < animal.length; i++) { // 동물들이 각자 움직임
				animal[i].move();
			}
			
			state(); // 동물의 위치 설정
			mapShow(); // 맵 보여줌
		}
		
		System.out.println("** Bear Win !! **");
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}
