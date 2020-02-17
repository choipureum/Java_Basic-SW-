package Java07_inherit.controller;
import java.util.*;
import Java07_inherit.Quiz.*;

public class controller {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point []p=new Point[5];
		Circle[] c =new Circle[5];
		Rectangle[]r=new Rectangle[5];		
			
		System.out.println("===========원 출력==========");
		for(int i=0;i<3;i++) {	
			c[i]=new Circle((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
			c[i].draw();
		}
		System.out.println("==========사각형출력==========");
		for(int i=0;i<3;i++) {
			r[i]=new Rectangle((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
			r[i].draw();
		}
		
		System.out.println("========Point출력=========");		
		for(int i=0;i<5;i++) {
			int x=(int)(Math.random()*100);
			int y=(int)(Math.random()*100);
			p[i]=new Point(x,y);	
			p[0]=new Point(x,y);	
			p[1]=new Circle(x,y,(int)(Math.random()*100));
			p[2]=new Rectangle(x,y,(int)(Math.random()*100),(int)(Math.random()*10)) ;		
			p[0].draw();
			p[1].draw();
			p[2].draw();
			
		}	
	}
}
