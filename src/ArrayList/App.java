package ArrayList;

import java.util.ArrayList;

public class App {
	
	static ArrayList<String> listnames = new ArrayList<>();
	
	public static void main(String[] args) {
		
		listnames.add("Chand");
//		System.out.println(listnames);
		listnames.add("John");
		listnames.add("Steve");
		listnames.add("Pooja");
		listnames.add("Salim");
		listnames.add("Rahul");
		listnames.add("Mia");
		listnames.add("Angel");
		
		App app = new App();
//		app.displayList(listnames);
//		
//		app.removeNameByPosition(0);
//		app.removeNameByStrng("Mia");
//		System.out.println("**************************");
//		app.displayList(listnames);
//		System.out.println("**************************");
//		System.out.println(listnames.get(3));
//		
//		System.out.println("**************************");
		
		int pos =app.search("Poolja");
		
		if(pos!=-1)
		app.modifyname(pos, "pooja");
		
		else
			System.out.println("ivnvalid entry");
		app.displayList(listnames);
	
	}
	
	void displayList(ArrayList<String> names)
	{
		for(String name:names)
		{
			System.out.println(name);
		}
	}
	void removeNameByPosition(int position)
	{
		listnames.remove(position);
	}
	void removeNameByStrng(String name)
	{
		listnames.remove(name);
	}
	
	void modifyname(int index, String name)
	{
		listnames.set(index,name);
	}
	int search(String name)
	{
		return listnames.indexOf(name);
		
	}


}
