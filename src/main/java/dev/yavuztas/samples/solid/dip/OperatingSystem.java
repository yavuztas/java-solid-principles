package dev.yavuztas.samples.solid.dip;

import java.util.ArrayList;
import java.util.List;

/**
 * An example to show a way of using dependency inversion principle
 * 
 * @author Yavuz Tas
 *
 */
public class OperatingSystem {

	private List<IService> services = new ArrayList<>();

	public OperatingSystem() {

		register(new HttpService());
		register(new SmtpService());

	}

	public void register(IService service) {
		this.services.add(service);
	}

	public void runOnStartup() {
		this.services.forEach(s -> s.start());
	}

}
