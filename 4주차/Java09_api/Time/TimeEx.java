package java09_api.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeEx {
	public static void main(String[] args) {
		
		// java.util.Date Class
		
		Date dToday = new Date();//Date객체 생성 - 현재 날짜/시간 입력됨
		System.out.println( dToday ); //Date 객체 출력

		Date dToday2 = new Date( 0L );
		System.out.println( dToday2 ); //Date 객체 출력

		//추가 메소드 대부분이 deprecated 되어 있음
		
		// java.util.Date 클래스의 세부 정보(날짜/시간)를 파악하려면
		//Caleandar 클래스의 get() 메소드를 사용해야한다
		
		
		
		System.out.println("------------------------------");
		
		
		
		
		// java.util.Calendar Class
		
		Calendar cToday = Calendar.getInstance(); //Calendar 객체 생성
		
		System.out.println(cToday); //객체 정보 전체를 출력함
		
		System.out.println( cToday.get( Calendar.YEAR ) ); //년도
		System.out.println( cToday.get( Calendar.MONTH ) ); //월(0 : 1월)
		System.out.println( cToday.get( Calendar.DATE ) ); //일

		System.out.println( cToday.get( Calendar.HOUR ) ); //12시간 기준 시
		System.out.println( cToday.get( Calendar.HOUR_OF_DAY ) ); //24시간 기준 시
		System.out.println( cToday.get( Calendar.MINUTE ) ); //분
		System.out.println( cToday.get( Calendar.SECOND ) ); //초
	
		
		
		System.out.println("------------------------------");
		
		
		
		
		// java.util.GregorianCalendar Class
		
//		GregorianCalendar gToday = new GregorianCalendar();
		GregorianCalendar gToday
			= new GregorianCalendar(1997, 4, 6, 20, 7, 9);
		
		System.out.println(gToday);
		
		System.out.println( gToday.get( Calendar.YEAR ) ); //년도
		System.out.println( gToday.get( Calendar.MONTH ) ); //월(0 : 1월)
		System.out.println( gToday.get( Calendar.DATE ) ); //일

		System.out.println( gToday.get( Calendar.HOUR ) ); //12시간 기준 시
		System.out.println( gToday.get( Calendar.HOUR_OF_DAY ) ); //24시간 기준 시
		System.out.println( gToday.get( Calendar.MINUTE ) ); //분
		System.out.println( gToday.get( Calendar.SECOND ) ); //초
	
		
		
		System.out.println("------------------------------");
		
		
		
		
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); // Date -> Calendar 적용
		
		// -----------------
		
		GregorianCalendar greCal = new GregorianCalendar();
		greCal.setTime(now); // Date -> GregorianCalendar
		
		// -----------------
		
		Date res1 = cal.getTime(); // Calendar -> Date
		Date res2 = greCal.getTime(); // GregorianCalendar -> Date
		
	}
}

















