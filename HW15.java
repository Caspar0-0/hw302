import java.util.Scanner;
public class HW15 {
	public static Scanner scnr = new Scanner(System.in);
	public static void main(String[] args){
		Forester frank =  new Forester();
		Tree[] forest = new Tree[2];
		BathTub rainBarrel;
		System.out.print("Enter three ints for the size of the elm, maple, and bathtub: ");
		forest[0] = new Elm(scnr.nextInt());
		forest[1] = new Maple(scnr.nextInt());
		rainBarrel = new BathTub(scnr.nextInt());
		for(int i = 0; i<forest.length; i++){
			System.out.println("\nBefore working: "+frank+", and Tree#"+i+" is a "+forest[i]);
			frank.useTree(forest[i]);
			System.out.println("After working: "+frank+", and Tree#"+i+" is a "+forest[i]);
		}
		System.out.println();
		frank.batheIn(rainBarrel);
		scnr.close();
	}
}