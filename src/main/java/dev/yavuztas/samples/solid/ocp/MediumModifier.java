package dev.yavuztas.samples.solid.ocp;

import dev.yavuztas.samples.solid.ocp.model.ModificationType;

/**
 * Modifier implementation that does modification in medium scale, just assume
 * the modify method was implemented as needed...
 * 
 * @author Yavuz Tas
 *
 */
public class MediumModifier implements IModifier {

	private static final String className = MediumModifier.class.getSimpleName();

	@Override
	public boolean canModify(ModificationType type) {
		return ModificationType.MEDIUM.equals(type);
	}

	@Override
	public boolean modify(ModificationType type) {

		if (!canModify(type)) {
			System.out.println(className + ": cannot modify type " + type + ", skipping silently...");
			return false;
		}

		System.out.println(className + ": doing medium modification :(");
		System.out.println(className + ": modification is done");
		return true;

	}

}
