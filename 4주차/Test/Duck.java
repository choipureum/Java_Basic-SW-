package com.kh.test.duck.model.vo;

abstract public class Duck {
	private String name;
	private String kinds;
	
	public Duck() {
		
	}
	public Duck(String name, String kinds) {
		
	}
	public abstract void quack();
	
	@Override
	public String toString() {		
		return "저는 "+kinds+"이고, 이름은 "+name+"입니다";
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
}
