package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int user_input_integer = scan.nextInt();
	System.out.println("\nthe entered number is:\n" +user_input_integer);
	//System.out.print(user_input_integer);
	
	Scanner scan1 = new Scanner(System.in);
	System.out.println("\nenter a decimal number");
	double user_input_double = scan1.nextDouble();
	System.out.println("\nthe entered decimal number is:");
	System.out.print(user_input_double);
	
	Scanner scan2 = new Scanner(System.in);
	System.out.println("\nenter a string");
	String user_input_string = scan2.nextLine();
	System.out.println("\nthe entered string is:");
	System.out.print(user_input_string);
	}

}
