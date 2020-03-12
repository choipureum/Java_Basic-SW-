package Java12_exception;

public class Exception_02_try {

	   public static void main(String[] args) {
	      
	      int[] arr= new int [5]; //인덱스 : 0~4       인덱스 < 0 , ==4, > 0
	      
	      int i=0;
	      
	      try {
	         
	         while(true) { //무한루프

	            //i가 5가 될때 인덱스를 벗어나느거
	            
	            arr[i]=i+1; //배열에 값 대입
	            
	            System.out.println(arr[i]); //배열의 요소 출력
	            
	            System.out.println("--- "+i+" 번째 완료 --- ");
	            i++;
	            
	            
	         }
	         
	      } catch ( ArrayIndexOutOfBoundsException e) {
//	         
	         System.out.println("[SYSTEM] 인덱스는 "+ arr.length
	               +" 보다 작아야 합니다.");
	         
	         e.printStackTrace(); //예외정보를 출력한다
	      }
	      
	      System.out.println("+ + + 프로그램 정상종료 + + + ");
	      

	      
	   }
	}
	      


	//+ 예외 처리 구문, Exception Handling
	//
	// - try - catch 구문
	// 
//	    try {
//	       
//	       //예외가 발생할 수 있는 코드
//	       
//	       코드 1;
//	       코드 2;
//	       코드 3; //예외발생
//	       코드 4;
	//    
//	       
//	       
//	       
//	    } catch ( Exception e ) {
//	       // 예외 처리 코드
	//
//	       
//	    } finally {
//	       // 생략 가능
//	       // 예외 발생과 상관없이 반드시 실행해야하는 코드
//	       
//	       코드 5; //반드시 실행해야 하는 코드
//	       
//	    }
