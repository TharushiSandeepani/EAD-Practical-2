// this code demonstrates a bad practice of open closed principle (OCP) 
// where the classes are not designed to be open for extension but closed for modification.
// this can lead to issues when we need to add new shapes in the future, as we

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