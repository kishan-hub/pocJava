package com.demo.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.array.Employee;

public class EmployeeRepository implements Serializable {
	
	private static HashMap<Integer, Employee> employess;
	
	private static EmployeeRepository instance;
	
	static 
	{
		 Employee e1 =new Employee(1, "Kishan", 10000);
		 Employee e2 =new Employee(2, "Rahul", 140000);
		 Employee e3 =new Employee(4, "gopal", 160000);
		 Employee e9 =new Employee(4, "suresh", 160000);
		 Employee e4 =new Employee(5, "Kishore", 170000);
		 Employee e5 =new Employee(6, "priya", 180000);
		 Employee e6=new Employee(7,  "devika", 120000);
		 Employee e7 =new Employee(8, "krishnan", 130000);
		 Employee e8 =new Employee(10, "govinda", 140000);
		 Employee e10 =new Employee(11, "purshottam", 140000);
		 Employee e11 =new Employee(12, "vikas", 140000);
		 Employee e12 =new Employee(13, "patil", 140000);
		 Employee e13 =new Employee(14, "sudhir", 140000);
		 Employee e14 =new Employee(15, "vikas", 140000);
		 Employee e15 =new Employee(16, "suresh", 140000);
		 Employee e16 =new Employee(17, "mahesh", 160000);
		 Employee e17 =new Employee(23, "shiva", 140000);
		 Employee e18 =new Employee(21, "adam", 140000);
		 Employee e19 =new Employee(20, "krishna", 140000);
		 Employee e20 =new Employee(19, "vishnu", 140000);
		 Employee e21 =new Employee(18, "ahamad", 140000);
		 employess =new HashMap<>();
		 employess.put(e1.getEmpno(), e1);
		 employess.put(e2.getEmpno(), e2);
		 employess.put(e3.getEmpno(), e3);
		 employess.put(e4.getEmpno(), e4);
		 employess.put(e5.getEmpno(), e5);
		 employess.put(e6.getEmpno(), e6);
		 employess.put(e7.getEmpno(), e7);
		 employess.put(e8.getEmpno(), e8);
		 employess.put(e9.getEmpno(), e9);
		 employess.put(e10.getEmpno(), e10);
		 employess.put(e11.getEmpno(), e11);
		 employess.put(e12.getEmpno(), e12);
		 employess.put(e13.getEmpno(), e13);
		 employess.put(e14.getEmpno(), e14);
		 employess.put(e15.getEmpno(), e15);
		 employess.put(e16.getEmpno(), e16);
		 employess.put(e17.getEmpno(), e17);
		 employess.put(e18.getEmpno(), e18);
		 employess.put(e19.getEmpno(), e19);
		 employess.put(e20.getEmpno(), e20);
		 employess.put(e21.getEmpno(), e21);
	}
	
	public boolean isEmpty() {
		boolean flag=false;
		  if(employess.isEmpty()) {
			 flag=false;
		  }
		return flag;
	}

	public Employee get(Employee e)
	{
		return employess.get(e);
	}

	public boolean containsKey(Employee key) {
		return employess.containsKey(key);
	}

	public Employee put(Integer key, Employee value) {
		return employess.put(key, value);
	}

	public void putAll(Map<? extends Integer, ? extends Employee> m) {
		employess.putAll(m);
	}
	public List<Employee> findAll(){
		List<Employee> employeList = new ArrayList<>(employess.values());
		return employeList;
	}

	public static synchronized   EmployeeRepository   getInstance() {
		  
		if(instance ==null) {
			instance =new EmployeeRepository();
		}
		return instance;
	}
	

}
