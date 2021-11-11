package com.app.threads;

public class OddThread extends Thread{
		private int start, end;

		public OddThread(String name, int start, int end) {
			super(name);
			this.start = start;
			this.end = end;
			start();
		}

		@Override
		public void run() {
			try {
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						System.out.println("Odd Number:" + i);
					}
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
