
/*Caspar Chen July 14 2017 */
	import java.util.Scanner;
	public class MollysRoom {
		

		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			Scanner strScan;
			
			String ans = "";
			String ans2 = "";
			String words1 = "";
			boolean inputNext=true;
			//loop for a new turn if user does not hit enter key
			do {
			System.out.print("What do you see in Molly's Room? ");
			ans = scnr.nextLine();
			ans2 = ans.replace(" ","");
			strScan = new Scanner(ans);
			inputNext = true;
			
			
			//check if there are any number of words that are eligible for double letter rule
			while(strScan.hasNext()&&inputNext){
			words1=strScan.next();
			if(doubleLetters(words1)){
				inputNext = true;
			}
			else {
				inputNext = false;
			}
				
			}
			
			if(inputNext&&ans.length() != 0&&ans2.length()!=0){
		System.out.println("Yes, that is there");
			}
			//answer No if user inputs have only whitespace
			else if((!inputNext&&ans.length() != 0)||(ans2.length()==0&&ans.length()!=0)){
		System.out.println("No, that is not there");
			}
			
			
			
		}while (ans.length() != 0);
			System.out.print("Goodbye");
	}
		/**
		 * This method is to check whether a word has same adjacent double letters
		 * @param answer refers to the user input for the word
		 * @return true if this word has same adjacent double letters, false otherwise
		 */
		public static boolean doubleLetters(String answer) {
			
			for(int i =0;i<answer.length()-1;i++){
				if(Character.toUpperCase(answer.charAt(i))==Character.toUpperCase(answer.charAt(i+1))){
					return true;
				}
				
			}
				
			return false;
			
		}

		}

