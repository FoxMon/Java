package dic;

import map.PairMap;

public class Dictionary extends PairMap{
	private int len; // 배열의 길이
	private int size = 0; // 배열에 현재 저장된 값의 길이
	
	public Dictionary() {
		this(0);
	}
	
	public Dictionary(int len) {
		this.len = len; // 길이를 len으로 초기화
		
		keyArray = new String[this.len]; // key배열 생성
		valueArray = new String[this.len]; // value배열 생성
	}
	
	@Override
	public String getValue(String key) {
		int idx;
		
		for(int i = 0; i < len; i++) {
			if(keyArray[i].equals(key)) { // key값과 같은 값이 있다면
				idx = i;
				
				return valueArray[idx]; // 있으면 해당 value 반환
			}
		}
		
		return null; // 없으면 null 반환
	}
	
	@Override
	public void setKeyAndValue(String key, String value) {
		keyArray[size] = key;
		valueArray[size] = value;
		size++;
		
		// 같은 값이 있는지 확인하기 위해서
		for(int i = 0; i < len; i++) {
			if(keyArray[i].equals(key)) { // key값이 기존 값과 같다면
				valueArray[i] = value; // value값 수정
				
				return; // 그리고 함수 종료
			}
		}
	}
	
	@Override
	public String delete(String key) {
		for(int i = 0; i < size; i++) {
			if(keyArray[i].equals(key)) { // key값의 value null로 삭제
				valueArray[i] = null;
			}
		}
		
		return null;
	}
	
	@Override
	public int length() { // 배열의 현재 저장된 크기 리턴 (개수)
		return size;
	}
}
