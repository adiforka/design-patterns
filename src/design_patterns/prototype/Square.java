package design_patterns.prototype;

public class Square extends Shape {

    public Square() {
        type = "triangle";
    }

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}