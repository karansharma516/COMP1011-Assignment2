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

}