package com.bl.multithreading;

public class NumberThread extends Thread{

	@Override
	public void run() {
		for(int i = 1;i <= 100; i++) {
			System.out.println(i);
		}
	}
}
