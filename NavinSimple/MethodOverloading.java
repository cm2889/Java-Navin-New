package NavinSimple;

public class MethodOverloading {
	public static void main(String[] args) {
		E obj= new E();
		obj.show(4.09);
		
	}

}
class E {
	public void show () {//method overloading,static Binding, Early binding,compile time polymorphism
		System.out.println("Hellow");
		
	}
	public void show (int i) {
		System.out.println("Hellow: "+i);
		
	}
	public void show (Double i) {
		System.out.println("Hellow: "+i);
		
	}
	
	
}
