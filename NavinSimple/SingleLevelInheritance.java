package NavinSimple;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		addsub obj = new addsub();
		obj.num1 = 6;
		obj.num2 = 4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);

	}

}

class add {

	int num1, num2, result = 0;

	public void sum() {
		result = num1 + num2;
	}

}

class addsub extends add {// single level Inheritance

	public void sub() {
		result = num1 - num2;

	}

}
