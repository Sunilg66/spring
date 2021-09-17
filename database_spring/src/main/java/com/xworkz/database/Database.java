package com.xworkz.database;

public class Database {
	private String url;
	private String username;
	private String password;

	public Database(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
