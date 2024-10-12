package factoryPattern;

public class EnemyFactory {

	public final static int TURTLE = 1;
	public final static int FROG = 2;
	
	public static Enemy createEnemy(int id) {
		
		switch(id) {
			case TURTLE:
				return new Turtle();
			case FROG:
				return new Frog();
			default:
				return null;	
		}
	}
}
