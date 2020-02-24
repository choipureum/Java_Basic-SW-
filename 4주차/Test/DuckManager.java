package com.kh.test.duck.controller;​
import com.kh.test.duck.model.vo.*;
import java.util.*;

public class DuckManager {
	public static void main(String[] args) {
		RubberDuck [] rf= new RubberDuck[5]; 
		Mallard [] m =new Mallard[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			//입력받기
			System.out.print("이름 입력 : ");
			String name=sc.next();
			System.out.print("종류 입력 : ");
			String kinds=sc.next();
			System.out.print("무게입력 : ");
			int weight=sc.nextInt();
			
			rf[i]=new RubberDuck(name,kinds,weight);		
			rf[i].quack();
			
			System.out.println("--------------");
			System.out.print("이름 입력 : ");
			String name2=sc.next();
			System.out.print("종류 입력 : ");
			String kinds2=sc.next();
			System.out.print("장소입력 : ");
			String location=sc.next();	
			System.out.print("색상입력 : ");
			String color=sc.next();		
			m[i]=new Mallard(name2,kinds2,location,color);
			m[i].quack();
		}
		
	}
}
