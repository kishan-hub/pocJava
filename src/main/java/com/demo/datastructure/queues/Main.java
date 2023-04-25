package com.demo.datastructure.queues;

import com.demo.datastructure.stack.Employee;

public class Main {
	
	
	public static void main(String[] args) {
		
		Employee janeJones =new Employee("Jane", "Jones", 123);
		Employee johnDoe =new Employee("John","Doe", 4567);
		Employee marySmith =new Employee("Mary", "Smith", 124);
		Employee mikeWilson=new Employee("mkie","Wilson", 125);
		Employee billEnd =new Employee("bill","End", 157);
		
		ArrayQueue queue = new ArrayQueue(10);
		
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
				
	    queue.printQueue();
		
		queue.remove();
		
		System.out.println();

		queue.printQueue();
	}

}
