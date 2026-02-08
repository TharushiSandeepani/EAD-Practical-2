// this code demonstrates how to correctly design classes to follow the Liskov Substitution Principle (LSP)
// which states that objects of a superclass should be replaceable with objects of a subclass without affecting
// the correctness of the program. This means that subclasses should be able to be used in place of their parent class without causing any issues.

interface Shape {
	void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		// Code to draw a rectangle
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		// Code to draw a square
	}
}