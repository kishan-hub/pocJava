package com.demo.array;

public class Employee {

  private int empno;
  
  private String name;
  
  private long salary;
   
	public Employee(int empno, String name, long salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	 @Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
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

  
}
