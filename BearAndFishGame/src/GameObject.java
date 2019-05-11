public abstract class GameObject {
	protected int distance; // �� �� �̵��Ÿ�
	protected int x, y; // ���� ��ġ
	
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean collide(GameObject p) { // �浹���� ���
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected abstract void move(); // �������̵� �ʿ�
	protected abstract char getShape(); // �������̵� �ʿ�
}
