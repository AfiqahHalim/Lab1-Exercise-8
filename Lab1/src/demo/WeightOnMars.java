package demo;

public class WeightOnMars {
	
	public static void main(String[] args) {
		
		int a;
		double weightOnMars;
		double b;
		
		a = 55; 
		b = a * 9.8;
		
		System.out.println("Human weight on Earth (in kg) = " + a );
		System.out.println("Human weight on Earth (in Newton) = " + b );
		
		weightOnMars = (a * 9.8) / 3 ;
		
		System.out.println("Human weight on Mars (in Newton) = " + weightOnMars );
	}
	
	

}
