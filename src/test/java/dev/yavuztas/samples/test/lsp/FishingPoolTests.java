package dev.yavuztas.samples.test.lsp;

import org.junit.Before;
import org.junit.Test;

import dev.yavuztas.samples.solid.lsp.FishingPool;

public class FishingPoolTests {

	private FishingPool fishingPool;

	@Before
	public void setup() {

		fishingPool = new FishingPool();

		System.out.println("---------------------------------");

	}

	@Test
	public void letThemSwimTest() {

		fishingPool.letThemSwim();

	}

}
