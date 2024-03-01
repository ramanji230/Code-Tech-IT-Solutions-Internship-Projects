package codeTech.com;

import java.util.Scanner;

public class Solution1 {


		public static void main(String[] args) {
			//MENU DRIVEN PRG

			System.out.println("Welcome to calculator");
			System.out.println("--------------------------");

			//TO ACCEPT INPUT FROM USER
			Scanner ip = new Scanner(System.in);

			//UP CASTING-->ABSTRACTION
			Calculator calc = new CalculatorIMPL();

			while(true) {//INFINITE LOOP
				System.out.println("1:Addition\n2:subtraction");
				System.out.println("3:multiplication \n4:Division \n5:Exit");
				System.out.println("Enter choice");
				int choice = ip.nextInt();
				// local variablees does not have defualt values, so intitializing to 0
				int x = 0;
				int y = 0;

				//ACCEPTING INPUT WHEN THE CHOICE IS 1 2 3 4
				if(choice>=1 && choice<=4) {
					System.out.println("Enter frist number");
					x=ip.nextInt();
					System.out.println("Enter second number");
					y=ip.nextInt();
				}

				switch(choice) {
				case 1:
					System.out.println("sum of"+x+ "&" +y+ "is: "+calc.add(x, y));
					break;

				case 2:
					System.out.println("diff of"+x+ "&" +y+ "is: "+calc.mul(x, y));
					break;

				case 3:
					System.out.println("product of"+x+ "&" +y+ "is:"+calc.sub(x, y));
					break;

				case 4:
					System.out.println("Division of"+x+ "&" +y+ "is:"+calc.div(x, y));
					break;

				case 5:
					System.out.println("thank you");//terminate the prg(jvm)

				default:
					System.out.println("Invaild");
					System.out.println("--------------");
				}
			}
		}

	}


