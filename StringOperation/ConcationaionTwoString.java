package StringOperation;

import java.util.Scanner;

public class ConcationaionTwoString {
	public static void main(String[] args) {
		String s1, s2;
		System.out.println("Enter First String");
		Scanner scanner = new Scanner(System.in);
		
		s1 = scanner.nextLine();
		System.out.println("Enter Second String");
		s2 = scanner.next();
		
		String s3 = s1.concat(s2);
		// find out the length of two string
		int l1=s1.length();
		int l2=s2.length();
		// convert upper case
		s1=s1.toUpperCase();
		System.out.println("uper case is:"+s1);
		System.out.println("First String length is: "+l1);
		System.out.println("Second String length is: "+l2);
		System.out.println("The result is: " + s3);

	}

}
