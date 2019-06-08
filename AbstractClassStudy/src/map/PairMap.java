package map;

public abstract class PairMap { // key와 value를 하나의 아이템으로 저장한다.
	protected String[] keyArray; // key들을 저장하는 배열
	protected String[] valueArray; // value들을 저장하는 배열
	
	public abstract String getValue(String key); // key값들을 가진 value 리턴, 없으면 null 리턴
	public abstract void setKeyAndValue(String key, String value); // key와 value 저장, 기존에 key있으면 value로 수정
	public abstract String delete(String key); // key값을 가진 value삭제, 삭제된 value 리턴
	public abstract int length(); // 현재 저장된 아이템의 개수 리턴 
}
