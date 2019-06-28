package dev.yavuztas.samples.solid.ocp;

import dev.yavuztas.samples.solid.ocp.model.ModificationType;

/**
 * Interface to make abstraction for different modifier implementations
 * 
 * @author Yavuz Tas
 *
 */
public interface IModifier {

	public boolean canModify(ModificationType type);

	public boolean modify(ModificationType type);

}
