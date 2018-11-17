package com.ashna.oops;

public class Line extends Shape {

	float lengthline;

	public Line(float length) {

		this.lengthline = length;

	}

	@Override
	public void draw() {

		System.out.println("The area cannot be calculated ");
		System.out.println("The perimeter cannot be calculated ");

	}

}
