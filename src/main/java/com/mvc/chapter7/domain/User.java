package com.mvc.chapter7.domain;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

@Repository
public class User implements Serializable {

	private static final long serialVersionUID = 6423882291665407349L;

	private int id;

	private String name;

	private String password;

	public User() {
	}

	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}

}
