package dev.yavuztas.samples.solid.srp;

import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

/**
 * Login manager implementation for authenticating user from social networks.
 * Authenticate method is assumed to be implemented here...
 * 
 * @author Yavuz Tas
 *
 */
public class SocialLoginManager implements ILoginManager {

	@Override
	public boolean isType(LoginType type) {
		return LoginType.SOCIAL.equals(type);
	}

	@Override
	public void authenticate(User user) {

		// authenticating user from social networks

	}

}
