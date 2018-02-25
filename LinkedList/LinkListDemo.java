package LinkedList;

import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList<String> country_names = new LinkedList<String>(); 
		country_names.add("Afganistan");
		country_names.add("Bangladesh");
		country_names.add("Canada");
		country_names.add(3,"Brazil");
		country_names.addFirst("Austraila");
		country_names.addLast("japan");
		//country_names.remove(5); //Remove by index number
		country_names.remove("Canada");
		
		
		for(String country:country_names) {
			System.out.println(country);
		}
		System.out.println(country_names.size());
		
		//System.out.println(country_names);
	}

}
