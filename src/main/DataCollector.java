package main;

import java.util.Scanner;

public class DataCollector {
	
	public Scanner input;
	
	public DataCollector(Scanner input) {
		this.input = input;
	}
	
	public void collector() {
		System.out.println("What kind of data would you like to collect?");
		System.out.println("[1. miles] [2. cals] [3. mood] [4. bedTime] [5. sleepTime]");
		collectMiles();
	}
	
	public void collectMiles() {
		System.out.print("How many miles did you ride today?\n> ");
		Main.miles = input.nextDouble();
	}
	
}