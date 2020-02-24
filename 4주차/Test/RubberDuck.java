package com.kh.test.duck.model.vo;

public class RubberDuck extends Duck{
	public String PLACE="석촌호수";
	private int weight;
	
	public RubberDuck() {
		
	}
	public RubberDuck(String name, String kinds,int weight) {
		super.setName(name);
		super.setKinds(kinds);
		this.setWeight(weight);
	}
	@Override
	public void quack() {
		System.out.println( super.toString()+
				"몸무게는  "+this.getWeight()+"kg 입니다. 하지만 전 말을 하지 못해요 ");		
	}
	
	//setter getter
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}​
