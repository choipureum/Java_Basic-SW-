package Java08_abstract.interfaceEx.Quiz;

public class TaxiEx {
	public static void main(String[] args) {
		Taxi taxi =new Taxi();
		
		//요금 =거리 *비용*2
		int distance =(int)(Math.random()*10000);
		taxi.calc(distance);
		
		//출력
		// calc()메소드를 이용하여 출력한다
		//2500m를 운행했을 때 요금은 xxx원 입니다
	}
}
