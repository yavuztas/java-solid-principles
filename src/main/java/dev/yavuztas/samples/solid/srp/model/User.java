package dev.yavuztas.samples.solid.srp.model;

/**
 * Sample user model for authentication
 * 
 * @author Yavuz Tas
 *
 */
public class User {

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
