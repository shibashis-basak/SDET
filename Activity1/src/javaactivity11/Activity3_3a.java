package javaactivity11;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(12);
		q.add(20);
		q.add(15);
		q.add(18);
		q.add(14);
		
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		System.out.println(q.peek());
				
		System.out.println(q.size());
		
		System.out.println(q);
		

	}

}
