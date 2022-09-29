package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
;	public static LocalDate today = LocalDate.now();
	public static DataCollector dc = new DataCollector(input);
	
	public static double miles;
	public static int cals;
	public String mood;
	public static int bedTime;
	public static int sleepTime;
	public static String userInput;
	
	public static boolean running = true;
	
	public static void main(String[] args) {
		while(running) {
			System.out.printf("Welcome to LifeApp, today is %s\n", today);
			System.out.print("What would you like to do? [1. Enter Data] [2. Get Report]\n> ");
			userInput = input.nextLine();
			switch (userInput) {
			case "1":
				dc.collector();
				break;
			default:
				System.out.println("I did not understand that input");
			}
			System.out.print("Would you like to contiue? [yes] [no]\n> ");
			userInput = input.nextLine();
			running = (userInput.charAt(0) == 'y');
		}
		input.close();
		System.out.println(miles);
	}
}
