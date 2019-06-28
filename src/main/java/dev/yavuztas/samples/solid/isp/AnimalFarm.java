package dev.yavuztas.samples.solid.isp;

/**
 * An example to show interface segregation principle
 * 
 * @author Yavuz Tas
 *
 */
public class AnimalFarm {

	public interface Animal {
		// let this be just a marker interface
	}

	public interface CanSwim extends Animal {
		public void swim();
	}

	public interface CanFly extends Animal {
		public void fly();
	}

	public interface CanRun extends Animal {
		public void run();
	}

	// no need to implement unnecessary methods
	public class SwimmingAnimal implements CanSwim {

		@Override
		public void swim() {
			System.out.println("Oh it's swimming, I know how to swim :)");
		}
	}

}
