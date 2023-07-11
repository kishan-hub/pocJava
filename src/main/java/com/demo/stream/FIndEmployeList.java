package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.array.Employee;

public class FIndEmployeList {
   
	public static void yell(String words) {
	   Objects.requireNonNull(words, () -> "Created Isshu"+FIndEmployeList.createdIssue());
		System.out.printf("%s!!!!!! %n",words.toUpperCase()); 
	 }
	
	public static String createdIssue() {
		System.out.println("Some External Api Call to bug tracker");
		return "#ABC1234";
	}
	
	public static <T> void main(String[] args) {
		
		 EmployeeRepository repository = EmployeeRepository.getInstance();
		 
		  List<Employee> employeList =repository.findAll();
		  findEmployeWhoseNameIsKishan(employeList);
		  findEmployeeWhoseSalIsAbove100000(employeList);
		  //print all Employe 
		//  employeList.forEach(e->System.out.println(e));
		  
		  List<String> ingredients =Arrays.asList(
				  "Flour",
				  "Salt",
				  "Bakeing Powder",
				  "butter",
				  "eggs",
				  "milk"
				  );
		 
   //imperative style programming
//	  boolean hasEggs=false;
//	   for(String ingredient:ingredients) {
//		   
//		  System.out.println(ingredient);
//	   }
//   
//	   if(ingredients.contains("eggs")) {
//		   System.out.println("Sorry Swwet heart eggs is Present");
//	   }
	   
	   //declearative style of programming with Annonymus class
//	   ingredients.forEach(new Consumer<String>() {
//
//		@Override
//		public void accept(String ingredient) {
//		    System.out.println(ingredient);
//		}
//		   
//		});
		  
		//  Consumer<String> printer =ingredient->System.out.println(ingredient);
		  
		  //ingredients.forEach(printer);
	//	  ingredients.forEach(System.out::println);
		//  ingredients.forEach(FIndEmployeList::yell);
		  
		  
		  //FInd the Employee Whose name is kishan 
		  
		 
		  
		  
	}

	  public static void findEmployeWhoseNameIsKishan(List<Employee> employess) {
		   employess.stream()
          .filter(emp->emp.getName().equals("Kishan"))
          .forEach(System.out::println);
		                        
	  }
	  public static void findEmployeeWhoseSalIsAbove100000(List<Employee> employees) {
		  Predicate<Employee> p= (emp)->emp.getSalary()>100000;
		  employees.stream().filter(p)
		                    .forEach(System.out::println);
	  }
	  
//	  public static void findEmployeeWhoseLetterEndWithSpecificLetter(List<Employee> employees,char ch) {
//		  Predicate<Employee> p1=emp->emp.ge
//		  employees.stream().filter()
//		                    .forEach(System.out.println());
//	  }
//	
}
