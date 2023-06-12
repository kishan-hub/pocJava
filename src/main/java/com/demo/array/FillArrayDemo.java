package com.demo.array;

import java.util.Arrays;

public class FillArrayDemo {
	
	public static void main(String[] args) {
		
		 Employee e1 =new Employee(1,"sudhanshu", 20000);
			
			int hashcodeE1=e1.hashCode();
			
			Employee e2=new Employee(2,"purshottam",30000);
			int hashcodeE2 =e2.hashCode();
			
			Employee e3=new Employee(3,"rahul", 30000);
			int hashcodeE3 =e3.hashCode();
			
			Employee e4 =new Employee(4, "durga",40000);
			int hashcodeE4 =e4.hashCode();
			
			Object [] employees = {e1,e2,e3,e4};
			
			Object[] employeesHashcode = {hashcodeE1,hashcodeE2,hashcodeE3,hashcodeE4};
			
			Arrays.fill(employees, e1);
			
	}

}
