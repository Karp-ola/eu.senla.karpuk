package eu.selna.test;

import java.util.Scanner;

import eu.selna.rainbow.Rainbow;

public class Test {
	public static void main(String[] args) {
	
		short selectionOfOption;
		
		Rainbow rainbow = new Rainbow();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("In order to get a color of rainbow - type 1");
			System.out.println("In order to get a shade of rainbow's colours - type 2");
			selectionOfOption = scn.nextShort();
			if(selectionOfOption == 1 || selectionOfOption == 2) {
				break;
			}
		}
		
		switch(selectionOfOption) {
		case 1:
			rainbow.whatColorIsThisNumber();
			break;
		case 2:
			 rainbow.whatShadeIsTwoColours();
			break;
		default:
			break;
		
		}
	}

	
}	
