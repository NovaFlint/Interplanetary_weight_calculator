//Make animated solar system selection GUI
public class generator {
 static float weight = 100.0f;
 static boolean withSpaceSuit = true;
 static float gravity = 0.38f;
 static float output;
 static String planet = "Mars";
	
	public static void main(String args[]){
		/*if (mars gets selected){
			gravity = 0.38f;
			planet = "Mars";
		}
		elseIf (earth gets selected){
			gravity = 1f;
			planet = "Earth";
		}
		elseIf (jupiter gets selected){
		gravity = 2.4f;
		}*/
		//if (go button gets pressed){
			output = weight;
			if (withSpaceSuit == true){
				output += 21;
			}
			output *= gravity;
			if (withSpaceSuit == true){
			System.out.println("You and your space suit would weigh " + output + "kg on " + planet);
			}
			else{
				System.out.println("You would weigh " + output + "kg on " + planet);
			}
		//}
	}
}
