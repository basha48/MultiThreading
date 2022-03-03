package com.bl.multithreading;

public class Main extends Thread{
	
	public static void main (String[] args) {
		NumberThread numberThread = new NumberThread();
		//numberThread.setDaemon(true);
		
		CharacterRunnable characterRunnable = new CharacterRunnable();
		Thread characterThread = new Thread(characterRunnable);
		
		characterThread.start();
		numberThread.start();
		//characterThread.start();
	}

}
