package ExceptionHandeling;

import NavinSimple.TryCatch;

public class Exceptiondemo {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 5;
			int result = x / 0;
			System.out.println("The result is: " + result);
		} 
		//sobar age subcException use korbo
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is : "+e);
		}
		catch (Exception e) {
			System.out.println("Exception is : "+e);
			// multipule catch block is used
		}
		/**finally {
			System.out.println("ok done");
			if we want to run our code must

		}**/
		System.out.println("ok done");

		
	}
}
