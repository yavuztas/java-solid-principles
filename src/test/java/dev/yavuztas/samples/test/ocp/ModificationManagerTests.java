package dev.yavuztas.samples.test.ocp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dev.yavuztas.samples.solid.ocp.ModificationManager;
import dev.yavuztas.samples.solid.ocp.model.ModificationType;

public class ModificationManagerTests {

	private ModificationManager modificationManager;

	@Before
	public void setup() {

		modificationManager = new ModificationManager();

		System.out.println("---------------------------------");

	}

	@Test
	public void lessModifierTest() {

		boolean isSystemModified = modificationManager.modifySystem(ModificationType.LESS);
		Assert.assertTrue(isSystemModified);

	}

	@Test
	public void mediumModifierTest() {

		boolean isSystemModified = modificationManager.modifySystem(ModificationType.MEDIUM);
		Assert.assertTrue(isSystemModified);

	}

	@Test
	public void quiteModifierTest() {

		boolean isSystemModified = modificationManager.modifySystem(ModificationType.QUITE);
		Assert.assertTrue(isSystemModified);

	}

	@Test
	public void enormousModifierTest() {

		boolean isSystemModified = modificationManager.modifySystem(ModificationType.ENORMOUS);
		Assert.assertTrue(isSystemModified);

	}

}
