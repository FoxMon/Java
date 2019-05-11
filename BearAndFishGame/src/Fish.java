public class Fish extends GameObject {
	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	
	@Override
	public void move() { // ����Ⱑ �� �� �����̴� ����
		int startPlace;
		
		startPlace = (int)(Math.random()*5); // 0~5���� ������ ��
		// 3~5������ ������
		if(startPlace == 0) { // 0�϶��� �����̰�
			x += distance;
		}
		else if(startPlace == 1) { // 1�϶��� ������
			x -= distance;
		}
		
		if(x < 0) { // �� ���� �������°��
			x = 0;
		}
		if(x >= Game.MaxX) {
			x = Game.MaxX - 1;
		}
		
		startPlace = (int)(Math.random()*5); // 0~5���� ������ ��
		
		if(startPlace == 0) {
			y += distance;
		}
		else if(startPlace == 1) {
			y -= distance;
		}
		
		if(y < 0) { // �� ���� �������� ���
			y = 0;
		}
		if(y >= Game.MaxY) {
			y = Game.MaxY - 1;
		}
	}
	
	@Override
	public char getShape() {
		return '@';
	}
}
