package dev.yavuztas.samples.solid.srp;

import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

/**
 * Login manager implementation for authenticating user from a remote db.
 * Authenticate method is assumed to be implemented here...
 * 
 * @author Yavuz Tas
 *
 */
public class RemoteDBLoginManager implements ILoginManager {

	@Override
	public boolean isType(LoginType type) {
		return LoginType.REMOTE_DB.equals(type);
	}

	@Override
	public void authenticate(User user) {

		System.out.println("Authenticating user from remote db...");
		System.out.println(user + " authenticated.");

	}

}
