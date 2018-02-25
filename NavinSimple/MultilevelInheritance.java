package NavinSimple;

public class MultilevelInheritance {

	public static void main(String[] args) {
		multiply obj = new multiply();
		obj.num1=6;
		obj.num2=3;
		obj.sum();
		System.out.println("The sum is: "+obj.result);
		obj.sub();
		System.out.println("The Subtraction is: "+obj.result);
		obj.mult();
		System.out.println("The Multiply of this two number: "+obj.result);

	}

}
class adding {
	int num1,num2,result;
	public void sum() {
		result= num1+num2;	
	}
	
}
class addsu  extends adding {
	public void sub() {
		result=num1-num2;
	}
	
}
class multiply extends addsu{
	public void mult() {
		result=num1*num2;
	}
	
}
