package Java08_abstract.interfaceEx.Quiz;

public class Taxi implements Fare{
	@Override
	public void calc(int distance) {		
		System.out.println(distance+" M를 운행했을 때 요금은  "+(FEE*distance*2)+" 원입니다");
		
	}

}
