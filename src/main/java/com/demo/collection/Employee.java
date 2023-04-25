package com.demo.collection;

public class Employee {
	


	private String firstName;
	
	private String lastname;
	
	private int id;
	
	
	public Employee(String firstName, String lastname, int id) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastname=" + lastname + ", id=" + id + "]";
	}
	
	@Override
	public int hashCode() {
	    int result =firstName.hashCode();
	    result = 31 * result + lastname.hashCode();
	    result = 31 * result + id;
	    result =31 * result + id;
	    return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if( obj == null || getClass() !=obj.getClass()) return false;
		
		Employee employee = (Employee) obj;
		
		if(id !=employee.id) return false;
		if(!firstName.equals(employee.firstName)) return false;
		
		return lastname.equals(employee.lastname);
		
	}

}
