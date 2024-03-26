package com.springassignment.solution5;

public class Session {
	
	private int id;
	private String name;
	private int trainerId;
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
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerID(int trainerId) {
		this.trainerId = trainerId;
	}
	@Override
	public String toString() {
		return "Session [id=" + id + ", name=" + name + ", trainerId=" + trainerId + "]";
	}

}
