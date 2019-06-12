public class ThreadTest {
	public static void main(String[] args) {
		CounterThread counterTH = new CounterThread(); // Inner class�� static���� �� �Ұ�� �����߻�
		
		counterTH.start();
		
		Thread counterRU = new Thread(new CounterRunnable());
		
		counterRU.start();
		
		// sleep�� �ɸ� �����층�� ���̴� ���� Ȯ���� �� �ִ�.
		for(int i = 0; i < 10; i++) { // number count
			System.out.println("[" + Thread.currentThread().getName() + "]" + "Count : " + i);
			
			if(i == 7) { // flag�� �ɾ Thread�� �����Ŵ
				counterTH.clearFlag();
			}
			
			try { // main Thread������ �ð��� �� ����ؼ� �����층�� ���̴��� Ȯ���� ������ �Ѵ�.
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Thread class ��ӹ���
	private static class CounterThread extends Thread{ // Inner class
		private boolean mflag = true; // Thread�� �������� flag�� �ɾ���
		
		@Override
		public void run() {
//			super.run();
			
			for(int i = 0; i < 10; i++) { // number count
				if(mflag == false) { // flag�� false�Ǹ� �����Ŵ
					return;	
				}
				
				System.out.println("[" + getName() + "]" + "Count : " + i);
				
				// Thread�� �����ٸ��� ���̴��� Ȯ���ϱ� ���ؼ� sleep�� �ɾ� �ð��� �� ��� ������
				try {
					Thread.sleep(1000);; // ������ �и��������̴�. ���� 1000�� 1��
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		// �Ϲ������� Thread�� flag�� �ް�
		public void clearFlag() { // flag�� false�� �ٲ���
			this.mflag = false;	
		}
	}
	
	// Runnable Thread
	private static class CounterRunnable implements Runnable{
		
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) { // number count
				System.out.println("[" + Thread.currentThread().getName() + "]" + "Count : " + i);
				
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
