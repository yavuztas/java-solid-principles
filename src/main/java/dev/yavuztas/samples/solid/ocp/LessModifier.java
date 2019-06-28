package dev.yavuztas.samples.solid.ocp;

import dev.yavuztas.samples.solid.ocp.model.ModificationType;

/**
 * Modifier implementation that does modification in less scale, just assume the
 * modify method was implemented as needed...
 * 
 * @author Yavuz Tas
 *
 */
public class LessModifier implements IModifier {

	private static final String className = LessModifier.class.getSimpleName();

	@Override
	public boolean canModify(ModificationType type) {
		return ModificationType.LESS.equals(type);
	}

	@Override
	public boolean modify(ModificationType type) {

		if (!canModify(type)) {
			System.out.println(className + ": cannot modify type " + type + ", skipping silently...");
			return false;
		}

		System.out.println(className + ": doing less modification :)");
		System.out.println(className + ": modification is done");
		return true;

	}

}
