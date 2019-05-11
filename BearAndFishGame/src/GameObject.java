public abstract class GameObject {
	protected int distance; // 한 번 이동거리
	protected int x, y; // 현재 위치
	
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
	
	public boolean collide(GameObject p) { // 충돌여부 계산
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected abstract void move(); // 오버라이딩 필요
	protected abstract char getShape(); // 오버라이딩 필요
}
