package solid.liskovSubstitution;

public class Sparrow extends Bird implements Fly {
	
	@Override
	public void layEggs() {
		System.out.println("Sparrow can lay eggs");
	}
	
	@Override
	public void canFly() {
		System.out.println("Sparrow can fly");
	}

}
