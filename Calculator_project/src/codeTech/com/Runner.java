package codeTech.com;

import java.util.Scanner;

public class Runner {

	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while(true){//infinite loop
			System.out.println("Enter choice");

			int choice = ip.nextInt();

			switch(choice) {
			case 1:
				System.out.println("hi");
				break;
			case 2:
				System.out.println("bye");
				break;

			case 3:
				System.out.println("Thank you!");
				System.exit(0);//Terminate the javm(prg)

			default:
				System.out.println("Invaild choice");
			}//End of Switch
			System.out.println("-----------");
		}//end of while loop

	}//end of main()
}
