pakage Java03_scanner;

import java.util.Scanner;

public class ScannerEx_01{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("문자열 입력 : ");
    String text =sc.nextLine();
    System.out.println("입력값 : "+text);
    }  
    }
