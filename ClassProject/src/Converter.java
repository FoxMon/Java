public class Converter {
	private double rate; // 1달러에 대한 원화
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double toDollar(double won) {
		return won/rate; // 원화를 달러로
	}
	
	public double toKWR(double dollar) {
		return dollar*rate; // 달러를 원화로
	}
}
