/*Caspar Chen July 31 2017*/
import java.util.Scanner;
import java.util.ArrayList;
public class HW13 {

	public static void main(String[] args) {
		int ans1,ans2;
		int index=0;
	    boolean restart=true;
		ArrayList <Integer> vals= new ArrayList<Integer>();
		Scanner scnr = new Scanner(System.in);
		//restart the game if the user does not enter 0
		while(restart){
		System.out.print("enter initial number of skydivers: ");
		ans1=scnr.nextInt();
		if(ans1!=0){
		System.out.print("enter the skip number: ");
		ans2=scnr.nextInt();
		//add all players in the ArrayList
		for(int i=0;i<ans1;i++){
			vals.add(i);
		}
		System.out.print("jumpers: ");
		 while (vals.size() != 1){
		//get the "name" of jumpers 
		System.out.print(vals.get(index) + " ");
		vals.remove(index);
		index = (index + ans2) % vals.size();
		}
		System.out.println();
		System.out.println("sole diver left on plane = "+vals.get(0)+"\n");
		vals.remove(0);
		}
		else{
			restart=false;
		}
	}

}
}

