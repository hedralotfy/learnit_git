package singleton;
//												THIS IS LAZY SINGLETON
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class LetterSingleton {

	public String[] letters = {"a","b","c","d","e"};
	
	public List<String> letList = Arrays.asList(letters);
	private static LetterSingleton instance;
	
	/*To make singleton pattern there should be things to be followed, starting with:
	 * 
	 * 1-Making the constructor private
	 * 2-Instantiating a private static instance of the class.
	 * 3-Creating a public method called getInstance(), in which we
	 * will create an object of the class using the static instance reference. 
	 */
	
	//Creation of an instance using a static getter method is called lazy singleton.
//	public LetterSingleton() {
//		Collections.shuffle(letList);
//	}
	private LetterSingleton() {
		Collections.shuffle(letList);
	}
	
	
	public static LetterSingleton getInstance() {
		if(instance == null) {
			instance = new LetterSingleton();
		}
		return instance;
	}
	
	public void printData() {
		for(String letter: letters) {
			System.out.print(letter + " ");
		}
		System.out.println();
	}
}