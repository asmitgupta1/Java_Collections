package Generics;

import java.util.LinkedList;
import java.util.List;

class GenericClass<T>{
	private T data;
	
	public GenericClass(T data) {
		
		this.data = data;
	}

	public T getData() {
		return data;
	}

//	public void setData(T data) {
//		this.data = data;
//	}
	
	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

class Data<K,V>{
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E, N> void display(E element, N number){
		System.out.println("Element: "+element+ " Number: "+number);
	}
	
}

public class App {

	
	public static void main(String[] args) {
		
	GenericClass<String> obj = new GenericClass<String>("some string");
	
	String data1=obj.getData();
	
	System.out.println(data1);
	
	
	List<GenericClass<Object>> elements = new LinkedList<>();
	
	elements.add(new GenericClass<Object>(1));
	elements.add(new GenericClass<Object>(2));
	elements.add(new GenericClass<Object>(3));
	elements.add(new GenericClass<Object>('e'));
	elements.add(new GenericClass<Object>(5));
	
	
	
List<GenericClass<Integer>> element1 = new LinkedList<>();
	
	element1.add(new GenericClass<Integer>(1));
	element1.add(new GenericClass<Integer>(2));
	element1.add(new GenericClass<Integer>(3));
	element1.add(new GenericClass<Integer>(5));
	element1.add(new GenericClass<Integer>(5));
	
	App app = new App();
	
	app.printList(elements);
	
	System.out.println("***************************");
	app.printList1(element1);
	
	
	
	
	Data<Integer, String> data = new Data<Integer, String>(1, "Chaand");
	
	System.out.println("Key: "+data.getKey()+" value: "+data.getValue());
	data.display("2.0", 25);

	}

	private void printList1(List<GenericClass<Integer>> element1) {
		for(GenericClass<Integer> ele:element1)
		{
			System.out.println(ele);
		}
		
	}

	private void printList(List<GenericClass<Object>> elements) {
		
		for(GenericClass<Object> ele:elements)
		{
			System.out.println(ele);
		}
		
	}
	


}
