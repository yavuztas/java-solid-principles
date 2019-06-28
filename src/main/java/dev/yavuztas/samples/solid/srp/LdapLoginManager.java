package dev.yavuztas.samples.solid.srp;

import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

/**
 * Login manager implementation for authenticating user from ldap. Authenticate
 * method is assumed to be implemented here...
 * 
 * @author Yavuz Tas
 *
 */
public class LdapLoginManager implements ILoginManager {

	@Override
	public boolean isType(LoginType type) {
		return LoginType.LDAP.equals(type);
	}

	@Override
	public void authenticate(User user) {

		System.out.println("Authenticating user from ldap...");
		System.out.println(user + " authenticated.");

	}

}
