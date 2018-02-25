package NavinSimple;

public class VarArgs {
	public static void main(String[] args) {
		Display obj = new Display();
		obj.show(5, 6, 7, 8);
	}

}

class Display {
	public void show(int... a)// varages varibale argument we denote ... for varargs 
	{
		for (int i : a) 
		{
			System.out.println(i);
		}
	}
	public void show(int a)
	{
		System.out.println(a+"print a");
		// where we search a value with apporpirate then if it will not find it will search varargs
	}
}
