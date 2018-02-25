package NavinSimple;
/*
 * 
 * 153
 * 1 5 3
 * 1*1*1 5*5*5 3*3*3
 * 1+125+27=153 so this is armstrong NUmber
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int r;
		 int sum=0;
		
		while (n>0) {
			r=n%10;
			n=n/10;
			sum=sum +r*r*r;
		}
		
		if (sum==temp) {
			System.out.println("This is a armstrong Number");
		}
		else {
			System.out.println("This is not Armstrong Number");
		}
		
		
		
	}

}
