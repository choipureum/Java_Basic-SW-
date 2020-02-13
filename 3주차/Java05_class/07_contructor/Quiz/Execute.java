package Java06_class.constructor;

public class Execute {
	public static void main(String[] args) {
		
		StudentService ss= new StudentService(); 
				
		System.out.println("이름과 나이를 입력하세요");
		ss.insertInfo(); //이름과 나이 입력
		System.out.println("=================");
		System.out.println("국영수 점수를 입력하세요");
		ss.insertScore(); //국영수 점수 입력		
		ss.printStu(); //학생 정보 출력
		
	}
}


