package adapterPattern.solution;

public class AdapterPattern {
	public static void main(String[] args) {
		
		Vehicle c = new Car();
		c.accelerate();
		c.pushbreak();
		c.soundhorn();
		
		System.out.println();
		
		Vehicle b = new BicycleAdapter(new Bicycle());
		b.accelerate();
		b.pushbreak();
		b.soundhorn();
	}
}
