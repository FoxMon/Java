package Sort;

public class LSDsort {
	public static void sort(int[] a) {
		int R = 10;
		int N = a.length;
		int[] t = new int[N];
		
		for(int k = 10; k <= 1000; k *=10) {
			int[] startIndex = new int[R+1];
			
			for(int i = 0; i < N; i++) { // �󵵼� ���
				startIndex[(a[i]%k)/(k/10) + 1]++;
			}
			
			for(int r = 0; r < R; r++) { // �� ��Ŷ �ε��� ���� ����� �� t�� ���� �ε��� ���
				startIndex[r+1] += startIndex[r];
			}
			
			for(int i = 0; i < N; i++) { // a[i]�� �迭 t�� ���ʷ� ����
				t[startIndex[(a[i]%k)/(k/10)]++] = a[i];
			}
			
			for(int i = 0; i < N; i++) { // �迭 t�� �迭 a�� ����
				a[i] = t[i];
			}
		}
	}
}