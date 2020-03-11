package Java11_generic;
import java.util.*;


public class Generic_03_GenericMethod {
	
	public static void main(String[] args) {
        	
		Class03 c = new Class03();
		c.print(123); //타입파라미터를 지정하지 않음, T를 자동으로 Integer로 결정
//		c.<Double>print(555); //매개변수에서 T를 Integer로 정해졌기 때문에 Double로 바꾸면 충돌 ->에러
		c.<Double>print(12.34); //->에러 발생 X
	}
}

	class Class03{
		//일반 메소드
		public void display(int n) {
			
		}
		//제네릭 메소드
		public <T> T print(T t) { //반환타입, 매개변수, 지역변수에서 사용가능
			T data = (T)null; // int 값을 넣으면 에러가 난다 //별개의 데이터
			return data; //
		}		
	}
	class Class02<T>{
		
		//제네릭 메소드
		public <K> void display(K obj, T data) {  //자기 타입인 K도 사용가능하고 클래스 타입 T도 사용가능하지만 진짜 안쓰이는경우
			
		}
	}
//
//	< 제네릭 메소드 > 
//	   
//	   - [접근제한자]<Type1,Type2....> [리턴타입] 메소드명(매개변수){
//	//동적코드
//	}
//
//	   - 메소드 내에서 사용되는 데이터타입을 일반화시켜 정의한다
//	   - 매개변수, 반환타입, 지역변수,...
//	   - 제네릭 메소드를 호출하면서 타입파라미터를 결정해준다
//	   
//		ex) obj.<타입파라미터> 메소드명(인자)
//		ex) obj.메소드명(인자);
//			-> 매개변수가 타입파라미터를 사용하고 있어야 가능
