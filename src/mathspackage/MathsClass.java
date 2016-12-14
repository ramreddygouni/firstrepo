package mathspackage;

import java.util.Scanner;

public class MathsClass {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	double x = scan.nextInt();
	System.out.println("enter second number");
	double y = scan.nextInt();
	double answer;
	answer = x / y;
	System.out.println("the resultant answer is :\n" +answer);
	}

}
