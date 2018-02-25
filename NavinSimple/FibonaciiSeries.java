package NavinSimple;

public class FibonaciiSeries {
public static void main(String[] args) {
	int a;
	int x=1,y=1;
	a=0;
	System.out.print("1 1 ");
	
	while (a<=50) {
		a=x+y;
		System.out.print(a + " "
				+ "");
		x=y;
		y=a;
		
	}
}
}
