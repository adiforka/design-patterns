package design_patterns.prototype;

public class Triangle extends Shape {

    public Triangle() {
        type = "triangle";
    }

    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}
