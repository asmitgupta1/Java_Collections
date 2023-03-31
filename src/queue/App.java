package queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedBlockingQueue<>(6);
		
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
		queue.offer(7);
	
	for(Integer element: queue){
		System.out.println(element);
	}
	System.out.println("********************");
	System.out.println(queue.peek());
		
	
	Queue<Integer> queue1 = new ArrayBlockingQueue<>(6);
		
	
			queue1.offer(1);
			queue1.offer(2);
			queue1.offer(3);
			queue1.offer(4);
			queue1.offer(5);
			queue1.offer(6);
			queue1.offer(7);
		
		for(Integer element: queue1){
			System.out.println(element);
		}
		System.out.println("********************");
		System.out.println(queue1.peek());
	}

}
