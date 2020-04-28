package design_patterns.prototype;

public class Circle extends Shape {

    public Circle() {
        type = "triangle";
    }

    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}