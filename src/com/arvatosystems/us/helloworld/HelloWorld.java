package com.arvatosystems.us.helloworld;

import java.util.Random;

public class HelloWorld {
	public static void main(String[] args) {
		Random r = new Random();
		long sleep = (long) r.nextInt(10000);
		System.out.println("sleeping for " + sleep + " milliseconds");
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			System.out.println("'knock knock'");
			System.out.println("'who's there?'");
			System.out.println("'interupting cow!");
			System.out.println("'interrupting wh..'");
			System.out.println("'MOOOOOOOOOOOOOO!!!'");
		}
		System.out.println("woke up!");
	}
}
