package variables_and_conditionals;

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 27th";
		String dadsBirthday = "September 12th";
		String myBirthday = "November 24th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String userbirthday = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		// 4. if user asked for "mom"
			//print mom's birthday
		if (userbirthday.equalsIgnoreCase("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);	
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if  (userbirthday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);	
			}
		// 6. if user asked for your name
			// print myBirthday
		else if (userbirthday.equalsIgnoreCase("arnav")) {
			JOptionPane.showMessageDialog(null, myBirthday);	
			}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday...");
		}
	} 
}
