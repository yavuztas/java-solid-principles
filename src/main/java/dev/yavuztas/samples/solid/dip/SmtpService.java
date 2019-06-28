package dev.yavuztas.samples.solid.dip;

/**
 * Dummy smtp service implementation
 * 
 * @author Yavuz Tas
 *
 */
public class SmtpService implements IService {

	@Override
	public void start() {

		System.out.println("Starting smtp service...");

	}

}
