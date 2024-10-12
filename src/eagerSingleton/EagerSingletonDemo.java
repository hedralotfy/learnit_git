package eagerSingleton;

public class EagerSingletonDemo {

	public static void main(String[] args) {
		
		//Once the objects of the class LetterSingleton
		// is called, the items of the list are shuffled.
		// because the getInstance() method is static, it will return a reference to the object.
		EagerSingletonLetterShuffle ES1 = EagerSingletonLetterShuffle.instance;
		//An object is already created, so the method won't make another object.
		EagerSingletonLetterShuffle LS2 = EagerSingletonLetterShuffle.instance;
		
		System.out.println(ES1.hashCode());
		ES1.printData();
		System.out.println(LS2.hashCode());
		LS2.printData();

	}

}
