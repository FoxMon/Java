public class Person {
	private String name; // User의 이름
	private int[] randomNumber = new int[3]; // 난수 3개 저장
	
	public Person(String name) {
		this.name = name; // 이름 초기화
	}
	
	public String getName() {
		return this.name; // 이름 접근자
	}
	
	public void setNum(int[] num) {
		randomNumber = num; // 난수 설정자
	}
	
	public void showNum() {
		System.out.println("\t" + randomNumber[0] + "\t" +  randomNumber[1] + "\t" + randomNumber[2]);
	}
	
	public int[] getNum() {
		return randomNumber; // 난수 접근자
	}
}
