package com.demo.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JobRepository {
    
	private static List<Job> jobs;
	
	static
	{
		jobs.add(new Job(1, "Engineer", 45000, "chingpokli", "nalasupara","pune", "Maharastra", "20012312", "india"));
		jobs.add(new Job(11, "Architect", 234000, "chingpokli", "nalasupara","pune", "Maharastra", "20012312", "india"));
		jobs.add(new Job(111, "Architect", 125000, "chingpokli", "nalasupara","pune", "Maharastra", "20012312", "india"));
		jobs.add(new Job(1111, "Architect", 150000, "chingpokli", "nalasupara","pune", "Maharastra", "20012312", "india"));
		jobs.add(new Job(12, "Architect", 145000, "chingpokli", "nalasupara","pune", "Maharastra", "20012312", "india"));
		jobs.add(new Job(122, "Architect", 145000, "chingpokli", "nalasupara","pune", "Maharastra", "20012312", "india"));
		jobs.add(new Job(1222, "developer", 105000, "chingpokli", "nalasupara","mumbai", "Maharastra", "20012312", "india"));
		jobs.add(new Job(13, "developer", 95000, "chingpokli", "nalasupara","nagpur", "Maharastra", "20012312", "india"));
		jobs.add(new Job(133, "developer", 90000, "chingpokli", "nalasupara","nagpur", "Maharastra", "20012312", "india"));
		jobs.add(new Job(1333, "developer", 90000, "chingpokli", "nalasupara","mumbai", "Maharastra", "20012312", "india"));
		jobs.add(new Job(14, "Manager", 450000, "chingpokli", "nalasupara","bostan", "Maharastra", "20012312", "US"));
		
		jobs.add(new Job(1, "Manager", 450000, "chingpokli", "nalasupara","Loss Angeles", "Maharastra", "20012312", "US"));
		
	}
	
	public List<Job> findAll()
	{
		return jobs.stream().collect(Collectors.toList());
	}
	
	
	
	
	
}
