package com.my.first.java;

import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		boolean running = true;
		while(running) {
		System.out.println("Welcome to Sameer's random nuber generator");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Upper limit number:");
		int upperLimit = sc.nextInt();
		System.out.print("Enter Lower limit number:");
		int lowerLimit = sc.nextInt();
		Random random = new Random();
		int userInputNumber = random.nextInt(upperLimit - lowerLimit) + lowerLimit;
		System.out.println("A random number between " + lowerLimit+ " and " + upperLimit + " = " + userInputNumber);
	}
	}

}
