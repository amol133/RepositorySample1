package day16_1Collection_Vector_priorityQueue_set;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue3 {

	public static void main(String[] args) {// 	Q= it only give integer

		Queue q=new PriorityQueue();
		
		q.add(150);
		q.add(15);
		q.add(6);
		
		   System.out.println("size of the queue="+q.size());
		   System.out.println("element of the queue="+q);
		   
// using poll() remove head element of queue if empty=Null 
		   System.out.println("it remove head element of the queue="+q.poll());
		   System.out.println("element of queue="+q);
		  
// using remove() remove head element of queue if empty=NoSuchElementException		
		   System.out.println("it remove head element of queue="+q.remove());
		   System.out.println("element of queue="+q);
		
		
		
		
		
		
		
		
		
	}

}
