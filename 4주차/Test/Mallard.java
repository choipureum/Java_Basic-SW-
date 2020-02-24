package com.kh.test.duck.model.vo;

public class Mallard extends Duck{
	private String location;
	private String color;
	
	public Mallard() {		
	}
	
	public Mallard(String name, String kinds, String location, String color) {
		super.setName(name);
		super.setKinds(kinds);
		this.setLocation(location);
		this.setColor(color);
	}

	@Override
	public void quack() {
		System.out.println(super.toString()+"주 서식지는 "+this.getLocation()+
				"이며, 색상은 "+this.getColor()+"입니다");
		
	}
	//getter setter
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}​
