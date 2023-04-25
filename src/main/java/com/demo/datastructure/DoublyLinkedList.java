package com.demo.datastructure;

public class DoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if(head == null) {
			tail =node;
		}
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head =node;
		size++;
	}

	public void addToEnd(Employee employee) {
			
		EmployeeNode node = new EmployeeNode(employee);
		if(tail ==null) {
			head =node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail =node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
         
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode =head;
		
		if (head.getNext() == null) {
			tail =null;
		}
		else
		{
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public EmployeeNode removeFromEnd() {
		
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode =tail;
		
		if(tail.getNext() ==null) {
			head=null;
		}
		else
		{
			tail.getNext().setPrevious(null);
		}
		tail =tail.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
		
	}
	
	public boolean isEmpty() {
		 
		return head ==null;
	}
	
	public int getSize()
	{
		 return size;
	}
	
	public void printList() {
		EmployeeNode current =head;
		
		while(current!=null) {
			System.out.println(current.getEmployee());
			System.out.println("<==>");
			current = current.getNext();
		}
		
	}

}
