package com.demo.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import com.demo.array.Employee;

public class ExploreIntStream {
	
	public static void main(String[] args) {
		
		System.out.println(
			 IntStream.of(1,2,3,4,5,6,7,8,10).sum()
				);
		
	}
	
	private static void explore(List<Project> projects) {
		
		String mAuther ="Kishan";
		
		Optional<Project> foundProject =projects.stream().filter(project->project.getAuthor().contains(mAuther))
				                        .findFirst();
		   
		System.out.println(foundProject);
		
		System.out.println("---"+foundProject.isPresent());
		System.out.println(foundProject.get());  
		
		
	}

}
