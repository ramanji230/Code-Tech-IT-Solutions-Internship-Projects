package codeTech.com;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to CodeTech IT Solutions ");
		System.out.println("----------------------------------");
		
		Scanner ip = new Scanner(System.in);
		System.out.println("What is your Name?");
		String name =ip.nextLine();
		
		System.out.println("Well, "+ name + " You have a 5 Chances , I am thinking of a number between 1 to 100 !");
		int myNumber = getRandamNumber(1, 100);
		
		for(int i=0; i<=5; i++) {
			Scanner ip2 = new Scanner(System.in);
			System.out.println("Take a guess.");
			int yourGuess = ip2.nextInt();
			
			if(yourGuess == myNumber) {
				System.out.println("You guessed correctly!");
				break;
			}
			else if(yourGuess <= myNumber) {
				System.out.println("your guess is too low!");
				
			}
			else if(yourGuess >= myNumber) {
				System.out.println("your guess is too heigh!");
				
			}
		
			if(i>=5) {
				System.out.println();
				System.out.println("Nope. The Number I was thinking of was " + myNumber);
			}
			
		}

	}
	
	public static int getRandamNumber(int min, int max) {
		
		Random random = new Random();
		return random.ints(min,max).findFirst().getAsInt();
	}

}
