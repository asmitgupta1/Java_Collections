package sort;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		countries.sort(null);
		new App().printList(countries);
		System.out.println("*********************");
		
		Collections.reverse(countries);
		new App().printList(countries);
		System.out.println("*********************");

	}
	void printList(List<String> countries)
	{
		for(String temp:countries)
		{
			System.out.println(temp);
		}
	}

}
