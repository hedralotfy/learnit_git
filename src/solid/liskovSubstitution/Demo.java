package solid.liskovSubstitution;

public class Demo {

	public static void main(String[] args) {
		Bird sb = new Sparrow();
		sb.layEggs();
		
		Bird p = new Penguin();
		p.layEggs();
		
		Fly s = new Sparrow();
		s.canFly();
		

	}

}
