package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Chaand");
		set.add("John");
		set.add("Aafiya");
		set.add("Armaan");
		set.add("Mia");
		set.add("chaand");
		
		for(String name: set){
			System.out.println(name);
		}
		
        System.out.println(set.contains("chaand"));
        
        
        
    	Set<String> set1 = new HashSet<>();
		for(int i = 30; i>0; i--){
			set1.add("A"+i);
		}
		for(String i: set1){
			System.out.println(i);
		}
		
		
		Set<String> set2 = new LinkedHashSet<>();
		for(int i = 30; i>0; i--){
			set2.add("A"+i);
		}
		for(String i: set2){
			System.out.println(i);
		}
		
		Set<String> set3 = new TreeSet<>();
		for(int i = 30; i>0; i--){
			set3.add("A"+i);
		}
		for(String i: set3){
			System.out.println(i);
		}
	}

}
