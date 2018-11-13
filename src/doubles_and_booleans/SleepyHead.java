package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		int equal = JOptionPane.showConfirmDialog(null, "Is it a weekday", "Sleepy Head",
				JOptionPane.YES_NO_CANCEL_OPTION);

		System.out.println(equal);
		if (equal == 0) {
			isWeekday = true;
			equal = JOptionPane.showConfirmDialog(null, "Are you in vaction", "Sleepy Head",
					JOptionPane.YES_NO_CANCEL_OPTION);
			     if(equal==1) {
			    	isVacation=true;
			    	 JOptionPane.showMessageDialog(null, "get up lazybones");
			     }
			     else if(equal==1);
			     isVacation=false;
			     JOptionPane.showMessageDialog(null, "sleep in");
		} else if (equal == 1) {
			isWeekday = false;
			JOptionPane.showMessageDialog(null,"sleep in");
		}
		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print "sleep in if it" is a vacation or a weekend. If it's a weekday, print
		 * "get up lazybones" If it is a weekday, and we are on vacation, print
		 * "sleep in".
		 */
	}
}
