package dev.yavuztas.samples.test.srp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dev.yavuztas.samples.solid.srp.ILoginManager;
import dev.yavuztas.samples.solid.srp.LdapLoginManager;
import dev.yavuztas.samples.solid.srp.LocalDBLoginManager;
import dev.yavuztas.samples.solid.srp.LoginManager;
import dev.yavuztas.samples.solid.srp.RemoteDBLoginManager;
import dev.yavuztas.samples.solid.srp.SocialLoginManager;
import dev.yavuztas.samples.solid.srp.model.LoginType;
import dev.yavuztas.samples.solid.srp.model.User;

public class LoginManagerTests {

	private User mockUser;
	private LoginManager loginManager;

	@Before
	public void setup() {

		mockUser = new User(1L, "mockUser");
		loginManager = new LoginManager();

		System.out.println("---------------------------------");

	}

	@Test
	public void localDbAuthenticationTest() {

		ILoginManager loginManagerImpl = loginManager.getManager(LoginType.LOCAL_DB);
		Assert.assertEquals(LocalDBLoginManager.class, loginManagerImpl.getClass());

		loginManager.authenticate(mockUser, LoginType.LOCAL_DB);

	}

	@Test
	public void remoteDbAuthenticationTest() {

		ILoginManager loginManagerImpl = loginManager.getManager(LoginType.REMOTE_DB);
		Assert.assertEquals(RemoteDBLoginManager.class, loginManagerImpl.getClass());

		loginManager.authenticate(mockUser, LoginType.REMOTE_DB);

	}

	@Test
	public void ldapDbAuthenticationTest() {

		ILoginManager loginManagerImpl = loginManager.getManager(LoginType.LDAP);
		Assert.assertEquals(LdapLoginManager.class, loginManagerImpl.getClass());

		loginManager.authenticate(mockUser, LoginType.LDAP);

	}

	@Test
	public void socialDbAuthenticationTest() {

		ILoginManager loginManagerImpl = loginManager.getManager(LoginType.SOCIAL);
		Assert.assertEquals(SocialLoginManager.class, loginManagerImpl.getClass());

		loginManager.authenticate(mockUser, LoginType.SOCIAL);

	}

}
