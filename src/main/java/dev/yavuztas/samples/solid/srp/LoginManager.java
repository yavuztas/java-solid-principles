package dev.yavuztas.samples.solid.srp;

import java.util.ArrayList;
import java.util.List;

import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

/**
 * This is an ideal implementation of single responsibility principle. It is
 * seen that all different authentication method separated to different classes.
 * 
 * @author Yavuz Tas
 *
 */
public class LoginManager {

	private List<ILoginManager> loginManagers = new ArrayList<>();

	public LoginManager() {

		// registering our manager implementations
		loginManagers.add(new LocalDBLoginManager());
		loginManagers.add(new RemoteDBLoginManager());
		loginManagers.add(new LdapLoginManager());
		loginManagers.add(new SocialLoginManager());

	}

	public ILoginManager getManager(LoginType type) {
		for (ILoginManager manager : loginManagers) {
			// every instance of login manager knows that it can or cannot handle the given
			// type
			if (manager.isType(type)) {
				return manager;
			}
		}
		return null;
	}

	public void authenticate(User user, LoginType type) {
		// getManager method returns the right implementation according to login type we
		// need
		ILoginManager loginManager = getManager(type);
		loginManager.authenticate(user);
	}

}
