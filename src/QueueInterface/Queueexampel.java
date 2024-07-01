package QueueInterface;

import java.util.*;

public class Queueexampel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		
		q.add("animal1");
		q.add("animal2");
		q.add("animal3");
		q.add(null);
		q.add("animal3");
		q.add(null);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q);
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(10);
		pq.add(5);
		//pq.offer(2);
		System.out.println(pq);
		
		
		 ArrayDeque<Integer> deque = new ArrayDeque<>();
//
//	        ((Object) deque).insertRear(5);
//	        deque.insertRear(10);
//	        deque.insertFront(15);
//	        deque.insertFront(20);
//
//	        deque.display(); // Output: Deque elements: 20 15 5 10
//
//	        System.out.println("Front element: " + deque.getFront()); // Output: Front element: 20
//	        System.out.println("Rear element: " + deque.getRear()); // Output: Rear element: 10
//
//	        deque.removeFront();
//	        deque.removeRear();
//
//	        deque.display(); 
		
	}

}
