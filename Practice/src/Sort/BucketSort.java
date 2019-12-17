package Sort;

public class BucketSort {
	public static void sort(int[] a, int R) {
		int[] bucket = new int[R];
		
		for(int i = 0; i < R; i++) { // �ʱ�ȭ
			bucket[i] = 0;
		}
		
		for(int i = 0; i < a.length; i++) { // a�� ���Ұ� bucket�迭�� �ε����� ��
			bucket[a[i]]++;  // �� �󵵼��� ����ϰ� �Ǵ� ���� ( STEP 1. )
		}
		
		int j = 0;
		
		for(int i = 0; i < R; i++) { // ( STEP 2. )
			while((bucket[i]--) != 0) { // ��Ŷ i�� ����� �󵵼��� 0�� �� ������
				a[j++] = i; // ��Ŷ �ε��� i�� ����
			}
		}
	}
}
