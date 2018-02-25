package NavinSimple;

public class CountNumberOfObject {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		obj2.counter();
	}

}
class A {
	 static int i =0; // if we can not write static it will not work properly and print just 1
	public A() {
		i++;
	}
	public void counter () {
		System.out.println(i);
	} 
} 
