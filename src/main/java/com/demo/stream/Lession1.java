package com.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lession1 {
	
	private static ProjectRepository project;
	
	public static void main(String[] args) {
		project =new ProjectRepository();
		 
		List<Project> projects =project.findAll();
		
	   List<String> names =projects.stream()
			              .filter( p ->{
			            	  System.out.println(p.getName());
			            	  return p.getStars() >3;
			              })
			              .map(p -> {
			            	  System.out.println(p.getName());
			            	  return p.getName();
			              })
			              .limit(3)
			              .collect(Collectors.toList());
	                System.out.println(names);
    
	          names.stream().forEach(name ->System.out.println(names));
	}

}
