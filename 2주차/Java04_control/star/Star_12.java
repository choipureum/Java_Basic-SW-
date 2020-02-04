  
package Java04_control.star;

public class Star_12 {
	public static void main(String[] args) {

		int temp=5;
		
		for(int i=1;i<=10;i++) {
			if(i<=temp) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int k=5;k>i-5;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
}
}
}
