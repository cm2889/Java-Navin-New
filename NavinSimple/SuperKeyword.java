package NavinSimple;

public class SuperKeyword {
	public static void main(String[] args) {
		H obj = new H();
		obj.shown();
		
	}

}
class G {
	int x=10;
	public void shown() {
		System.out.println("varibale Is:");
	}
	
	
}
class H  extends G{
	int x= 5;
	public void shown() {
		// just call the super class method
		super.shown();
		// if we dont user super keyword it will priroty this class variabel
		System.out.println("Varibale is:"+x);
		// if we  want to acces super class varibale
		System.out.println("Varibale is:"+super.x);
	}
		
		
	}
	

