package for_loops;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);
		// 3. Use the randomNumber to give the user a random compliment.
		
		if(randomNumber == 0){
		JOptionPane.showMessageDialog(null, "You are very athletic!!!!!!!!!!");}
		else if(randomNumber == 1){
		JOptionPane.showMessageDialog(null, "You are very smart!!!!!!!!!!");}
		else if(randomNumber == 2){
		JOptionPane.showMessageDialog(null, "You are very fun to be around!!!!!!!!!!");}
		else if(randomNumber == 3){
		JOptionPane.showMessageDialog(null, "You are very kind!!!!!!!!!!");}
		else if(randomNumber == 4){
		JOptionPane.showMessageDialog(null, "In the future, you will be very successful!!!!!!!!!!");}
					
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}

}
