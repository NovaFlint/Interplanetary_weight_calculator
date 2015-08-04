public class generator {
	static float a = 1f;
	static float weight = 100.0f;
	static boolean withSpaceSuit = true;
	static float gravity = 0.38f;
	static float output;
	static String planet = "nowhere";

	public static void main(String args[]){
		
		output = weight;
		if (withSpaceSuit == true){
			output += 21;
		}
		output *= gravity;
		if (planet == "nowhere"){
			System.out.println("obviously, in the middle of nowhere, there is no gravity and you would weigh nothing. your mass however, will still be " + weight + " kg, no matter where you are");
		}
		else if (withSpaceSuit == true){
			System.out.println("You and your space suit would weigh " + output + "kg on " + planet);
		}
		else{
			System.out.println("You would weigh " + output + "kg on " + planet);
		}
		//}
	}
}
