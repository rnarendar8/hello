package day2n;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		
		int upAcs=(int)'A';
		int lowAcs=(int)'a';
		int diff=upAcs-lowAcs;
		if	(diff<0) diff=-diff;
		System.out.println(diff);
		Scanner sc=new Scanner(System.in);
		char ch;
		char cod;
		do {
			System.out.println("enter any char");
			ch=sc.next().charAt(0);
			if((ch>='A')&&(ch<='Z')) {
				ch=(char)(ch+diff);
				System.out.println("upper");
			}
			else if((ch>='a')&&(ch<='z')) {
				ch=(char)(ch-diff);
				System.out.println("lower");
			}
			System.out.println("after conversion ........ch---->"+ch);
			System.out.println("do you want to continue if yes please press y/n");
			cod=sc.next().charAt(0);
			
			if(cod=='n') cod=0;
			else code=1;
		}
		while(cod==1);
		System.out.println("ends");
	}
}
		
	
