package com.demo.stream;

import java.util.List;

public class Quiz4 {
	
	public static void main(String[] args) {
		
		ProjectRepository pr=new ProjectRepository();
		List<Project> projects=pr.findAll();
		
		Integer kishan =projects.stream().filter(p->p.getAuthor().equals("Kishan"))
				                         .map(p->p.getStars()).limit(2)
				                         .reduce(0, Integer::sum);
		System.out.println(kishan);
		
		
	}

}
