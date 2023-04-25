package com.demo.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
	
	public static void main(String[] args) {
		
		ProjectRepository project =new ProjectRepository();
		List<Project> projects  =project.findAll();
		
		for(Project p:projects) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------");
		
		List<Project> collect  =projects.stream()
				                         .filter(p -> p.getStars() >1000)
				                         .collect(Collectors.toList());
		
		for (Project project2 : collect) {
			System.out.println(project2);
		}
		//distint
		Stream<Integer>numbers =Stream.of(1,2,3,4,5);
		numbers.distinct().limit(3).forEach(n->System.out.printf(n+" "));
		
		System.out.println("=======================================");
		Stream.of(1,2,3,3,3,3,2,2,4).skip(4).forEach(n->System.out.println(n));
		
	}

}
