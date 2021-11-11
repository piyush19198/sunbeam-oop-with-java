package com.app.threads;

public class EvenThread extends Thread{
		private int start, end;

		public EvenThread(String name, int start, int end) {
			super(name);
			this.start = start;
			this.end = end;
			start();
		}
		
		@Override
		public void run() {
			try {
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						System.out.println("Even Number:" + i);
					}
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
