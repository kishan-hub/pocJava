package com.demo.array;


public class Employee implements Comparable<Employee> {

 public  int empno;
  
   public String name;
  
  public long salary;
   
	public Employee(int empno, String name, long salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
	String x=Integer.toHexString(hashCode());
		return getName()+ "-" +x+"-"+getSalary();
	}
	 
     @Override
	 public int hashCode() {	
		return empno;
	}
   
	@Override
	 public boolean equals(Object obj1) {
		// TODO Auto-generated method stub
		Object obj2=this.empno;
		return obj1 == obj2;
	}
	
	
    public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o1) {
		// TODO Auto-generated method stub
		int e1 =o1.empno;
		int e2=this.empno;
		int value=0;
		if(e1>e2) {	
			value=1;
		}
		else if(e1<e2) {
			value=-1;
		}
		else 
			value=0;
		return value;
	}
  
}
