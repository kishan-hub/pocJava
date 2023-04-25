package com.demo.stream;

import java.util.ArrayList;
import java.util.List;

import com.demo.streamapi.Job;

public class Example6 {

	public static void main(String[] args) {
		   
	}
	
	private static List<String> getCaptionsImpreatively(List<Job> jobs)
	{
		List<String> captions  =new ArrayList<>();
		
		for(Job job:jobs) {
			if(isArcheticateJob(job)) {
				String caption  =String.format("%s is looking for a %s in %s",job.getId(),job.getJobname(),job.getCity());
				captions.add(caption);
			}
		    if(captions.size()>=3) {
		    	break;
		    }
			
		}
		return captions;
	}

	private static boolean isArcheticateJob(Job job) {
		String title =job.getJobname().toLowerCase();
		return title.contains("Architect");
	}
 
}