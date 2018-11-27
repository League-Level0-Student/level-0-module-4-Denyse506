package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static	int happines=0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String Type =JOptionPane.showInputDialog("what type of of pets will you have");
	
// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).

			//    Make sure to customize the title and question too.
for (int i = 0; i < 10; i++) {
	

int ant = JOptionPane.showOptionDialog(null, "What will you do to show happpiness to your pet", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "groom" }, null);
	
		
			
			// 5. Use user input to call the appropriate method created in step 4.
		
			if(ant==0) {
        	 feed();
         }else if(ant==1) {
        	 cuddle();
         } else if(ant==2) {
        	 groom();
         }
}
            
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
               for (int i = 0; i < args.length; i++) {
				
			}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}
static void feed() {
	JOptionPane.showMessageDialog(null, "wag tail");
	happines++;
}

static void cuddle() {
	JOptionPane.showMessageDialog(null, "happy");
	happines++;
}
static void groom() {
	JOptionPane.showMessageDialog(null,"nice");
	
}
}