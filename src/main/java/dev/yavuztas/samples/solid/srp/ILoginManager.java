package dev.yavuztas.samples.solid.srp;

import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

/**
 * Interface to make abstraction for different authentication implementations
 * 
 * @author Yavuz Tas
 *
 */
public interface ILoginManager {

	public boolean isType(LoginType type);

	public void authenticate(User user);

}
