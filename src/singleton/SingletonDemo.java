package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		//Once the objects of the class LetterSingleton
		// is called, the items of the list are shuffled.
		// because the getInstance() method is static, it will return a reference to the object.
		
		//We use this type of singleton pattern, and it's called lazy when we only need specific
		//thing from the class.
		LetterSingleton LS1 = LetterSingleton.getInstance();
		//An object is already created in the method, so the method won't make another object,
		// as the reference has no null values and that's because it's static.
		LetterSingleton LS2 = LetterSingleton.getInstance();
		
		System.out.println(LS1.hashCode());
		LS1.printData();
		System.out.println(LS2.hashCode());
		LS2.printData();

	}

}
