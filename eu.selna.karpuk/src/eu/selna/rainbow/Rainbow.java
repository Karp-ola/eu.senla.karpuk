package eu.selna.rainbow;

import java.util.Scanner;

public class Rainbow {
	
	static String[] colours = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
	
	static short number, number1, number2;
	
	static Scanner scn = new Scanner(System.in);
	
	public static void whatColorIsThisNumber() {		
		while(true) {
			System.out.println("Enter the number from 1 to 7");
			number = scn.nextShort();
			if(number>=1 && number <=7) {
				break;
			}
		}
		System.out.println("Number " + number + " corresponds to color " + colours[number-1] );
	}
	
	 static public void whatShadeIsTwoColours() {
		
		while(true) {
			System.out.println("Enter two numbers from 1 to 7");
			number1 = scn.nextShort();
			number2 = scn.nextShort();
			if(number1>=1 && number1<=7 && number2<=7 && number2>=1) {
				break;
			}
		}
		System.out.println("Number " + number1 + " corresponds to color " + colours[number1-1] +
				" and number " + number2 + " corresponds to color " + colours[number2-1] + " and"
						+ " these colours give " + colours[number1-1] + "-" + colours[number2-1]  + " shade."); 
	}

}
