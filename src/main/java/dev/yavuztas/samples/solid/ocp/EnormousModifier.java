package dev.yavuztas.samples.solid.ocp;

import dev.yavuztas.samples.solid.ocp.model.ModificationType;

/**
 * Modifier implementation that does modification in enormous scale, just assume
 * the modify method was implemented as needed...
 * 
 * @author Yavuz Tas
 *
 */
public class EnormousModifier implements IModifier {

	private static final String className = EnormousModifier.class.getSimpleName();

	@Override
	public boolean canModify(ModificationType type) {
		return ModificationType.ENORMOUS.equals(type);
	}

	@Override
	public boolean modify(ModificationType type) {

		if (!canModify(type)) {
			System.out.println(className + ": cannot modify type " + type + ", skipping silently...");
			return false;
		}

		System.out.println(className + ": doing enormous modification >:O");
		System.out.println(className + ": modification is done");
		return true;

	}

}
