package app;
import base.Shape;
import derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle(); // 업 캐스팅
		shape.draw(); // 동적바인딩
	}
}
