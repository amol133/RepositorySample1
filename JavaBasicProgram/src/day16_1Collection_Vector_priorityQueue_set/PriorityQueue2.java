package day16_1Collection_Vector_priorityQueue_set;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {

	public static void main(String[] args) {

		Queue q=new PriorityQueue();
		
		   System.out.println("size of the queue="+q.size());
		   System.out.println("element of the queue="+q);
		
		// peek method used to  return top most element but as here empty it shows 'Null'
		   System.out.println("it return head element of queue peek element="+q.peek());
		
		// element() method return top most element but as empty it return NoSuchElementException
		   System.out.println("it return head element of queue by using  element="+q.element());
		
		
		
		
		
		
	// element()--> show head of queue element means top if empty give nosuchelmentexception
	// peek()	-->show head element of queue it empty then return Null
		   
	// remove()-->it remove head element of queue if empty return NoSuchElementException	   
	// poll()--->it remove head element of queue if empty return Null	
		
		
		
	}

}
