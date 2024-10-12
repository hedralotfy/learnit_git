package eagerSingleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class EagerSingletonLetterShuffle {
	


		public String[] letters = {"a","b","c","d","e"};
		
		public List<String> letList = Arrays.asList(letters);
		public static EagerSingletonLetterShuffle instance = new EagerSingletonLetterShuffle();
		
		//Creating an instance not using a getter method and using public access
		// modifier for the static reference of the instance is called Eager singleton.
		
		/*To make singleton pattern there should be things to be followed, starting with:
		 * 
		 * 1-Making the constructor private
		 * 2-Make an instance and object in one line.
		 */
//		public LetterSingleton() {
//			Collections.shuffle(letList);
//		}
		private EagerSingletonLetterShuffle() {
			Collections.shuffle(letList);
		}
		
		//In eager singleton, we make an instance and object in one line.
		//We will make the instance public, just to access the object reference
		// which is made in the class out of the class.
		//We will deal with the class object through the public reference.
		
		public void printData() {
			for(String letter: letters) {
				System.out.print(letter + " ");
			}
			System.out.println();
		}
	

}
