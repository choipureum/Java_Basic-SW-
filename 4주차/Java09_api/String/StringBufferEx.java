package Java09_api.String;
import java.util.*;

public class StringBufferEx {
	public static void main(String[] args) {
		//스트링 버퍼 생성//생성자 매개변수 없음
		StringBuffer sb= new StringBuffer(); 
		sb.append("Apple");//스트링버퍼에 문자열 추가
		sb.append("Banana");
		System.out.println("length : "+sb.length()); //길이출력, 기본값 0
		System.out.println("capacity : "+sb.capacity()); //총 문자열을 얼마나수용할 수 있는가?(용량) //케파
		//문자열을 넣어도 바뀌지 않는다(최대 가능 용량이므로) //최대길이
		
		System.out.println("---------------------------");
		
		//스트링 버퍼 생성 //생성자 매개변수 있음
		StringBuffer sb2 =new StringBuffer("Hello");
		StringBuffer sb3 =new StringBuffer(3); //숫자로 넣으면 capacity를 직접 정할수있다 
		System.out.println("capacity : "+sb3.capacity());
		System.out.println("length : "+sb2.length());
		System.out.println("capacity : "+sb2.capacity()); //최대용량이 늘음 (16+매개변수 String.length만큼)
		
		System.out.println("---------------------------");
		
		//메소드를 통해서 가능하다(똑같은 결과값)
		info(sb);
		info(sb2);
		info(sb3);
				
		System.out.println("---------------------------");
		System.out.println(sb); //AppleBanana //sb.toString()이 사실은 출력되는 것이다
		System.out.println(sb2);
		
		//sb3의 수용량은 3//이를 초과하는 값을 입력해본다
		System.out.println(sb3.capacity()); //3
		sb3.append("Banana"); //4글자 추가
		System.out.println(sb3);//Bana (capacity+1)*2인 8로 확장
		System.out.println(sb3.capacity()); //10
		
		//---------------------------------------
		System.out.println("======QUIZ======");
		//5번째위치 인덱스에 Orange삽입
		sb3.insert(5, "Orange"); //추가할때는 기본적으로 그 인덱스위치에 문자열이 존재해야한다
		System.out.println(sb3);
		System.out.println(sb3.deleteCharAt(2)); //인덱스값을 제거하고 나머지반환	
		//1~6번째 인덱스 반환
		System.out.println(sb3.substring(1,7));
		info(sb3);
		sb3.trimToSize(); //사이즈에 맞게 케파를 조절한다(딱 맞게)
		info(sb3);
		sb3.reverse(); //문자열을 역순으로 뒤집는다
		System.out.println(sb3);	
	}
	public static void info(StringBuffer s) { //스트링 버퍼 타입을 받는다
		System.out.println("length : "+s.length());
		System.out.println("capacity : "+s.capacity());		
	}
}


//< String > 
//
//-문자열을 저장할 때마다 새로운 공간을 할당한다
//
//	String str="Apple";
//	str="Banana";
//	str="Cherry";
//
//- 문자열을 수정할 때에도 새로운 공간을 할당한다
//
//	String str="Apple";
//	str+="Banana";  (concat과 같은 역할)
//
//- 단순 문자열을 저장할 때 좋음( 더 이상 편집되지 않는 문자열 )
//	+문자열의 값이 변경이 자주 발생할 경우 공간효율(메모리 사용량),성능효율(수행시간)
//	전부 떨어진다(비효율적)
//		>>문자열의 수정, 삭제가 자주 발생할 경우
//		    **StringBuffer 나 StringBuilder를 사용하는 것이 좋다
//


//< StringBuffer, StringBuilder >
//
//- 객체 내부에 문자열 저장공간을 만들어서 관리한다
//- 문자열 저장공간을 관리하면서 문자열을 다룬다 (크기 확장, 축소 가능 )
//- 수정이 빈번한 문자열에 어울린다(새로운 공간을 계속해서 만들지 않음, 재사용)
//- 문자열 저장공간의 크기(capacity)의 기본값이 16개
//	+capacity : 문자열 저장공간의 최대 저장 크기

//- capacity보다 긴 문자열을 저장해야 한다면 크기가 확장된다
//	+(기존 capacity+1)*2 만큼 확장
//- 한번에 위의 확장량보다 큰게 들어오면 들어온 문자의 length만큼 확장된다(딱들어맞게)



// < StringBuffer와 StringBuilder의 차이점 >
//	- 다 똑같은데 하나만다르다
//	- StringBuffer는 모든 메소드가 동기화(synchronized)되어있다(Thread-Safe,스레드에 안전)
//	- StringBuilder는 비동기화 처리되어잇다
//			(동기화 : 멀티 스레드환경에서 동시에 스레드들이 접근하면 프로그램이 깨진다 -->이를 동시에 접근하지 못하게 막아주는 역할)
//	+멀티스레드 환경에서
//		StringBuffer는 스레드들이 내부 문자열 저장소를 순서대로 접근하게 만들어짐(안정성, 성능은 낮다) --더 많이쓴다
//		StringBuilder는 스레드들이 내부 문자열 저장소에 동시에 접근할 수 있음(불안정성, 성능은 높다(미세하게))
//		+둘중에 뭐가 낫다라고 할 수 없다
//	
//	+결국 멀티스레딩 환경에 맞춰 둘 중 골라서 사용해 주어야 한다



