package com.demo.datastructure.circularQueue;

import com.demo.datastructure.stack.Employee;

public class ArrayQueue {
	
	private Employee[] queue;
	
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	public void add(Employee employee) {
		if(size() ==queue.length - 1) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray,0,queue.length);
			queue =newArray;
			
			queue[back] =employee;
			if (back <queue.length -1) {
				back++;
			}
			else {
				back =0;
			}
		}
		
	}

	
	public int size() {
		 
		return front - back;
	}

}
