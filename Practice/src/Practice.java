public class Practice {
	public static void main(String[] args) {
		CounterThread ct = new CounterThread();
		
		 ct.start();
		 
		 Thread cr = new Thread(new CounterRunnable());
		 
		 cr.start();
		 
		// 0 ~ 9까지 카운트
		for(int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] " + "Count : " + i);
			
			if(i == 7) {
				ct.clearFlag();
			}
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static class CounterThread extends Thread {
		private boolean mflag = true;
		
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				if(mflag == false) {
					return;
				}
				
				System.out.println("[" + getName() + "] " + "Count : " + i);
			
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		public void clearFlag() {
			this.mflag = false;
		}
	}
	
	private static class CounterRunnable implements Runnable {
		
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.println("[" + Thread.currentThread().getName() + "] " + "Count : " + i);
			
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		} 
	}
}