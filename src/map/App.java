package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

public static void main(String[] args) {
		
		Map<Integer,String> student = new HashMap<>();
		student.put(3, "Priyanka");
		student.put(1, "Rahul");
		student.put(2, "Mia");
		student.put(7, "Angel");
		student.put(5, "Chaand");
		student.put(10, "Maqbul");
		
		
		
		/*for(Map.Entry<Integer, String> entry: student.entrySet()){
		   System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		*/
//		for(Integer key: student.keySet()){
//			System.out.println("Key: "+key+" Value: "+student.get(key));
//		}
//		
	
		Iterator<java.util.Map.Entry<Integer, String>> entry = student.entrySet().iterator();
		
		while(entry.hasNext()){
			java.util.Map.Entry<Integer, String> temp = entry.next();
			System.out.println("Key: "+temp.getKey() +" Value: "+ temp.getValue());
		}
//	
		
		

	}

}
