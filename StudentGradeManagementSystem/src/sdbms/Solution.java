package sdbms;

import java.util.Scanner;

import customException.InvaildChoiceExpection;
import customException.StudentNotFoundException;


public class Solution {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("Welcome to the CODETECH IT Solutions Student data base");
		System.out.println("-------------------------------------------------------");

		StudentManagementSystem sms = new StudentManagementSystemImpl();

		while(true) {

			//menu drive program
			System.out.println("1:addStudent");
			System.out.println("2:displayStudent");
			System.out.println("3:displayAllStuden");
			System.out.println("4:deleteStudent");
			System.out.println("5:deleteAllStudent");
			System.out.println("6:updateStudent");
			System.out.println("7:Exit\nEnter choice");

			int choice = ip.nextInt();
		
			
			switch(choice) {

			case 1:
				sms.addStudent();
				break;

			case 2:
				sms.displayStudent();
				break;

			case 3:
				sms.displayAllStudent();
				break;

			case 4:
				sms.deleteStudent();
				break;
				
			case 5:
				sms.deleteStudent();
				break;

			case 6:
				sms.updateStudent();
				break;

			case 7:
				System.out.println("Thank you!");
				System.exit(0);


			default:
				try {
					String message="Invaild Choice,Enter vaild choice";
					throw new InvaildChoiceExpection(message);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());

				}

			}
			System.out.println("---------------------------------------");
		}

	}
}
