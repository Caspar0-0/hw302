/** Caspar Chen August 8 2017 **/
public class Forester {
	protected int dirtLevel;
	
/**
 * 	This method takes a BathTub as an argument and fills the tub, cleans the forester, then drains the tub.
 * @param userBathTub refers to a BathTub object
 */
public void batheIn(BathTub userBathTub){
	userBathTub.fill();
	userBathTub.clean(this);
	userBathTub.drain();
}
/**
 * This method which takes a Tree as an argument and displays a statement that 
 * the forester is working on this tree, increases his/her dirtLevel by 5, 
 * then the forester chops the tree and if it's a maple tree also drains it.
 * @param userTree refers to a Tree object
 */
public void useTree(Tree userTree){
	System.out.println("The forester is now going to work on this tree.");
	this.dirtLevel+=5;
	userTree.chopped();
	if (userTree instanceof Maple){
		((Maple) userTree).drain();
	}
}

@Override
public String toString(){
	
	if (this.dirtLevel>7){
		return  "This forester is now dirty";
	}
	else{
		return "This forester is still clean";
	}
}
}
