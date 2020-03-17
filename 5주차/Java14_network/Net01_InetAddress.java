package Java14_network;
import java.net.*;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		InetAddress ip = null; //IP주소 표현 객체
		
		try {
			//host를 매개변수에 넣어준다 (인터넷 주소)
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) { //호스트주소가 없다면~ 예외
			e.printStackTrace();
		} 
		//호스트네임 : 노드들을 구분하기 위해 지정한 이름
		//도메인네임 : 호스트네임의 일종으로 IP와 매핑한 이름
		
		//호스트 네임 반환
		System.out.println("HostName : "+ip.getHostName());
		//호스트 IP주소를 반환
		System.out.println("HostAddress : "+ip.getHostAddress());
		
		//-------------------------
		
		try {
			//로컬호스트(자기자신)의 IP정보를 얻어옴
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		//호스트 네임 반환
		System.out.println("HostName : "+ip.getHostName());
		//호스트 IP주소를 반환
		System.out.println("HostAddress : "+ip.getHostAddress());
		
		
		//-----------------------------
		
		//IP주소를 byte배열로 반환
		byte [] ipAddr = ip.getAddress(); //getAddress는 바이트배열 반환 (중요) -역할을 알아두기!!
		System.out.println(Arrays.toString(ipAddr)); //192.168.20.67 =>[-64, -88, 20, 67]  overflow발생(byte =-128~128)
		
		//for문을 통해 출력해보기
		for(int i:ipAddr) {
			//overflow 방지
			if(i<0) {
				System.out.print((i+256)+" ");
			}
			else {
				System.out.print(i+" ");
			}
			
		}
	
	}
}












