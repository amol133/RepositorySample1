package day16_1Collection_Vector_priorityQueue_set;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		Queue<Integer> Q=new PriorityQueue<Integer>();
		// while adding element in queue ,it will always keep smallest element on the top
		
		Q.add(123);
		Q.add(243);
		Q.add(24);
		Q.add(105);
		Q.add(50);
		Q.add(1);
		 System.out.println("size="+Q.size());
		 System.out.println("element of queue="+Q);
		
// element() returns top most element of the queue , if the queue if empty then it
// will throw an exception by name 'NosuchelementException'
		 
     System.out.println("head element of the queue using element() ="+Q.element());	
	
  // peek() return top most element of the queue,if the queue is empty then it
  // will return 'null' instead of throwing exception  
	   System.out.println("head element of the queue using peek()="+Q.peek());
		
	   System.out.println("iterating the queue element using for each loop=");
	   for(Integer x:Q) {
		   System.out.println(x);
	   }
	   System.out.println("iterating the queue element using Iterator=");
	   Iterator I=	Q.iterator();
	   while(I.hasNext()) {
		   System.out.println(I.next());
	   }
	   
	   System.out.println("Element of Queue= "+	Q);
	   
//it will remove top most element of the queue if the queue is empty then it 
//it will through an exception by name 'NoSuchElementException'	   
		
	   System.out.println("removing element from queue using remove()="+Q.remove());//
	   System.out.println("element of the queue="+Q);
		
// it will remove top most element of the queue if the queue is empty then it 
// will return 'null' instead of throwing exception	   
		
	   System.out.println("removing element from queue using poll()="+Q.poll());
	   System.out.println("element of the queue="+Q);
	   
	   System.out.println("afterb removing two element=");
		Iterator i=Q.iterator();
		while(i.hasNext()) {
			   System.out.println(i.next());
		}
		
		   System.out.println("*****************************************");
		// using lambda expression
		   Q.forEach(a ->{
			   System.out.println(a);
		   });
		
		
		
		
		
		
		
		
	}

}
