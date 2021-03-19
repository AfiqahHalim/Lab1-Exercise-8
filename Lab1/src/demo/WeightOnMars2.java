package demo;

public class WeightOnMars2 extends WeightOnMars {
	
	public WeightOnMars2(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WeightOnMars person1 = new WeightOnMars("Person 1");
		
		person1.setMass(55); 
		person1.setWeight(179.667);
		
		System.out.println ("\n Person 1 : ");
		System.out.println (" Human mass on Earth in (kg) " + person1.mass);
		System.out.println (" Human weight on Mars in (Newton) " + person1.weight);
		
WeightOnMars person2 = new WeightOnMars("Person 2");
		
		person2.setMass(64); 
		person2.setWeight(209.067);
		
		System.out.println ("\n Person 2 : ");
		System.out.println (" Human mass on Earth in (kg) " + person2.mass);
		System.out.println (" Human weight on Mars in (Newton) " + person2.weight);
	
WeightOnMars person3 = new WeightOnMars("Person 3");
		
		person3.setMass(88); 
		person3.setWeight(287.467);
		
		System.out.println ("\n Person 3 : ");
		System.out.println (" Human mass on Earth in (kg) " + person3.mass);
		System.out.println (" Human weight on Mars in (Newton) " + person3.weight);
	}
	

}
