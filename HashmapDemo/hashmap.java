package HashmapDemo;

import java.util.HashMap;

public class hashmap {
public static void main(String[] args) {
	HashMap<Integer, String> customer = new HashMap<Integer, String>();
	customer.put(101, "Imam");
	customer.put(102, "Tanvir");
	customer.put(100, "Cm");
	customer.put(103, "Dristy");
	System.out.println(customer.get(101));
	System.out.println(customer.get(100));
	System.out.println(customer.get(102));
	
}
}
