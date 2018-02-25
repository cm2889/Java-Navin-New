package NavinSimple;

public class Constructor {
	public static void main(String[] args) {
		
		Tanvir obj = new Tanvir(23);// constructor
	}

}

class Tanvir
{
	public Tanvir() // Constructor Overloading
	{
		System.out.println("My name is: Tanvir");
	}
	public Tanvir (int i)
	{
		System.out.println("Your Age is:23");
	}
}
