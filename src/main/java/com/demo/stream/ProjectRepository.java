package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectRepository {
	
	private static List<Project> data;
	
	static
	{
		Project p1 =new Project("urotaxi","Java", 1100, "its description Of taxi business","Kishan", "shriman,rahul,ramesh");
		Project p2 =new Project("Microservice1","Java", 1000, "its one services","Kishan", "shriman,rahul,ramesh");
		Project p3  =new Project("Microservice2","Java", 200, "its one services","Kishan", "shriman,rahul,ramesh");
		Project p4 =new Project("Microservice3","Java", 5000, "its one services","Kishan", "shriman,rahul,ramesh");
		Project p5 =new Project("Microservice4","Java", 3000, "its one services","Kishan", "shriman,rahul,ramesh");
		Project p6 =new Project("Microservice5","Java", 1500, "its one services","Kishan", "shriman,rahul,ramesh");
		Project p7 =new Project("Microservic6","Java", 1200, "its one services","Kishan", "shriman,rahul,ramesh");
		data =Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	}
	
	public List<Project> findAll() {
		
		return data;
	}

}
