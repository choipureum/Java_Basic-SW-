package Java06_class.constructor;
import java.util.*;

//기능 클래스
public class StudentService {
	private Scanner sc=new Scanner(System.in);
	private Student stu = new Student();	
	
	
	public StudentService() {
		//sc = new Scanner(System.in);
		//stu=new Student(); 여기서 초기화해도 
	}
	public void insertInfo() {
			System.out.print("이름 : ");
			stu.setName(sc.next());
			System.out.print("나이 : ");
			stu.setAge(sc.nextInt());
	}

	public void insertScore() {
		System.out.print("국어점수 : "+"\n");
		stu.setKor(this.sc.nextInt());
		System.out.print("영어점수 : "+"\n");
		stu.setEng(this.sc.nextInt());
		System.out.print("수학점수 : "+"\n");
		stu.setMath(this.sc.nextInt());		
	}
	public void calcSum() {
		stu.setSum(stu.getEng()+stu.getKor()+stu.getMath());
	}
	public void calcAvg() {
		stu.setAvg((stu.getEng()+stu.getKor()+stu.getMath())/3.0);
	}
	public void printStu() {
		System.out.println("========================");
		System.out.println("이름 : "+stu.getName());
		System.out.println("나이 : "+stu.getAge());
		System.out.println("국어점수 : "+stu.getKor());
		System.out.println("영어점수 : "+stu.getEng());
		System.out.println("수학점수 : "+stu.getMath());
		calcSum();
		calcAvg();
		System.out.println("총점 : "+stu.getSum());		
		System.out.println("평균점수 : "+String.format("%.2f", stu.getAvg()));		
	}
}

//	--------------------
//	class StudentService
//	--------------------
//	- stu : Student
//	- input : Scanner
//	--------------------
//	<<constructor>>
//	+ StudentService()
//
//	<<method>>
//	+ insertInfo() : void
//	+ insertScore() : void
//	+ calcSum() : void
//	+ calcAvg() : void
//	+ printStu() : void
//	--------------------
