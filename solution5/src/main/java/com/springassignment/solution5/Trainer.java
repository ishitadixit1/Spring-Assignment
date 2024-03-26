package com.springassignment.solution5;

import java.util.List;

public class Trainer {
	
	private int id;
	private String name;
	private String dob;
	private List<Session> sessions;
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", dob=" + dob + ", sessions=" + sessions + "]";
	}

}
