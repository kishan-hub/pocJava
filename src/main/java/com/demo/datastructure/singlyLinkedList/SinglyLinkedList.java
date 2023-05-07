package com.demo.datastructure.singlyLinkedList;

public class SinglyLinkedList {
	
	public Node head;
	public Node tail;
	
	public int size;
	
	public Node createsinglyLinkedList(int nodeValue) {
		head =new Node();
		Node node =new Node();
		node.next =null;
		node.value =nodeValue;
		head =node;
		tail =node;
		size =1;
		return node;
	}
    
	//Insert Method SinglyLinkedList
	public void insertInLinkedList(int nodeValue,int location) {
		Node node =new Node();
		node.value =nodeValue;
		
		if(head == null) {
			createsinglyLinkedList(nodeValue);
			return;
		}else if(location == 0) {
			node.next =head ;
			head =node;
		}else if(location>=size) {
			node.next =null;
			tail.next =node;
			tail =node;
		}else {
			Node tempNode =head;
			int index =0;
			while(index <location -1 ) {
				tempNode =tempNode.next;
				index++;
			}
			Node nextNode =tempNode.next;
			tempNode.next =node;
			node.next =nextNode;
		}
		size++;
	}
	
	public void traverseSinglyLinkedList() {
		
		if(head == null) {
			System.out.println("SLL does not exit");
		} else {
			Node tempNode =head;
			
			for(int i =0;i<size;i++) {
				System.out.println(tempNode.value);
				if(i !=size -1) {
					System.out.println("->");
				}
				tempNode =tempNode.next;
			}
			System.out.println("\n");
		}
	}
	
	//Search for node 
	
	boolean searchNode(int nodeValue) {
		
		if(head !=null) {
			Node tempNode =head;
			for(int i=0;i<size;i++) {
				
				if(tempNode.value ==nodeValue) {
					System.out.println("Found the node a location: "+i+"\n");
					return true;
				}
			}
		   tempNode =tempNode.next;
		}
		System.out.println("Node Not found! ");
		return false;
	}
	
}
