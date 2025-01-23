package day2n;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		char ch;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter any character");
		ch=input.next().charAt(0);
		if((ch>='A')&&(ch<='Z')||(ch>='a')&&(ch<='z')) {
			System.out.println("its alphabet");
		}
		else if(ch>='1'&&ch<='9') {
			System.out.println("its number");
		}
		else System.out.println("special char");
		System.out.println("math.round(1.325)---->"+Math.round(1.253));
	}
	

}
