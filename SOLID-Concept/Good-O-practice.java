// this code demonstrates how to correctly design classes to follow the Open/Closed Principle (OCP)
// which states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
// This means that we should be able to add new functionality to our code without changing existing code
interface Shape {
	void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		// Code to draw a rectangle
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		// Code to draw a circle
	}
}

class Triangle implements Shape {
	@Override
	public void draw() {
		// Code to draw a triangle
	}
}
