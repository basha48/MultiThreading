package com.bl.multithreading;

public class CharacterRunnable implements Runnable{

	@Override
	public void run() {
		for(char a ='a';a <= 'z'; a++) {
			System.out.println(a);
		}
	}

}
