package Practice;

public class For_10 {
	public static void main(String[] args) {
		
		//중첩 for 반복 생각해보기
		
		for(int i=2;i<=9;i++) {
			System.out.println("< "+i+"단  >");
			System.out.println();
			
			for(int j=1;j<=9;j++) {
				System.out.println(i+" * "+j+" ="+" "+i*j);
			}			
			System.out.println("--------------\n");
	}
}
}
