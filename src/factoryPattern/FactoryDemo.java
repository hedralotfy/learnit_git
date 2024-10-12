package factoryPattern;

import java.util.Random;

public class FactoryDemo {

	public static void main(String[] args) {
		
		int loop = 5;
		while(loop>0) {
			generateRandomEnemy(1,2).showUp();
			loop--;
		}

	}
	public static Enemy generateRandomEnemy(int minId, int maxId) {
		Random r = new Random();
		int randomId = r.nextInt(maxId) + minId;
		Enemy e = EnemyFactory.createEnemy(randomId);
		return e;
	}

}
