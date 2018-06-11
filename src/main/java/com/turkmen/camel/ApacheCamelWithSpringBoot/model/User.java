/**
 * 
 */
package com.turkmen.camel.ApacheCamelWithSpringBoot.model;

/**
 * @author TTTDEMIRCI
 *
 */
public class User {

	private Long id;
	private String name;
	private String surname;
	
	
	

	public User(Long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
