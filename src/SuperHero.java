import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
/**
 * @author: Karan Sharma
 * @description: Build and Implement the SuperHero class which is the sub class of the Hero superclass
 *               to randomly generate super powers.
 *@version: February 4, 2015
 *
 */
public class SuperHero extends Hero {

	// PRIVATE PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private String[] superPower = new String[3];
  
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * This constructor initiates the class and generate the hero power with the name given by the user
	 * also call the generateRandomPower method
	 * @param name The name of Super Hero
	 */
	public SuperHero(String name) {
		super(name);
		generateRandomPowers();
	}

	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * This method randomly generates 3 random super powers from the six powers
	 * and adds them to the superPower array and remove that power from the arrayList
	 */
	private void generateRandomPowers(){
		
	// creating String ArrayList of name powerList and adding super powers of the hero in the array list
        ArrayList<String> powerList = new ArrayList<String>();
		powerList.add("Super Speed");
		powerList.add("Super Strength");
		powerList.add("Body Armour");
		powerList.add("Flight");
		powerList.add("Fire Generation");
		powerList.add("Weather Control");
		
	// generating random number 
		Random rand = new Random();
	
		// creating for loop three times to pick random powers and remove the selected power each time
		for(int i=0; i<3 ; i++){
		
		// pick the random power from the arraylist
		int index = rand.nextInt(powerList.size());
	
		// set the value of selected power in the array
		this.superPower[i] = powerList.get(index);
		
		// removing selected power from the arraylist
		 powerList.remove(index);
		}
	}
	
	
}
