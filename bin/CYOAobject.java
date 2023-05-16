
public class CYOAobject {
	
	static boolean orb = false;

	
	public static String intro(String name) {
		return "You, " + name + " are prowling at night. It is 2:53 am and you are in a suburb you have prowled many times before. Your"
				+ "\n attention is grabbed by a flashing glowing light coming from down the road. Do you investigate?\r\n";
	}
	
	
	
	public static String firstChoice(boolean jimmyJohns) {
		
		if(jimmyJohns) {
			orb = true;
			return "You approach the glow. Static electricity lifts the hairs on your body as you lose conciousness. \r\n";
		}
		else {
			return "You continue prowling for the rest of the night. You harass the night staff at the local burger king for a few hours before returning home.";
		}		
	}
	
	public static String showerScene(boolean orb) {
		if(orb) {
			return "Upon taking a shower you notice a strange tingling in your abdomen, while rubbing soap up on that you notice the soap begin to boil";
		}
		else {
			return "You take a shower, It's a normal shower";
		}
	}
	
	public static String secondScene(boolean orb) {
		if(!orb) {
			return "you take a test today it is boring" + "\n" + "you get home tired and lonely, nothing good seems to be happening lately" + "\n" + "it seems like every day is shorter than the rest," 
		+ "you age quicker than you want, and eventually find yourself on your deathbed, surrounded by faces you can no longer recognize" + "\n" + "you have a moment of clarity from your dementia and wonder what would have happened had you gone toward the glow... the end";
		}
		else {
			return "on the way to school a lizard man aproaches you and point his finger at your chest, it begins to vibrate and your hands swell with energy"
					+ "\n" + "you feel like you could fight the lizard man. Do you? yes or no???";
		}
	}
	
	public static String lizard(boolean boll) {
		if(boll) {
			return ("how do you attack" + "\n" + "A: lazer ball" + "\n" + "B: Punch" + "\n" + "C: 2 lazer balls" + "\n" + "D: kick");
		}
		else {
			return "you run away and live happily for 3 months before dying of a radiation induced tumor in the ICU. the end";
		}
	}
	
	public static String fightScene(String s) {
		if(s.equals("A")) {
			return "the lizard looks aproximately half dead, but he eats you regardless. The End";
		}
		else if(s.equals("B")) {
			return "your arm is bitten off and you bleed out and die. The END";
		}
		else if(s.equals("C")) {
			return "The lizard dies of the lazer ballage" + "\n" + "the Navy is so happy that you finally killed the lizard they give you $50" + "\n" + "do you thank the officer?? yes or no??";
		}
		else {
			return "your leg is violently removed and munched on by the lizz. The END";
		}
	}
	
	
	public static String navyBossfight() {
		return "what is your action" + "\n" + "A: surrender" + "\n" + "B: cry" + "\n" + "C: 2 lazer balls" + "\n" + "D: double kicks";
	}
	
	public static String navyAttack(String s) {
		if(s.equals("A")) {
			return "you die. The End";
		}
		else if(s.equals("B")) {
			return "you die. The END";
		}
		else if(s.equals("C")) {
			return "you die? The end...???";
		}
		else {
			return "you die. The END";
	}
	
	
	
	
	
	
	
}
}