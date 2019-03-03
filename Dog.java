package Lab3;

public class Dog extends Animal{
	String name;
	int numLegs;
	
	public Dog(String n, int legs){
		super.name=n;
		super.numLegs=legs;
	}
	
	public String toString() {
		return super.name + ", " + super.numLegs;
	}

	

}
