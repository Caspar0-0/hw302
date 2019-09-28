
public class HW12 {

	public static void main(String[] args) {
		Dog myFirstPet = new Dog("Rover");
		Cat mySecondPet = new Cat("Princess");
		Cat neighborFirstPet = new Cat("Frisky");
		Dog neighborSecondPet = new Dog("Fido");
		for(int i=0; i<5;i++){
			myFirstPet.engages(neighborSecondPet);
		}
		neighborFirstPet.engages(mySecondPet);
		for(int i=0;i<6;i++){
			myFirstPet.engages(neighborFirstPet);
		}
	}
}