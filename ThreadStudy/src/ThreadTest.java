public class ThreadTest {
	public static void main(String[] args) {
		CounterThread counterTH = new CounterThread(); // Inner class를 static으로 안 할경우 오류발생
		
		counterTH.start();
		
		Thread counterRU = new Thread(new CounterRunnable());
		
		counterRU.start();
		
		// sleep을 걸면 스케쥴링이 섞이는 것을 확인할 수 있다.
		for(int i = 0; i < 10; i++) { // number count
			System.out.println("[" + Thread.currentThread().getName() + "]" + "Count : " + i);
			
			if(i == 7) { // flag를 걸어서 Thread를 종료시킴
				counterTH.clearFlag();
			}
			
			try { // main Thread에서도 시간을 더 길게해서 스케쥴링이 섞이는지 확인해 보도록 한다.
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Thread class 상속받음
	private static class CounterThread extends Thread{ // Inner class
		private boolean mflag = true; // Thread의 종료조건 flag를 걸어줌
		
		@Override
		public void run() {
//			super.run();
			
			for(int i = 0; i < 10; i++) { // number count
				if(mflag == false) { // flag가 false되면 종료시킴
					return;	
				}
				
				System.out.println("[" + getName() + "]" + "Count : " + i);
				
				// Thread의 스케줄링이 섞이는지 확인하기 위해서 sleep을 걸어 시간을 더 길게 끌어줌
				try {
					Thread.sleep(1000);; // 단위가 밀리세컨드이다. 따라서 1000이 1초
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		// 일반적으로 Thread는 flag를 달고감
		public void clearFlag() { // flag를 false로 바꿔줌
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
