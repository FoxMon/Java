package SelectionSort;

import java.lang.Comparable;

public class Selection {
	public static void srot(Comparable[] a) {
		int n = a.length; // �迭�� ����
		
		for(int i = 0; i < n; i++) {
			int min = i;
			
			for(int j = i + 1; j < n; j++) { // min ã��
				if(isless(a[j], a[min])) {
					min = j;
				}
			}
			
			swap(a, i, min); // min�� a[i] ��ȯ
		}
	}
	
	private static boolean isless(Comparable i, Comparable j) { // Ű ��
		return (i.compareTo(j) < 0);
	}
	
	private static void swap(Comparable[] a, int i, int j) { // ���� ��ȯ
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		
	}
}