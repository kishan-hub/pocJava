package com.demo.stream;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		
     ProjectRepository pj =new ProjectRepository();
		
     explore(pj.findAll());	
	}
	
   public static void explore(List<Project> projects) {
	   String searchDesc="its one services";
	Optional<Project> foundDesc = luckySearchDesc(projects,searchDesc);
	
	System.out.println(foundDesc.map(Project::getDescription).orElse("Search not found"));

   }

  private static Optional<Project> luckySearchDesc(List<Project> projects, String searchDesc) {
	// TODO Auto-generated method stub
	return projects.stream().filter(p->p.getDescription().contains(searchDesc)).findFirst();
  }
   
   
}

