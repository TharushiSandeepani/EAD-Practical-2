//this code demonstrate the bad practice of Liskov Substitution Principle (LSP)
// where the subclasses are not designed to be replaceable with their parent class without affecting the correctness
// of the program. This can lead to issues when we need to use the subclasses 
// in place of their parent class, as they may not have the same behavior or functionality.

class Rectangle{
    void drawRectangle() {
        // code to draw a rectangle
    }
}

class Circle{
    void drawCircle() {
        // code to draw a circle
    }
}  