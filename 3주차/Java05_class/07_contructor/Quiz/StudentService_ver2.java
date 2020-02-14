package Java06_class.constructor;

import java.util.Scanner;

public class StudentService_ver2 {
	private Scanner sc=new Scanner(System.in);	
	private Student [] stuArr = new Student[3];	 //배열은 초기화지만 하나하나에대한 
	                                        //초기화는 아니다 -->생성자를 통해초기화
	
	public StudentService_ver2(){
		//초기화를 해줘야한다
		stuArr[0]=new Student();
		stuArr[1]=new Student();
		stuArr[2]=new Student();
	}
	
	private int getIdx() {		
		return sc.nextInt();
	}	
	public void insertInfo(Student [] stuArr,int select) {
			System.out.print(select+"학생 이름 : ");
			stuArr[select-1].setName(sc.next());
			System.out.print(select+"학생 나이 : ");
			stuArr[select-1].setAge(sc.nextInt());
	}
	public void insertInfoAll() {
		System.out.println("=============");
		insertInfo(stuArr,1);
		insertInfo(stuArr,2);
		insertInfo(stuArr,3);
}
	public void insertInfoIdx() {
		System.out.print("몇번째 학생입니까 : ");		
		int Idx=getIdx();
		insertInfo(stuArr, Idx);
}
	public void insertScore(Student [] stuArr,int select) {
		System.out.print(select+"학생 국어점수 : "+"\n");
		stuArr[select-1].setKor(this.sc.nextInt());
		System.out.print(select+"학생 영어점수 : "+"\n");
		stuArr[select-1].setEng(this.sc.nextInt());
		System.out.print(select+"학생 수학점수 : "+"\n");
		stuArr[select-1].setMath(this.sc.nextInt());		
	}
	public void insertScoreAll() {
		System.out.println("=============");
		insertScore(stuArr,1);
		insertScore(stuArr,2);
		insertScore(stuArr,3);
}
	public void insertScoreIdx() {
		System.out.print("몇번째 학생입니까 : ");		
		int Idx=getIdx();
		insertScore(stuArr, Idx);
}
	public void insertStuAll() {
		System.out.println("=============");
		insertInfo(stuArr,1);
		insertInfo(stuArr,2);
		insertInfo(stuArr,3);
		insertScore(stuArr,1);
		insertScore(stuArr,2);
		insertScore(stuArr,3);
}
	
	
	public void calcSum(Student [] stuArr) {
		for(int i=0;i<3;i++) {
		stuArr[i].setSum(stuArr[i].getEng()+stuArr[i].getKor()+stuArr[i].getMath());
		}
	}
	public void calcAvg(Student [] stuArr) {
		for(int i=0;i<3;i++) {
			stuArr[i].setAvg((stuArr[i].getEng()+stuArr[i].getKor()+stuArr[i].getMath())/3.0);
		}
	}
	public void printStu(Student [] stuArr, int select) {
		System.out.println("========================");
		System.out.println(select+"학생 이름 : "+stuArr[select-1].getName());
		System.out.println(select+"학생 나이 : "+stuArr[select-1].getAge());
		System.out.println(select+"학생 국어점수 : "+stuArr[select-1].getKor());
		System.out.println(select+"학생 영어점수 : "+stuArr[select-1].getEng());
		System.out.println(select+"학생 수학점수 : "+stuArr[select-1].getMath());
		calcSum(stuArr);
		calcAvg(stuArr);
		System.out.println(select+"학생 총점 : "+stuArr[select-1].getSum());		
		System.out.println(select+"학생 평균점수 : "+String.format("%.2f", stuArr[select-1].getAvg()));		
	}
	public void printStuAll() {
		for(int i=0;i<3;i++) {
			printStu(stuArr,i+1);
		}
	}
	public void printStuIdx() {
		System.out.print("몇번째 학생입니까 : ");		
		int Idx=getIdx();
		printStu(stuArr, Idx);
	}
}
