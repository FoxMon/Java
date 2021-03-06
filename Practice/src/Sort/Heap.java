package Sort;

import java.lang.Comparable;

public class Heap {
	public static void sort(Comparable[] a) {
		int heapSize = a.length - 1;
		
		for(int i = heapSize/2; i > 0; i--) {
			downheap(a, i, heapSize);
		}
		
		while(heapSize > 1) {
			swap(a, 1, heapSize--);
			downheap(a, 1, heapSize);
		}
	}
	
	private static void downheap(Comparable[] a, int p, int heapSize) {
		while(2*p <= heapSize) {
			int s = 2*p;
			
			if(s < heapSize && isless(a[s], a[s+1])) { // 승자로 만들기
				s++;
			}
			
			if(!isless(a[p], a[s])) { // 힙 속성 만족하는 경우
				break;
			}
			
			swap(a, p, s); // 교환
			p = s;
		}
	}
	
	public static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static boolean isless(Comparable i, Comparable j) {
		return (i.compareTo(j) < 0);
	}
}
