public class Converter {
	private double rate; // 1�޷��� ���� ��ȭ
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double toDollar(double won) {
		return won/rate; // ��ȭ�� �޷���
	}
	
	public double toKWR(double dollar) {
		return dollar*rate; // �޷��� ��ȭ��
	}
}
