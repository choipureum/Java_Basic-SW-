package Java09_api;

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println(Math.PI); //원주율
		System.out.println(Math.abs(-10)); //절대값
		System.out.println(Math.ceil(3.8)); //올림
		System.out.println(Math.floor(3.7)); //내림
		System.out.println(Math.round(-3.7)); //반올림
		System.out.println(Math.pow(2.1, 3)); //제곱
		
		System.out.println("--------------------");
		
		System.out.println(Math.max(10, 20)); // 둘중에 큰값을 반환
		System.out.println(Math.min(10, 20)); //작은값 반환
		
		int n1=11;
		int n2=19;
		for(int i=Math.min(n1, n2);i<Math.max(n1, n2);i++) {			
		}//이런 반복문도 가능
		System.out.println("--------------------");
		
		//0.0포함~1.0미포함
		System.out.println((int)(Math.random()*100)); //난수 ->0~1사이의 값을 출력(double)
		
				
	}
}
//< Math 클래스 >
//- 수학(산술)적인 연산을 정적메소드로 제공하는 클래스
//- 멤버필드로 E(자연상수),PI(원주율) 두 가지를 정적멤버로 가지고 있다
//- 사용방법
//	Math.abs(-5);  -->5
