package dev.yavuztas.samples.solid.ocp;

import java.util.ArrayList;
import java.util.List;

import dev.yavuztas.samples.solid.ocp.model.ModificationType;

/**
 * An ideal implementation that shows one of the ways to apply open closed
 * principle. Different modification types divided into different responsible
 * classes.
 * 
 * @author Yavuz Tas
 *
 */
public class ModificationManager {

	private List<IModifier> modifiers = new ArrayList<>();

	public ModificationManager() {

		// new modifier implementations can be easily added without touching the rest of
		// the code
		modifiers.add(new LessModifier());
		modifiers.add(new MediumModifier());
		modifiers.add(new QuiteModifier());
		modifiers.add(new EnormousModifier());

	}

	public boolean modifySystem(ModificationType type) {

		for (IModifier modifier : modifiers) {
			// each modifier instance knows that they can modify it or just skip internally
			// and returns the result as boolean
			if (modifier.modify(type)) {
				return true;
			}
		}

		// it seems no modification is done
		return false;

	}

}
