package map;

public abstract class PairMap { // key�� value�� �ϳ��� ���������� �����Ѵ�.
	protected String[] keyArray; // key���� �����ϴ� �迭
	protected String[] valueArray; // value���� �����ϴ� �迭
	
	public abstract String getValue(String key); // key������ ���� value ����, ������ null ����
	public abstract void setKeyAndValue(String key, String value); // key�� value ����, ������ key������ value�� ����
	public abstract String delete(String key); // key���� ���� value����, ������ value ����
	public abstract int length(); // ���� ����� �������� ���� ���� 
}
