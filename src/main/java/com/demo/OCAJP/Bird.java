package com.demo.OCAJP;

public interface Bird { 
	
	String color();
	
	String fly();
}

class Egale implements Bird
{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "i am black";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "fly very high";
	}
	
}

class Parrot implements Bird
{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "i am green ";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "fly in medium ";
	}
	
}


class Ostrich implements Bird{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "i am blue";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "does  not fly";
	}
	
}