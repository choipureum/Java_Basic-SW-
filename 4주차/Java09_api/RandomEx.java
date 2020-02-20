package Java09_api;
import java.util.*;

public class RandomEx {
	public static void main(String[] args) {		
		Random ran =new Random();
		
		System.out.println(ran.nextInt(100));//100개짜리 int범위 랜덤 난수생성
		System.out.println(ran.nextInt()); //모든 범위 난수 생성
		
		System.out.println("-----------");
		
		System.out.println(ran.nextBoolean()); //true or false 랜덤
		System.out.println(ran.nextBoolean());
		
		System.out.println(ran.nextDouble());//0~1.0  ==math.random()
		
		System.out.println(ran.nextInt(3)); //0~2
		System.out.println(ran.nextInt(3)+1);//1~3
		
		int [] arr=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt(45)+1; //1~45	
			//중복제거해서 초기화하고 다시돌기
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //배열출력
	
	}
}
//< Random Number, 난수 >
//- 의사 난수(꾸며진 난수, 진짜가 아님)
//
//- 알수 없는 값
//
//- Pseudo Random
//	**Pseudo, 수도, 슈도 : 가짜의 꾸며진
//
//	+public static double Math.random();메소드를 이용하여 의사난수를 생성한다
//
// -Random클래스를 사용한다
//
//< 의사 난수 생성 원리 >
// -기초값(seed)을 복잡한 연산을 통해 역으로 추적하기 힘들게 만든다
// - 하지만 seed가 고정되거나 미리 연산식을 알고 있다면 결과가 예측된다
// 	->해결법 : seed를 계속 바꾼다
//
// -seed를 HWClock으로 이용한다(하드웨어 클락)
//	** HWClock : 1970년 1월 1일 00시ㅡㄹ 기준으로 현재까지 흘러간 초
// - 난수를 연속적으로 추출할 때는 이전 난수를 seed로 사용한다
//
