package NavinSimple;

import java.util.Random;

public class TryCatch {

	
	public static void main(String[] args) {
		Random r = new Random();
		int a []= new int [50];
		for (int i=0;i<a.length;i++) {
			a[i]= r.nextInt(50);
			
		}
	 try {
		 System.out.println(a[58
		                      ]);
		
	    }
	 catch (Exception e) {
		System.out.println("Please check u r array index out of bound");
	}
		
		for(int i:a) {
			System.out.println(i);
		}
	}
}
