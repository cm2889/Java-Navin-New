package NavinSimple;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.err.println("Please Enter A number");
		
		int number;
		number = input.nextInt();
		System.err.println("The Number Is:"+number);
		
	}

}
