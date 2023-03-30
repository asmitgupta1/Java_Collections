package stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.push(100);
		
//		for(int temp:demo)
//		{
//			System.out.println(temp);
//		}
//		System.out.println(demo.peek());
//		
//		
//		if(demo.isEmpty())
//		{
//			System.out.println("StacksMEpty");
//		
//		}
		
		System.out.println(demo.search(5));
		demo.pop();
		System.out.println(demo.search(5));

	}

}
