package dicApp;

import dic.Dictionary;

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		
		dic.setKeyAndValue("뀨우", "자바");
		dic.setKeyAndValue("Wow", "Phython");
		dic.setKeyAndValue("Wow", "C++"); // Wow의 값이 C++로 교체 돼야함
		
		System.out.println("Wow의 값은 " + dic.getValue("Wow"));
		System.out.println("뀨우의 값은 " + dic.getValue("뀨우"));
		
		dic.delete("뀨우"); // 뀨우값 삭제
		
		System.out.println("뀨우의 값은 " + dic.getValue("뀨우")); // 삭제된 값 접근 중
	}
}
