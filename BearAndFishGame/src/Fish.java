public class Fish extends GameObject {
	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	
	@Override
	public void move() { // 물고기가 한 번 움직이는 과정
		int startPlace;
		
		startPlace = (int)(Math.random()*5); // 0~5까지 임의의 수
		// 3~5까지는 정지임
		if(startPlace == 0) { // 0일때는 움직이고
			x += distance;
		}
		else if(startPlace == 1) { // 1일때도 움직임
			x -= distance;
		}
		
		if(x < 0) { // 맵 밖을 나가려는경우
			x = 0;
		}
		if(x >= Game.MaxX) {
			x = Game.MaxX - 1;
		}
		
		startPlace = (int)(Math.random()*5); // 0~5까지 임의의 수
		
		if(startPlace == 0) {
			y += distance;
		}
		else if(startPlace == 1) {
			y -= distance;
		}
		
		if(y < 0) { // 멥 밖을 나가려는 경우
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
