package linklist;

import java.util.Iterator;
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
		
		new App().printList(countries);
		System.out.println("*********************");
		
		countries.add(1,"Canada");
		new App().printList(countries);
		System.out.println("*********************");
		
		countries.set(6, "Brazil");
		new App().printList(countries);
		System.out.println("*********************");
		
		
		countries.remove(0);
		new App().printList(countries);
		System.out.println("*********************");
		
		
	}
	
	void printList(List<String> countries)
	{
//		for(String temp:countries)
//		{
//			System.out.println(temp);
//		}
//		
		Iterator<String> iterator = countries.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
