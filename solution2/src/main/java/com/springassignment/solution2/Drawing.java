package com.springassignment.solution2;

public class Drawing {
	
	String type;
	String color;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Drawing [type=" + type + ", color=" + color + "]";
	}
	

}
