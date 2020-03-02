public class Animal extends MyCompare3 {
	public int legs;
	public String name; 
	
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	
	}
	
	public int getLegs() {
		return this.legs;
	}
}
