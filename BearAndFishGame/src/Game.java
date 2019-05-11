public class Game {
	public static final int MaxX = 20;
	public static final int MaxY = 10;
	private char[][] map = new char[MaxY][MaxX]; // ������ ��
	private GameObject[] animal = new GameObject[2]; // �߻�Ŭ���� �迭 2�� ����
	
	public Game() { // ������ �� �ʱ�ȭ
		for(int i = 0; i < MaxY; i++) {
			for(int j = 0; j < MaxX; j++) {
				map[i][j] = '-';
			}
		}
		
		animal[0] = new Bear(0, 0, 1);
		animal[1] = new Fish(5, 5, 2);
	}
	
	public void state() { // ������ ��ġ�� ǥ��
		for(int i = 0;i < animal.length;i++) {
			map[animal[i].getY()][animal[i].getX()] = animal[i].getShape(); // Fish���� �׸�
		}
	}
	
	public void mapShow() { // ������ �� ������
		for(int i = 0; i<map.length;i++) {
			for(int j = 0; j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public void clear() { // ������ �� ����
		for(int i = 0; i < animal.length; i++) {
			map[animal[i].getY()][animal[i].getX()] = '-';
		}
	}
	
	public boolean endGame() {
		if(animal[0].collide(animal[1])) {
			return true; // ���� �̱�
		}
		else {
			return false;
		}
	}
	
	public void start() { // ���� ����
		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�. **");
		
		while(!endGame()) {
			clear(); // ������ �� ����� �ٽ�
			
			for(int i = 0; i < animal.length; i++) { // �������� ���� ������
				animal[i].move();
			}
			
			state(); // ������ ��ġ ����
			mapShow(); // �� ������
		}
		
		System.out.println("** Bear Win !! **");
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}
