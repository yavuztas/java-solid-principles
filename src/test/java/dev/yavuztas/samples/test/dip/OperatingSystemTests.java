package dev.yavuztas.samples.test.dip;

import org.junit.Before;
import org.junit.Test;

import dev.yavuztas.samples.solid.dip.OperatingSystem;

public class OperatingSystemTests {

	private OperatingSystem operatingSystem;

	@Before
	public void setup() {

		operatingSystem = new OperatingSystem();

		System.out.println("---------------------------------");

	}

	@Test
	public void runOnStartupTest() {

		operatingSystem.runOnStartup();

	}

}
