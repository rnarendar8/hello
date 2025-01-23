package day2n;

public class Example2 {
	public static void main(String[] args) {
		int num=885,max=0,min=9;
		
		while(num !=0) {
			int n=num%10;
			if(n>max)max=n;
			if(n<min)min=n;
			
			num=num/10;
		}
		System.out.println("max----->"+max);
		System.out.println("min----->"+min);
		
	}

}
