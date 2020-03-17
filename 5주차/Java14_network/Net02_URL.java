package Java14_network;
import java.net.*;

public class Net02_URL {
	public static void main(String[] args) {
		
		String urlStr = "https://docs.oracle.com/javase/8/docs/api/java/net/URL.html";
		
		URL url =null;
		
		try {
			url = new URL(urlStr);
			
			//url의 형식을 안지켰을때의 에러
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("URL의 프로토콜"+url.getProtocol());
		System.out.println("URL의 호스트: "+url.getHost());
		System.out.println("URL의 포트"+url.getPort());
		System.out.println("URL의 파일경로"+url.getFile());
		System.out.println("URL의 전체"+url.toExternalForm());
	}
}
