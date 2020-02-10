package Java05_array.array2D;

public class Array2D_Quiz {
	public static void main(String[] args) {
		
	   //입력
		int [][] arr= new int[5][5];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=cnt++;
			}
		}
		System.out.println("--Q1------------------------------------");
		//Q1
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+1+"\t");
			}
			System.out.println();
		}
		System.out.println("--Q2------------------------------------");
		//Q2
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[i][j]+1+"\t");
			}
			System.out.println();
		}
		System.out.println("--Q3------------------------------------");
		
		//Q3
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+1+"\t");
			}
			System.out.println();
		}
		System.out.println("--Q4------------------------------------");
		
		//Q4
		for(int j=arr.length-1;j>=0;j--) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][j]+1+"\t");
			}
			System.out.println();
		}
		System.out.println("--Q5내풀이-------------------------------");
		
		//Q5
		int sw=0; 
		int max=4;
		int min=0;
		int k=1;
		int H=0; int L=0;
		int [][] ar =new int[5][5];
		
		for(int i=0;i<25;i++) {			
			if(sw==0) {
				arr[H][L]=k++;
				L++;
				if(L==max) {
					sw++;
				}
			}
			else if(sw==1) {
				arr[H][L]=k++;
				H++;
				if(H==max) {
					sw++;
					max--;
				}
			}
			else if(sw==2) {
				arr[H][L]=k++;
				L--;
				if(L==min) {
					sw++;
					min++;					
				}
			}
			else if(sw==3) {
				arr[H][L]=k++;
				H--;
				if(H==min) {
					sw=0;				
				}
			}			
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
	}
}
