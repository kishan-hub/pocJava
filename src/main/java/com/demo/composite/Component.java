package com.demo.composite;

import java.util.ArrayList;
import java.util.List;

public interface Component {
	
	void showPrice();

}

class Leaf implements Component
{
	int price;
	String name;
   
	public Leaf(int price,String name) {
		this.price=price;
		this.name=name;
	}
	
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+" : "+price);
	}
}

class Composite implements Component
{

	List<Component> components =new ArrayList<>();

	public boolean addComponent(Component comp) {
		return components.add(comp);
	}
	

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		for(Component comp:components) {
			comp.showPrice();
		}
	}
	
}

