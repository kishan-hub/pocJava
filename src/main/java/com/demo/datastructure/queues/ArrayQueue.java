package com.demo.datastructure.queues;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

import com.demo.datastructure.stack.Employee;

public class ArrayQueue {
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue =new Employee[capacity];
	}
  
	public void add(Employee employee) {
		
		if(back == queue.length) {
			Employee[] newArray =new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray,0, queue.length);
			queue=newArray;
		}
		queue[back]=employee;
		back++;
	}
	public Employee remove() {
		
		Employee employee = queue[front];
		queue[front]= null;
		front++;
		if(size() == 0) {
			front = 0;
			back = 0;
		}
		
		return employee;
	}
	
	public int size() {
		return back - front;
	}
	
	public Employee peek() {
	   
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		return queue[front];
		
	}
	public void printQueue() {
		
		for( int i = front; i< back;i++) {
			System.out.println(queue[i]);
		}
		
	}
	
}
