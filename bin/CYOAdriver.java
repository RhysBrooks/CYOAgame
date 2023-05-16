import java.util.Scanner;


public class CYOAdriver {
	public static void main(String[] args) {

		boolean keepPlaying = true;
		boolean yn1 = false;		
		Scanner s = new Scanner(System.in);
		Scanner j = new Scanner(System.in);

		// loops there is 2 cause im tweakin
		while(keepPlaying) {

			while(keepPlaying) {

				System.out.println("enter your first name");

				String name = s.next();
				// please only put 1st name
				System.out.println(CYOAobject.intro(name));

				System.out.println("yes or no");
				String response = s.next();
				

				if(response.equals("yes")) {
					yn1 = true;
				}
				else {
					yn1 = false;
				}
				// 1st outcome
				System.out.println(CYOAobject.firstChoice(yn1));
				System.out.println("You awake in your bed the next day..");

				System.out.println(CYOAobject.showerScene(yn1));
				System.out.println(CYOAobject.secondScene(yn1));

				if(yn1 == false) {
					break;
				}

				String FTL = s.next();
				
				if(FTL.equals("no")) {
					System.out.println(CYOAobject.lizard(FTL.equals("yes")));
					break;
				}

				System.out.println(CYOAobject.lizard(FTL.equals("yes")));

				String fight = s.next();
				System.out.println(CYOAobject.fightScene(fight));
				if(!fight.equals("C")) {
					break;
				}
				// We support the navy. Navy Strong
				String thankedNavy = s.next();

				if(fight.equals("C") && thankedNavy.equals("yes")) {
					System.out.print("you forever have the gratitude of the US navy and live as a decorated seaman for 3 months before dying of a tumour in your chest in the ICU");
					break;
				}

				else if(fight.equals("C") && thankedNavy.equals("no")) {
					System.out.println("they want to kill you");
					System.out.println(CYOAobject.navyBossfight());
					break;
				}
				// you can't beat the navy :'(
				String nextMove = s.next();

				System.out.println(CYOAobject.navyAttack(nextMove));
				break;


			}
			System.out.println("You want to play again,,, true or false... ...");
			keepPlaying = j.nextBoolean();
		}
		// closes the loopy
		s.close();
		j.close();
	}
}
