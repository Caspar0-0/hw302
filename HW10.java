
/*Caspar Chen July 13 2017 */
import java.util.Random;
public class HW10 {
		public static void main (String[] args){

			final int SEED = 444;
			final int TRIALS = 100000;
			final int MAXLIMIT = 1023;
			int totTurns =0;//sum of total number of turns in TRIALS
			int solutions;
			Random rangen = new Random(SEED);//set seed
			int limit, guess, currMin, currMax, turns, gameNum=1;
			
			String ans="", again;
			
			do{
				
				System.out.println("This is game#"+gameNum);
				
					limit = MAXLIMIT;
					solutions = rangen.nextInt(limit);
					System.out.println("Enter a max: "+limit);
					System.out.println("shhhh... my secret number is "+solutions);
				
				currMin = 0;
				currMax = limit-1;
				turns = 0;
				
				do{
					guess = (currMax + currMin)/2;
					if(guess<solutions){
						ans ="L";
						
					}
					else if(guess>solutions){
						ans ="H";
					}
					else if(guess==solutions){
						ans ="X";
					}
					
						System.out.println("Is my guess of "+guess+" too Low, too High, or eXact? "+ans);
						
					
					turns++;
				
					switch(ans){
					case "H": 
						currMax = guess-1; 
						break;
					case "L": 
						currMin = guess +1; 
						break;
					default: 	// this case only gets hit if ans = X
						System.out.println("I got lucky and won on turn "+turns+"!"); 
					}
				} while(!((currMax==currMin) || ans.equals("X")));
				
				 if(!ans.equals("X")){
					System.out.println("In "+turns+" turns, I have logically deduced based on your responses "+
							"that your number must be "+currMax);
				}
				 totTurns +=turns;
				 System.out.println("");
				System.out.print("Do you wish to play again (Y/N)? ");
				if(gameNum >=TRIALS){
					again ="No";
				}
				else{
					again ="Yes";
					gameNum++;
				}
				System.out.println(again);
				
				System.out.println("");
			} while (!(again.charAt(0)=='n'||again.charAt(0)=='N'));
		
		
	//the average number of guess = total number of turns/total number of games
			System.out.println("The average number of guesses was "+(double)totTurns/TRIALS);
			}
		}