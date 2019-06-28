package dev.yavuztas.samples.solid.lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * An example to demonstrate liskov substitution principle
 * 
 * @author Yavuz Tas
 *
 */
public class FishingPool {

	public class Fish {
		public void swim() {
			System.out.println("I'm swimming");
		}
	}

	public interface Alive {
		public void swim();
	}

	public interface Dead {
		public void sink();
	}

	public class AliveFish extends Fish implements Alive {

		@Override
		public void swim() {
			System.out.println("I'm swimming because I'm alive :)");
		}

	}

	public class DeadFish extends Fish implements Dead {

		@Override
		public void swim() {
			System.out.println("Cannot swim because I'm dead!");
		}

		public void sink() {
			System.out.println("I'm sinking :(");
		}
	}

	private List<Alive> pool = new ArrayList<>();

	public FishingPool() {

		// Assume that we need a fishing pool which every Fish instance must swim.
		// However some instances may not be able to swim because they are dead.
		// So we need only alive fish for our fishing pool.
		// By discriminating the behaviours by interfaces, we are now sure that every
		// Fish instance in our pool can swim!
		pool.add(new AliveFish());
		pool.add(new AliveFish());
		pool.add(new AliveFish());
		// compilation error prevents us to add DeadFish instances by mistake!
		// pool.add(new DeadFish());

	}

	public void letThemSwim() {

		for (Alive fish : pool) {
			fish.swim();
		}

	}

}
