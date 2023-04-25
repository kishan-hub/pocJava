package com.demo.datastructure.stack;

public class Main {
	
	public static void main(String[] args) {
		
		//ArrayStack stack =new ArrayStack(10);
		LinkedStack stack =new LinkedStack();
		stack.push(new Employee("Jane", "jones", 123));
		stack.push(new Employee("john", "doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike","Wilson", 3245));
		stack.push(new Employee("Bill","End", 78));
		
//		stack.printStack();
//		
//		System.out.println("=========================");
//		System.out.println(stack.peek());
//		
//		System.out.println();
//		
//		System.out.println("Popped: "+stack.pop());
//		
//		System.out.println("Peek: "+stack.peek());
		
		System.out.println("Pooped: "+stack.pop());
		System.out.println(stack.peek());
	}

}
