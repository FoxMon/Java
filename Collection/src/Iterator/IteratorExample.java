package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	private ArrayList<String> urlList = new ArrayList<String>();
	
	public void init() {
		urlList.add("http://www.naver.com");
		urlList.add("http://www.facebook.com");
		urlList.add("http://www.daum.net");
	}
	
	public void execute() {
		for(int i = 0; i < urlList.size(); i++) {
			System.out.println("URL : " + urlList.get(i));
		}
		System.out.println();
		
		for(String url : urlList) {
			System.out.println("URL : " + url);
		}
		System.out.println();
		
		Iterator<String> iter = urlList.iterator();
		
		while(iter.hasNext()) {
			System.out.println("URL : " + (String)iter.next());
		}
	}
	
	public static void main(String[] args) {
		IteratorExample example = new IteratorExample();
		
		example.init();
		example.execute();
	}
}
