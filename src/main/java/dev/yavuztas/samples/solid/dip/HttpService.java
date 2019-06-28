package dev.yavuztas.samples.solid.dip;

/**
 * Dummy http service implementation
 * 
 * @author Yavuz Tas
 *
 */
public class HttpService implements IService {

	@Override
	public void start() {

		System.out.println("Starting httpd service...");

	}

}
