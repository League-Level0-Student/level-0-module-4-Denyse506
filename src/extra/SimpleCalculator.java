package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String input=JOptionPane.showInputDialog("What number do you want with digit?");
		int num=Integer.parseInt(input);
		String put=JOptionPane.showInputDialog("What number do you want with digit?");
		int am=Integer.parseInt(put);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, " ", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
if (operation==0) {
	add(num,am);
}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	static void add(int num,int am) {
		JOptionPane.showMessageDialog(null, ""+num+"+"+am+"="+(num+am));
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}