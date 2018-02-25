package AbstractClass;

public class ExampleOfAbstractClass {
	
public static void main(String[] args) {
	MobileUser ms;
	ms= new Rahim();
	ms.sendMessage();
	ms.sendCall();
	ms= new Karim();
	ms.sendMessage();
	
}
}
abstract class MobileUser{
	abstract void sendMessage();// abstract method
	void sendCall(){// non abstract method
		System.out.println("You r calling non abastract method");	
	}
}
class Rahim extends MobileUser{
	void sendMessage()
	{
		System.out.println("Hi,I am Rahim");
	}
	
}
class Karim extends MobileUser{
	void sendMessage()
	{
		System.out.println("Hi,I am Karim");
	}
}
