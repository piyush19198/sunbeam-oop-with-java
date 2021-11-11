package com.app.threads;

import tester.MainThread;

public class OddPrinterTask implements Runnable{
	@Override
	public void run() {
		try {
			for (int i = MainThread.getStart(); i <= MainThread.getEnd(); i++) {
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
