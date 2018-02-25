package NavinSimple;

public class TwoDArray {

	public static void main(String[] args) {
		int x[] = {1,2,3,4};
		int y[] = {5,6,7,8};
		int z[] = {2,3,5,9};
		
		int p[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{2,3,5,9}
					
				};
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(p[i][j]+" ");
			}
			System.out.println(" ");
		}			
		
	}
}
