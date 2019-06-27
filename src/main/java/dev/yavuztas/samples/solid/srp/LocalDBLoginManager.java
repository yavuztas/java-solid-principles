package dev.yavuztas.samples.solid.srp;

import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

/**
 * Login manager implementation for authenticating user from a local db.
 * Authenticate method is assumed to be implemented here...
 * 
 * @author Yavuz Tas
 *
 */
public class LocalDBLoginManager implements ILoginManager {

	@Override
	public boolean isType(LoginType type) {
		return LoginType.LOCAL_DB.equals(type);
	}

	@Override
	public void authenticate(User user) {

		// authenticating user from local db

	}

}
