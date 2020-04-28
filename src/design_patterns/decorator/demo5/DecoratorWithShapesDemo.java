package design_patterns.decorator.demo5;

public class DecoratorWithShapesDemo {
    public static void main(String[] args) {

        ShapeDecorator shapeDecorator = new RedOutlineDecorator(new Triangle());
        shapeDecorator.draw();

        ShapeDecorator shapeDecorator1 = new RedOutlineDecorator(new Circle());
        shapeDecorator1.draw();
    }
}

interface Shape {

    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

abstract class ShapeDecorator {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /*this here in the abstract class so compiler will let me call it on a abstract-typed (formal type) variable (before JVM looks up
    the concrete implementation that the variable references (actual type)*/
    public void draw() {
        decoratedShape.draw();
    }

}

class RedOutlineDecorator extends ShapeDecorator {

    public RedOutlineDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        drawRedOutline();
    }

    public void drawRedOutline() {
        System.out.println("Drawing outline around decoratedShape");
    }
}
