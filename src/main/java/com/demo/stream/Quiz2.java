package com.demo.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Quiz2 {
   
	public static void main(String[] args) {
		
		ProjectRepository p =new ProjectRepository();
		List<Project> projects =p.findAll();
		
		System.out.println(projects.stream().map(Project::getName).limit(6).collect(Collectors.toList()));
		
	}
}
