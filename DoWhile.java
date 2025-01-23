package day2n;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		char ch;
		char cod;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter any char");
			ch=sc.nextInt().charAt(0);
			
			if((ch>='A')&&(ch<='Z')) {
				System.out.println("ch is upper");
			}
			else if((ch>='a')&&(ch<='z')){
				System.out.println("ch is lower");
				
			}
			
		}
				
	}

}
