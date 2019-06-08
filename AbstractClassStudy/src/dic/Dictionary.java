package dic;

import map.PairMap;

public class Dictionary extends PairMap{
	private int len; // �迭�� ����
	private int size = 0; // �迭�� ���� ����� ���� ����
	
	public Dictionary() {
		this(0);
	}
	
	public Dictionary(int len) {
		this.len = len; // ���̸� len���� �ʱ�ȭ
		
		keyArray = new String[this.len]; // key�迭 ����
		valueArray = new String[this.len]; // value�迭 ����
	}
	
	@Override
	public String getValue(String key) {
		int idx;
		
		for(int i = 0; i < len; i++) {
			if(keyArray[i].equals(key)) { // key���� ���� ���� �ִٸ�
				idx = i;
				
				return valueArray[idx]; // ������ �ش� value ��ȯ
			}
		}
		
		return null; // ������ null ��ȯ
	}
	
	@Override
	public void setKeyAndValue(String key, String value) {
		keyArray[size] = key;
		valueArray[size] = value;
		size++;
		
		// ���� ���� �ִ��� Ȯ���ϱ� ���ؼ�
		for(int i = 0; i < len; i++) {
			if(keyArray[i].equals(key)) { // key���� ���� ���� ���ٸ�
				valueArray[i] = value; // value�� ����
				
				return; // �׸��� �Լ� ����
			}
		}
	}
	
	@Override
	public String delete(String key) {
		for(int i = 0; i < size; i++) {
			if(keyArray[i].equals(key)) { // key���� value null�� ����
				valueArray[i] = null;
			}
		}
		
		return null;
	}
	
	@Override
	public int length() { // �迭�� ���� ����� ũ�� ���� (����)
		return size;
	}
}
