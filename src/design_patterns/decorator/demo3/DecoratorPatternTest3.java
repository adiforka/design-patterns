package design_patterns.decorator.demo3;

public class DecoratorPatternTest3 {
    public static void main(String[] args) {

        Shape shape = new Triangle();
        ShapeDecorator shapeDecorator = new TriangleDecorator(shape);
        shapeDecorator.draw();

        Shape shape2 = new Rectangle();
        ShapeDecorator shapeDecorator2 = new RectangleDecorator(shape2);
        shapeDecorator2.draw();
    }
}

interface Shape {

    void draw();

    String toString();
}

class Triangle implements Shape {

    public Triangle() {
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }

}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }
}

abstract class ShapeDecorator {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public abstract void draw();
}

class TriangleDecorator extends ShapeDecorator {

    public TriangleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        this.colorShape(decoratedShape);
    }

    private void colorShape(Shape decoratedShape) {
        System.out.println("Coloring shape: " + decoratedShape.toString());
    }
}

class RectangleDecorator extends ShapeDecorator {

    public RectangleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        this.colorShape(decoratedShape);
    }

    private void colorShape(Shape decoratedShape) {
        System.out.println("Coloring shape: " + decoratedShape.toString());
    }
}