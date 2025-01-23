package day2n;

public class Example5 {
	
	public static void main(String[] args) {
		
		System.out.println("math.round(1.8545)--->"+Math.round(1.8545));
		double num=1.34792;
		int m=(int)(num*10);
		int r=m%10;
		m=m/10;
		if(r>5) {
			m=m+1;
			
		}
		System.out.println(m);
		
	}

}
