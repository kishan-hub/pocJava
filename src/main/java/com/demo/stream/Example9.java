package com.demo.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.streamapi.Job;
import com.demo.streamapi.JobRepository;

public class Example9 {
	
	public static void main(String[] args) {
		
		ProjectRepository p =new ProjectRepository();
		
		List<Project> projects=p.findAll();
		
		ProjectRepository projects1 =new ProjectRepository();
		List<Project> list =projects1.findAll();
		
//		Stream.of("Hello","this","is","a" ,"Stream")
//		       .forEach(System.out::println);
//		getSnippetWordCountsImpreatively(list)
//		  .forEach((key,value) -> System.out.printf("%s occurs %d times %n",key,value));
		
		getDescriptionWordCountsStreams(list)
		 .forEach((key,value) -> System.out.printf("%s occurs %d times %n",key,value));
		
		
	}
	
	public static Map<String,Long> getSnippetWordCountsImpreatively(List<Project> jobs){
		
		Map<String, Long> wordCounts =new HashMap<>();
		
		for(Project job: jobs) {
			String [] words  = job.getDescription().split("\\W+");
			
			for(String word:words) {
				if(word.length() ==0) {
					continue;
				}
				String lword =word.toLowerCase();
				
				Long count =wordCounts.get(lword);
				
				if(count == null) {
					count = 0L;
				}
				wordCounts.put(lword, ++count);
			}
		}
		return wordCounts;
	}
   
	public static Map<String,Long>  getDescriptionWordCountsStreams(List<Project> projects) {
        
		return projects.stream()
			  .map(Project::getDescription)
			  .map(description -> description.split("\\W+"))
			  .flatMap(Stream::of)
			  .filter(word->word.length()>0)
			  .map(String::toLowerCase)
			  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	}
	
	//Difference between the map and flatMap
	
	
	
	
	
}
