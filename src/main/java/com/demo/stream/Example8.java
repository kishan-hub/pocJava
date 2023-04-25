package com.demo.stream;

import java.util.List;
import java.util.OptionalInt;

public class Example8 {
	
	public static void main(String[] args) {
		
		ProjectRepository p= new ProjectRepository();
		
		List<Project> projects = p.findAll();
		
		OptionalInt max =projects.stream().mapToInt(p1 ->p1.getStars()).max();
		System.out.println(max.getAsInt());
		
	}

}
