package com.demo.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.streamapi.Job;
import com.demo.streamapi.JobRepository;

public class Example5 {
	
	public static void main(String[] args) {
		JobRepository repository =new JobRepository();
		
	List<Job> jobs=getArcheticatJobsStream(repository.findAll());
	
	for (Job job : jobs) {
		System.out.println(job);
	}
	
	}
	
	private static List<Job> getArcheticatJobsStream(List<Job> jobs){
	    return jobs.stream().filter(Example5::isArcheticateJob).limit(3).collect(Collectors.toList());
	}
	
	private static boolean isArcheticateJob(Job job) {
		String title =job.getJobname().toLowerCase();
		return title.contains("Architect");
	}
 
}
