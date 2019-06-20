public class Practice{
	public static void main(String[] args) {
		CountThread ct = new CountThread();
		
		ct.start();
		
		Thread ctr = new Thread(new CountRunnable());
		
		ctr.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + "Count : " + i);
			
			if(i == 7) {
				ct.clear();
			}
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static class CountThread extends Thread{
		boolean mflag = true;
		
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.println("[" + getName() + "]" + "Count : " + i);
				
				if(mflag == false) {
					return;
				}
				
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		public void clear() {
			this.mflag = false;
		}
	}
	
	private static class CountRunnable implements Runnable{
		
		@Override
		public void run() {
			for(int i = 0; i < 10; i++) {
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