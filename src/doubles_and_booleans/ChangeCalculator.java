package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
 String amt=JOptionPane.showInputDialog("how many nickels do you have");
		int am= Integer.parseInt(amt);
 String dime =JOptionPane.showInputDialog("how many dimes do you have");
       int ime=Integer.parseInt(dime);
 String quarters=JOptionPane.showInputDialog("how many quarter do you have");
 int arters=Integer.parseInt(quarters);
 double money =0.0;
 money+=0.05*am;
 money+=0.10*ime;
 money+=0.25*arters;
System.out.println(money);
 // Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

