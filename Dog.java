
public class Dog extends Pet{
	private int barkVolume;
	String trick;
	
	public Dog(String inName){
		this.name = inName;
		isHungry = true;
		trick = "fetch";
	}
	
	public String toString(){
		return this.name+" knows how to "+trick;
	}

	public String otherPrinting(){
		return super.toString();
	}
}
